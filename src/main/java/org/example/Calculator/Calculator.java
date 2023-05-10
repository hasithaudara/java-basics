package org.example.Calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        while (true) {
            Scanner getInput = null;
            try {
                System.out.print("Enter first number :");
                getInput = new Scanner(System.in);

                String firstInput = getInput.next();
                Double firstValue = Double.parseDouble(firstInput);

                System.out.print("Enter second number :");
                getInput = new Scanner(System.in);

                String secondInput = getInput.next();
                Double secondValue = Double.parseDouble(secondInput);

                System.out.print("Enter your desired operation : (+,-,*,/)");
                getInput = new Scanner(System.in);

                String selectedOperation = getInput.next();

                process(selectedOperation, firstValue, secondValue);

                System.out.println("Do you want to continue for another calculation? (y/n)");

                getInput = new Scanner(System.in);
                String flag = getInput.next();

                if(!isContinue(flag)){
                    break;
                }

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                continue;
            }
        }
    }

    public static double add(double num_1, double num_2) {
        double result = 0;
        result = num_1 + num_2;
        return result;
    }

    public static double multiply(double num_1, double num_2) {
        double result = 0;
        result = num_1 * num_2;
        return result;
    }

    public static double subtract(double num_1, double num_2) {
        double result = 0;
        result = num_1 - num_2;
        return result;
    }

    public static double divide(double num_1, double num_2) {
        double result = 0;
        result = num_1 / num_2;
        return result;
    }

    public static void process(String operation, double firstValue, double secondValue) {
        switch (operation) {
            case "+":
                System.out.println(add(firstValue, secondValue));
                break;
            case "-":
                System.out.println(divide(firstValue, secondValue));
                break;
            case "*":
                System.out.println(multiply(firstValue, secondValue));
                break;
            case "/":
                System.out.println(subtract(firstValue, secondValue));
                break;
            default:
                System.out.println("Invalid Input");
        }
    }

    public static boolean isContinue(String inputValue) throws Exception {
        if (inputValue.equals("y")) {
            return true;
        } else if (inputValue.equals("n")) {
            return false;
        } else {
            throw new Exception("Invalid Input");
        }
    }
}
