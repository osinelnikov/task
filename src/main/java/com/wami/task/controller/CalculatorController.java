package com.wami.task.controller;

import com.wami.task.model.ShapeParent;
import com.wami.task.model.ShapeResponse;
import com.wami.task.service.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/")
@Validated
public class CalculatorController {

    public static final String ERRORS = "errors";

    @Autowired
    private Calculator calculator;

    @PostMapping("/calculate")
    @ResponseStatus(HttpStatus.OK)
    public ShapeResponse calculate(@RequestBody @Valid ShapeParent shape) {
        return new ShapeResponse(calculator.calculateArea(shape), calculator.calculatePerimeter(shape));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException e) {
        Map<String, List<String>> result = new HashMap<>();
        e.getAllErrors().forEach(error ->
                result.computeIfAbsent(ERRORS, v -> new ArrayList<>()).add(
                        error instanceof FieldError
                                ? ((FieldError) error).getField() + " " + Objects.requireNonNull(error.getDefaultMessage())
                                : error.getDefaultMessage()));
        return result.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> String.join(", ", entry.getValue())));
    }
}
