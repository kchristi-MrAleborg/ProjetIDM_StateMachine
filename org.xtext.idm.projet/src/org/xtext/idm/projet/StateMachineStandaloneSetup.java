/*
 * generated by Xtext
 */
package org.xtext.idm.projet;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class StateMachineStandaloneSetup extends StateMachineStandaloneSetupGenerated{

	public static void doSetup() {
		new StateMachineStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
