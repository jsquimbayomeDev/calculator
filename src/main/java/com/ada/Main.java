package com.ada;

import com.ada.exeptions.CalculatorException;
import com.ada.models.Operation;
import com.ada.services.CalculatorService;
import com.ada.validators.InputValidator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorService();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Please select a operation: ADD, SUBTRACT, MULTIPLY, DIVIDE, SQUARE_ROOT");
            String operationInput = scanner.nextLine().toUpperCase();

            if (operationInput.equals("SQUARE_ROOT")) {
                System.out.print("Ingrese un número: ");
                String input = scanner.nextLine();
                InputValidator.validateNumber(input);
                double number = Double.parseDouble(input);
                double result = calculatorService.calculateSquareRoot(number);
                System.out.println("Resultado: " + result);
            } else {
                Operation operation = Operation.valueOf(operationInput);

                System.out.print("input the first number: ");
                String input1 = scanner.nextLine();
                InputValidator.validateNumber(input1);
                double num1 = Double.parseDouble(input1);

                System.out.print("input the second number: ");
                String input2 = scanner.nextLine();
                InputValidator.validateNumber(input2);
                double num2 = Double.parseDouble(input2);

                double result = calculatorService.performOperation(operation, num1, num2);
                System.out.println("Result: " + result);
            }
        } catch (CalculatorException | IllegalArgumentException e) {
            System.out.println("err: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}