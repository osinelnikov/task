package com.wami.task.service.validation;

import com.wami.task.model.ShapeTriangle;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class TriangleValidator implements ConstraintValidator<ValidTriangle, ShapeTriangle> {
    @Override
    public boolean isValid(ShapeTriangle shape, ConstraintValidatorContext constraintValidatorContext) {
        return shape.getSideA() + shape.getSideB() > shape.getSideC()
                && shape.getSideA() + shape.getSideC() > shape.getSideB()
                && shape.getSideB() + shape.getSideC() > shape.getSideA();
    }
}
