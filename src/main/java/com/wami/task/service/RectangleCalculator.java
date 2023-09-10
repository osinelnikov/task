package com.wami.task.service;

import com.wami.task.model.EShapeType;
import com.wami.task.model.ShapeRectangle;
import org.springframework.stereotype.Service;

@Service
public class RectangleCalculator implements ICalculator<ShapeRectangle> {
    @Override
    public EShapeType getShapeType() {
        return EShapeType.RECTANGLE;
    }

    @Override
    public double calculateArea(ShapeRectangle shape) {
        return shape.getLength() * shape.getWidth();
    }

    @Override
    public double calculatePerimeter(ShapeRectangle shape) {
        return (shape.getLength() + shape.getWidth()) * 2;
    }
}
