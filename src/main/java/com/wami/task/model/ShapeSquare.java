package com.wami.task.model;

import lombok.Data;

import javax.validation.constraints.Positive;


@Data
public class ShapeSquare extends ShapeParent {

    @Positive
    private double length;

    public ShapeSquare() {
        super(EShapeType.SQUARE);
    }
}
