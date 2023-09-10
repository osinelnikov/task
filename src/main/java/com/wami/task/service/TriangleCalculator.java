package com.wami.task.service;

import com.wami.task.model.EShapeType;
import com.wami.task.model.ShapeTriangle;
import org.springframework.stereotype.Service;

@Service
public class TriangleCalculator implements ICalculator<ShapeTriangle> {
    @Override
    public EShapeType getShapeType() {
        return EShapeType.TRIANGLE;
    }

    @Override
    public double calculateArea(ShapeTriangle shape) {
        double s = (shape.getSideA() + shape.getSideB() + shape.getSideC()) / 2;
        return Math.sqrt(s * (s - shape.getSideA()) * (s - shape.getSideB()) * (s - shape.getSideC()));
    }

    @Override
    public double calculatePerimeter(ShapeTriangle shape) {
        return shape.getSideA() + shape.getSideB() + shape.getSideC();
    }
}
