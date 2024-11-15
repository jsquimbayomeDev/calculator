package com.ada.services;

import com.ada.exeptions.CalculatorException;
import com.ada.models.Operation;
import com.ada.operations.ICalculatorOperation;
import com.ada.operations.impl.SquareRootOperation;

import static com.ada.models.Operation.ADD;

public class CalculatorService {


    public double performOperation(Operation operation, double a, double b) {
        switch (operation) {
            case ADD:
                return a + b;
            case SUBTRACT:
                return a - b;
            case MULTIPLY:
                return a * b;
            case DIVIDE:
                if (b == 0) throw new CalculatorException("can't divide by zero.");
                return a / b;
            default:
                throw new CalculatorException("Unknown operation.");
        }
    }

    public double calculateSquareRoot(double a) {
        if (a < 0) throw new CalculatorException("can't calculate square  a negative value");
        return Math.sqrt(a);
    }
}
