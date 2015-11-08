/**
 */
package SimplStateMachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimplStateMachine.BooleanData#isValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimplStateMachine.SimplStateMachinePackage#getBooleanData()
 * @model
 * @generated
 */
public interface BooleanData extends Data {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see SimplStateMachine.SimplStateMachinePackage#getBooleanData_Value()
	 * @model required="true"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link SimplStateMachine.BooleanData#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

} // BooleanData
