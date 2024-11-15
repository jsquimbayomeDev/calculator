package com.ada.operations.impl;

import com.ada.operations.ICalculatorOperation;

public class SquareRootOperation implements ICalculatorOperation {
    @Override
    public double execute(double a, double b) {
        if (a < 0) {
            throw new IllegalArgumentException("can´t be negative");
        }
        return Math.sqrt(a);
    }
}
