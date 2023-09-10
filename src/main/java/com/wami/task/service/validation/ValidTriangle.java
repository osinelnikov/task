package com.wami.task.service.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = TriangleValidator.class)
public @interface ValidTriangle {
    String message() default "Invalid triangle sides";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}