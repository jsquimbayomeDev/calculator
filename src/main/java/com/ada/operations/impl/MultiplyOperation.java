package com.ada.operations.impl;

import com.ada.operations.ICalculatorOperation;

public class MultiplyOperation implements ICalculatorOperation {
    @Override
    public double execute(double a, double b) {
        return a * b;
    }
}
