/**
 * generated by Xtext
 */
package org.xtext.idm.projet.validation;

import SimplStateMachine.Assignment;
import SimplStateMachine.BooleanData;
import SimplStateMachine.BooleanVariable;
import SimplStateMachine.ExpressionElement;
import SimplStateMachine.IntegerData;
import SimplStateMachine.IntegerVariable;
import SimplStateMachine.SimplStateMachinePackage;
import SimplStateMachine.Variable;
import org.eclipse.xtext.validation.Check;
import org.xtext.idm.projet.validation.AbstractStateMachineValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class StateMachineValidator extends AbstractStateMachineValidator {
  @Check
  public void checkType(final Assignment a) {
    boolean _and = false;
    Variable _variable = a.getVariable();
    boolean _isInstance = IntegerVariable.class.isInstance(_variable);
    if (!_isInstance) {
      _and = false;
    } else {
      ExpressionElement _expression = a.getExpression();
      boolean _isInstance_1 = IntegerData.class.isInstance(_expression);
      boolean _not = (!_isInstance_1);
      _and = _not;
    }
    if (_and) {
      System.err.println("Type Error");
      this.error("Attention au type de la variable!!!", SimplStateMachinePackage.Literals.ASSIGNMENT__EXPRESSION);
    } else {
      boolean _and_1 = false;
      Variable _variable_1 = a.getVariable();
      boolean _isInstance_2 = BooleanVariable.class.isInstance(_variable_1);
      if (!_isInstance_2) {
        _and_1 = false;
      } else {
        ExpressionElement _expression_1 = a.getExpression();
        boolean _isInstance_3 = BooleanData.class.isInstance(_expression_1);
        boolean _not_1 = (!_isInstance_3);
        _and_1 = _not_1;
      }
      if (_and_1) {
        System.err.println("Type Error");
        this.error("Attention au type de la variable!!!", SimplStateMachinePackage.Literals.ASSIGNMENT__EXPRESSION);
      }
    }
  }
}
