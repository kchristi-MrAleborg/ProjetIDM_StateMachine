/*
 * generated by Xtext
 */
package org.xtext.idm.projet.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.xtext.idm.projet.ui.internal.StateMachineActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class StateMachineExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return StateMachineActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return StateMachineActivator.getInstance().getInjector(StateMachineActivator.ORG_XTEXT_IDM_PROJET_STATEMACHINE);
	}
	
}
