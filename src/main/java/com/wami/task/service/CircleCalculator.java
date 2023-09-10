package com.wami.task.service;

import com.wami.task.model.EShapeType;
import com.wami.task.model.ShapeCircle;
import org.springframework.stereotype.Service;

@Service
public class CircleCalculator implements ICalculator<ShapeCircle> {
    @Override
    public EShapeType getShapeType() {
        return EShapeType.CIRCLE;
    }

    @Override
    public double calculateArea(ShapeCircle shape) {
        return Math.PI * shape.getRadius() * shape.getRadius();
    }

    @Override
    public double calculatePerimeter(ShapeCircle shape) {
        return Math.PI * shape.getRadius() * 2;
    }
}
