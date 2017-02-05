package test.validation;

import javax.validation.GroupSequence;

@GroupSequence({InputValidationFirst.class,InputValidationSecond.class})
public interface InputValidationZOrder {

}
