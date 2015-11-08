//Generated code from genCode.kmt

package generatedByKermeta;

import com.pauware.pauware_engine._Core.*;
import com.pauware.pauware_engine._Exception.*;
import com.pauware.pauware_engine._Java_EE.*;
import java.util.Scanner;


public class Feu_Tricolore implements Manageable{

	// Variables

	// UML state machine
	AbstractStatechart_monitor Gen_FeuTricolore_stateMachine;
	AbstractStatechart _Feu_Tricolore_Rouge;
	AbstractStatechart _Feu_Tricolore_Vert;
	AbstractStatechart _Feu_Tricolore_Jaune;

	// Creation of the state machine
	private void init_behavior() throws Statechart_exception {
		_Feu_Tricolore_Rouge = new Statechart("Rouge");
		_Feu_Tricolore_Rouge.inputState();

		_Feu_Tricolore_Vert = new Statechart("Vert");

		_Feu_Tricolore_Jaune = new Statechart("Jaune");


		// PauWare viewer:
		//com.pauware.pauware_view.PauWare_view pv = null;
		// uncomment the following line for launching the viewer
		//pv = new com.pauware.pauware_view.PauWare_view();

		// creation of the state machine
		Gen_FeuTricolore_stateMachine = new Statechart_monitor(_Feu_Tricolore_Rouge.xor(_Feu_Tricolore_Vert).xor(_Feu_Tricolore_Jaune),"Gen_Feu_Tricolore", AbstractStatechart_monitor.Show_on_system_out/*, pv*/);
	}

	// Add transitions and start the state machine
	public void start() throws Statechart_exception {

		// creation of the transitions between states
		Gen_FeuTricolore_stateMachine.fires("passeRouge", _Feu_Tricolore_Jaune, _Feu_Tricolore_Rouge);
		Gen_FeuTricolore_stateMachine.fires("passeVert", _Feu_Tricolore_Rouge, _Feu_Tricolore_Vert);
		Gen_FeuTricolore_stateMachine.fires("passeJaune", _Feu_Tricolore_Vert, _Feu_Tricolore_Jaune);

		Gen_FeuTricolore_stateMachine.start();
	}

		public void stop() throws Statechart_exception {
		Gen_FeuTricolore_stateMachine.stop();
	}

	//-----------
	// UML events
	//-----------

	public void evtPasseRouge() throws Statechart_exception {
		Gen_FeuTricolore_stateMachine.run_to_completion("passeRouge", AbstractStatechart_monitor.Compute_invariants);
	}

	public void evtPasseVert() throws Statechart_exception {
		Gen_FeuTricolore_stateMachine.run_to_completion("passeVert", AbstractStatechart_monitor.Compute_invariants);
	}

	public void evtPasseJaune() throws Statechart_exception {
		Gen_FeuTricolore_stateMachine.run_to_completion("passeJaune", AbstractStatechart_monitor.Compute_invariants);
	}

	//-------------------------
	// UML actions (activities)
	//-------------------------

	//-----------
	// UML guards
	//-----------

	// Constructor
	public Feu_Tricolore() throws Statechart_exception {
		//init_structure();
		init_behavior();
	}

	//-------------------------
	// State machine management
	//-------------------------

    public String async_current_state() {
        return Gen_FeuTricolore_stateMachine.async_current_state();
    }

    public String current_state() {
        return Gen_FeuTricolore_stateMachine.current_state();
    }

    public boolean in_state(String name) {
        return Gen_FeuTricolore_stateMachine.in_state(name);
    }

    public void to_state(String name) throws Statechart_exception {
        Gen_FeuTricolore_stateMachine.to_state(name);
    }

    public String name() {
        return Gen_FeuTricolore_stateMachine.name();
    }

    public String verbose() {
        return Gen_FeuTricolore_stateMachine.verbose();
    }

	// Main function
	public static void main(String args[]) {
        try {
			Feu_Tricolore ms = new Feu_Tricolore();
            ms.start();
            
            Scanner sc = new Scanner(System.in);
            String choice;
            do {
            	System.out.print("Enter 'passeRouge', 'passeVert', 'passeJaune' or 'end': ");
                choice = sc.nextLine();

				if (choice.equals("passeRouge")) {
					ms.evtPasseRouge();
				}
				if (choice.equals("passeVert")) {
					ms.evtPasseVert();
				}
				if (choice.equals("passeJaune")) {
					ms.evtPasseJaune();
				}

	        }while(! choice.equals("end"));
	            
	            ms.stop();
	            System.exit(0);
	        	                
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}