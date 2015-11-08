//Generated code from genCode.kmt

package generatedByKermeta;

import com.pauware.pauware_engine._Core.*;
import com.pauware.pauware_engine._Exception.*;
import com.pauware.pauware_engine._Java_EE.*;
import java.util.Scanner;


public class Microwave implements Manageable{

	// Variables

	// UML state machine
	AbstractStatechart_monitor Gen_Microwave_stateMachine;
	AbstractStatechart _Microwave_Composite_Closed;
	AbstractStatechart _Closed_Off;
	AbstractStatechart _Closed_Baking;
	AbstractStatechart _Microwave_Composite_Open;
	AbstractStatechart _Open_Paused;
	AbstractStatechart _Open_Off;

	// Creation of the state machine
	private void init_behavior() throws Statechart_exception {
		_Closed_Off = new Statechart("Off");
		_Closed_Off.inputState();

		_Closed_Baking = new Statechart("Baking");

		_Open_Paused = new Statechart("Paused");

		_Open_Off = new Statechart("Off");
		_Open_Off.inputState();

		_Microwave_Composite_Closed=_Closed_Off.xor(_Closed_Baking).name("Closed");
		_Microwave_Composite_Closed.inputState();
		_Microwave_Composite_Open=_Open_Paused.xor(_Open_Off).name("Open");

		// PauWare viewer:
		//com.pauware.pauware_view.PauWare_view pv = null;
		// uncomment the following line for launching the viewer
		//pv = new com.pauware.pauware_view.PauWare_view();

		// creation of the state machine
		Gen_Microwave_stateMachine = new Statechart_monitor(_Microwave_Composite_Closed.xor(_Microwave_Composite_Open),"Gen_Microwave", AbstractStatechart_monitor.Show_on_system_out/*, pv*/);
	}

	// Add transitions and start the state machine
	public void start() throws Statechart_exception {

		// creation of the transitions between states
		Gen_Microwave_stateMachine.fires("Power", _Closed_Off, _Closed_Baking);
		Gen_Microwave_stateMachine.fires("Power", _Closed_Baking, _Closed_Off);
		Gen_Microwave_stateMachine.fires("DoorOpen", _Microwave_Composite_Closed, _Microwave_Composite_Open);
		Gen_Microwave_stateMachine.fires("DoorOpen", _Closed_Baking, _Open_Paused);
		Gen_Microwave_stateMachine.fires("DoorClosed", _Microwave_Composite_Open, _Microwave_Composite_Closed);
		Gen_Microwave_stateMachine.fires("DoorClosed", _Open_Paused, _Closed_Baking);

		Gen_Microwave_stateMachine.start();
	}

		public void stop() throws Statechart_exception {
		Gen_Microwave_stateMachine.stop();
	}

	//-----------
	// UML events
	//-----------

	public void evtPower() throws Statechart_exception {
		Gen_Microwave_stateMachine.run_to_completion("Power", AbstractStatechart_monitor.Compute_invariants);
	}

	public void evtDoorOpen() throws Statechart_exception {
		Gen_Microwave_stateMachine.run_to_completion("DoorOpen", AbstractStatechart_monitor.Compute_invariants);
	}

	public void evtDoorClosed() throws Statechart_exception {
		Gen_Microwave_stateMachine.run_to_completion("DoorClosed", AbstractStatechart_monitor.Compute_invariants);
	}

	//-------------------------
	// UML actions (activities)
	//-------------------------

	//-----------
	// UML guards
	//-----------

	// Constructor
	public Microwave() throws Statechart_exception {
		//init_structure();
		init_behavior();
	}

	//-------------------------
	// State machine management
	//-------------------------

    public String async_current_state() {
        return Gen_Microwave_stateMachine.async_current_state();
    }

    public String current_state() {
        return Gen_Microwave_stateMachine.current_state();
    }

    public boolean in_state(String name) {
        return Gen_Microwave_stateMachine.in_state(name);
    }

    public void to_state(String name) throws Statechart_exception {
        Gen_Microwave_stateMachine.to_state(name);
    }

    public String name() {
        return Gen_Microwave_stateMachine.name();
    }

    public String verbose() {
        return Gen_Microwave_stateMachine.verbose();
    }

	// Main function
	public static void main(String args[]) {
        try {
			Microwave ms = new Microwave();
            ms.start();
            
            Scanner sc = new Scanner(System.in);
            String choice;
            do {
            	System.out.print("Enter 'Power', 'DoorOpen', 'DoorClosed' or 'end': ");
                choice = sc.nextLine();

				if (choice.equals("Power")) {
					ms.evtPower();
				}
				if (choice.equals("DoorOpen")) {
					ms.evtDoorOpen();
				}
				if (choice.equals("DoorClosed")) {
					ms.evtDoorClosed();
				}

	        }while(! choice.equals("end"));
	            
	            ms.stop();
	            System.exit(0);
	        	                
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}