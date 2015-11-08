//Generated code from genCode.kmt

package generatedByKermeta;

import com.pauware.pauware_engine._Core.*;
import com.pauware.pauware_engine._Exception.*;
import com.pauware.pauware_engine._Java_EE.*;
import java.util.Scanner;


public class Voiture implements Manageable{

	// Variables
	Integer vitesse;
	Boolean maxAtteint = false;

	// UML state machine
	AbstractStatechart_monitor Gen_Voiture_stateMachine;
	AbstractStatechart _Voiture_Arret;
	AbstractStatechart _Voiture_Composite_Marche;
	AbstractStatechart _Marche_MoinsVite;
	AbstractStatechart _Marche_PlusVite;
	AbstractStatechart _Marche_Maximum;

	// Creation of the state machine
	private void init_behavior() throws Statechart_exception {
		_Voiture_Arret = new Statechart("Arret");
		_Voiture_Arret.inputState();
		_Voiture_Arret.doActivity(this, "voiturearretActivity");

		_Marche_MoinsVite = new Statechart("MoinsVite");
		_Marche_MoinsVite.doActivity(this, "marchemoinsviteActivity");

		_Marche_PlusVite = new Statechart("PlusVite");
		_Marche_PlusVite.inputState();
		_Marche_PlusVite.doActivity(this, "marcheplusviteActivity");

		_Marche_Maximum = new Statechart("Maximum");
		_Marche_Maximum.doActivity(this, "marchemaximumActivity");

		_Voiture_Composite_Marche=_Marche_MoinsVite.xor(_Marche_PlusVite).xor(_Marche_Maximum).name("Marche");

		// PauWare viewer:
		//com.pauware.pauware_view.PauWare_view pv = null;
		// uncomment the following line for launching the viewer
		//pv = new com.pauware.pauware_view.PauWare_view();

		// creation of the state machine
		Gen_Voiture_stateMachine = new Statechart_monitor(_Voiture_Arret.xor(_Voiture_Composite_Marche),"Gen_Voiture", AbstractStatechart_monitor.Show_on_system_out/*, pv*/);
	}

	// Add transitions and start the state machine
	public void start() throws Statechart_exception {

		// creation of the transitions between states
		Gen_Voiture_stateMachine.fires("accelerer", _Voiture_Arret, _Voiture_Composite_Marche);
		Gen_Voiture_stateMachine.fires("ralentir", _Voiture_Composite_Marche, _Voiture_Arret, this, "guard_Marche_To_Arret");
		Gen_Voiture_stateMachine.fires("accelerer", _Voiture_Composite_Marche, _Marche_PlusVite, this, "guard_Marche_To_PlusVite");
		Gen_Voiture_stateMachine.fires("accelerer", _Voiture_Composite_Marche, _Marche_Maximum, this, "guard_Marche_To_Maximum");
		Gen_Voiture_stateMachine.fires("ralentir", _Voiture_Composite_Marche, _Marche_MoinsVite, this, "guard_Marche_To_MoinsVite");

		Gen_Voiture_stateMachine.start();
	}

		public void stop() throws Statechart_exception {
		Gen_Voiture_stateMachine.stop();
	}

	//-----------
	// UML events
	//-----------

	public void evtRalentir() throws Statechart_exception {
		Gen_Voiture_stateMachine.run_to_completion("ralentir", AbstractStatechart_monitor.Compute_invariants);
	}

	public void evtAccelerer() throws Statechart_exception {
		Gen_Voiture_stateMachine.run_to_completion("accelerer", AbstractStatechart_monitor.Compute_invariants);
	}

	//-------------------------
	// UML actions (activities)
	//-------------------------

	public void voiturearretActivity(){
		vitesse = 0;
	}

	public void marchemoinsviteActivity(){
		vitesse -= 10;
	}

	public void marcheplusviteActivity(){
		vitesse += 10;
	}

	public void marchemaximumActivity(){
		vitesse = 100;
		maxAtteint = true;
	}

	//-----------
	// UML guards
	//-----------

	public boolean guard_Marche_To_Arret() {
		return vitesse == 10;
	}

	public boolean guard_Marche_To_PlusVite() {
		return (vitesse >= 10) && (vitesse < 90);
	}

	public boolean guard_Marche_To_Maximum() {
		return vitesse == 90;
	}

	public boolean guard_Marche_To_MoinsVite() {
		return vitesse != 10;
	}

	// Constructor
	public Voiture() throws Statechart_exception {
		//init_structure();
		init_behavior();
	}

	//-------------------------
	// State machine management
	//-------------------------

    public String async_current_state() {
        return Gen_Voiture_stateMachine.async_current_state();
    }

    public String current_state() {
        return Gen_Voiture_stateMachine.current_state();
    }

    public boolean in_state(String name) {
        return Gen_Voiture_stateMachine.in_state(name);
    }

    public void to_state(String name) throws Statechart_exception {
        Gen_Voiture_stateMachine.to_state(name);
    }

    public String name() {
        return Gen_Voiture_stateMachine.name();
    }

    public String verbose() {
        return Gen_Voiture_stateMachine.verbose();
    }

	// Main function
	public static void main(String args[]) {
        try {
			Voiture ms = new Voiture();
            ms.start();
            
            Scanner sc = new Scanner(System.in);
            String choice;
            do {
            	System.out.print("Enter 'ralentir', 'accelerer' or 'end': ");
                choice = sc.nextLine();

				if (choice.equals("ralentir")) {
					ms.evtRalentir();
				}
				if (choice.equals("accelerer")) {
					ms.evtAccelerer();
				}

	        }while(! choice.equals("end"));
	            
	            ms.stop();
	            System.exit(0);
	        	                
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}