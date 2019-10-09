package com.dsl.constraints.validator.validators;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = UniqueNameValidator.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueName
{
    String message() default "stock.name.duplicate";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

