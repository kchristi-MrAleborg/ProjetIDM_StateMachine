/**
 */
package SimplStateMachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimplStateMachine.Operation#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimplStateMachine.SimplStateMachinePackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link SimplStateMachine.Assignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see SimplStateMachine.SimplStateMachinePackage#getOperation_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Assignment> getContents();

} // Operation
