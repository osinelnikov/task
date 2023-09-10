package com.wami.task.controller;

import com.wami.task.model.ShapeParent;
import com.wami.task.model.ShapeResponse;
import com.wami.task.service.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;


@RestController
@RequestMapping("/")
@Validated
public class CalculatorController {

    @Autowired
    private Calculator calculator;

    @PostMapping("/calculate")
    @ResponseStatus(HttpStatus.OK)
    public ShapeResponse calculate(@RequestBody @Valid ShapeParent shape) {
        return new ShapeResponse(calculator.calculateArea(shape), calculator.calculatePerimeter(shape), new ArrayList<>());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ShapeResponse getErrors(MethodArgumentNotValidException e) {
        return new ShapeResponse("", "", calculator.getErrors(e));
    }
}
