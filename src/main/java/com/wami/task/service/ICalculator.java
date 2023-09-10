package com.wami.task.service;

import com.wami.task.model.EShapeType;
import com.wami.task.model.ShapeParent;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

@Service
public interface ICalculator<T extends ShapeParent> {
    EShapeType getShapeType();
    double calculateArea(T shape);
    double calculatePerimeter(T shape);

    default String round(double value) {
        return new DecimalFormat("#.##").format(value);
    }
}
