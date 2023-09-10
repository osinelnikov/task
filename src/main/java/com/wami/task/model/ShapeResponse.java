package com.wami.task.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ShapeResponse {
    private String area;
    private String perimeter;
    private List<String> errors;
}
