package com.wami.task.service;

import com.wami.task.model.EShapeType;
import com.wami.task.model.ShapeSquare;
import org.springframework.stereotype.Service;

@Service
public class SquareCalculator implements ICalculator<ShapeSquare> {
    @Override
    public EShapeType getShapeType() {
        return EShapeType.SQUARE;
    }

    @Override
    public double calculateArea(ShapeSquare shape) {
        return shape.getLength() * shape.getLength();
    }

    @Override
    public double calculatePerimeter(ShapeSquare shape) {
        return shape.getLength() * 4;
    }
}
