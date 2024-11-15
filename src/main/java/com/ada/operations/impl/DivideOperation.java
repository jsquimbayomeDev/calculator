package com.ada.operations.impl;

import com.ada.operations.ICalculatorOperation;

public class DivideOperation implements ICalculatorOperation {

    @Override
    public double execute(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("cannot divide by zero");
        }
        return a / b;
    }
}
