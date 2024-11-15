package com.ada.validators;

import com.ada.exeptions.CalculatorException;

public class InputValidator {

    public static void validateNumber(String input) {
        try {
            Double.parseDouble(input);
        } catch (NumberFormatException e) {
            throw new CalculatorException("Entrada inválida: " + input);
        }
    }
}