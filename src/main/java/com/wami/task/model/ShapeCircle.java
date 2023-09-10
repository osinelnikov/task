package com.wami.task.model;

import lombok.Data;

import javax.validation.constraints.PositiveOrZero;

@Data
public class ShapeCircle extends ShapeParent {
    @PositiveOrZero
    private double radius;

    public ShapeCircle() {
        super(EShapeType.CIRCLE);
    }
}
