package com.wami.task.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = ShapeCircle.class, name = "circle"),
        @JsonSubTypes.Type(value = ShapeRectangle.class, name = "rectangle"),
        @JsonSubTypes.Type(value = ShapeSquare.class, name = "square"),
        @JsonSubTypes.Type(value = ShapeTriangle.class, name = "triangle"),
})
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ShapeParent {
    protected EShapeType type;

}
