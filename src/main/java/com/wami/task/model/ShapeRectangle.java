package com.wami.task.model;

import lombok.Data;

import javax.validation.constraints.Positive;

@Data
public class ShapeRectangle extends ShapeParent {
    @Positive
    private double length;

    @Positive
    private double width;

    public ShapeRectangle() {
        super(EShapeType.RECTANGLE);
    }
}
