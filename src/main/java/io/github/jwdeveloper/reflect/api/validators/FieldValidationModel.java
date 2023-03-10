package io.github.jwdeveloper.reflect.api.validators;

import io.github.jwdeveloper.reflect.api.matcher.ParameterMatcher;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Data
@EqualsAndHashCode(callSuper=false)
public class FieldValidationModel extends ValidationModel {
    private Class<?> parentClass;
    private Class<?> classType;

    private Consumer<ValidationResult<Field>> onFound;
    private ParameterMatcher parameterMatcher = (a) -> {
        return a;
    };
    private List<String> generics = new ArrayList<>();

    public boolean hasType() {
        return classType != null;
    }
}
