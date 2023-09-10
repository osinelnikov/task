package com.wami.task.service;

import com.wami.task.model.EShapeType;
import com.wami.task.model.ShapeParent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class Calculator {

    private Map<EShapeType, ICalculator> calculators;

    @Autowired
    public void setCalculators(List<ICalculator> calculators) {
        this.calculators = calculators.stream().collect(Collectors.toMap(ICalculator::getShapeType, c -> c));
    }

    public String calculateArea(ShapeParent shape) {
        ICalculator calculator = defineCalculator(shape.getType());
        return calculator.round(calculator.calculateArea(shape));
    }

    public String calculatePerimeter(ShapeParent shape) {
        ICalculator calculator = defineCalculator(shape.getType());
        return calculator.round(calculator.calculatePerimeter(shape));
    }

    public List<String> getErrors(MethodArgumentNotValidException e) {
        return e.getAllErrors()
                .stream()
                .map(error ->
                        error instanceof FieldError
                                ? ((FieldError) error).getField() + " " + Objects.requireNonNull(error.getDefaultMessage())
                                : error.getDefaultMessage()).toList();
    }

    private ICalculator defineCalculator(EShapeType shapeType) {
        return Optional.ofNullable(calculators.get(shapeType))
                .orElseThrow(() -> new RuntimeException("Couldn't find calculator for Shape ".concat(shapeType.name())));
    }
}
