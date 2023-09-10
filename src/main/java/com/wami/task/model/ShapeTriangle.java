package com.wami.task.model;

import com.wami.task.service.validation.ValidTriangle;
import lombok.Data;

import javax.validation.constraints.Positive;

@Data
@ValidTriangle
public class ShapeTriangle extends ShapeParent {

    @Positive
    private double sideA;

    @Positive
    private double sideB;

    @Positive
    private double sideC;

    public ShapeTriangle() {
        super(EShapeType.TRIANGLE);
    }
}
