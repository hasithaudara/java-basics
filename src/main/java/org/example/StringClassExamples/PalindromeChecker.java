package org.example.StringClassExamples;

import org.example.CustomExceptions.CustomException;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner getInput = null;
                System.out.print("Enter the phrase :");
                getInput = new Scanner(System.in);

                String inputString = getInput.nextLine();
                boolean isValidInput = inputString.matches("[a-zA-Z]+");
                if (isValidInput && !inputString.trim().isEmpty()) {
                    StringBuffer inputPhrase = new StringBuffer(inputString);
                    inputPhrase.reverse();
                    String reversedString = inputPhrase.toString();
                    String ispalindromePhrase = isPalindrome(inputString, reversedString);
                    System.out.println(ispalindromePhrase);
                    System.out.println();
                } else {
                    throw new CustomException("Invalid input!! Please enter a valid input.");
                }

                System.out.println("Do you want to continue? (y/n)");

                getInput = new Scanner(System.in);
                String flag = getInput.next();

                if (!isContinue(flag)) {
                    break;
                }

            } catch (CustomException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }

    protected static String isPalindrome(String originalWord, String reversedWord) {
        if (originalWord.equals(reversedWord)) {
            return "Given is a Palindrome";
        } else {
            return "Given is not a Palindrome";
        }
    }

    protected static boolean isContinue(String inputValue) throws CustomException {
        if (inputValue.equals("y")) {
            return true;
        } else if (inputValue.equals("n")) {
            return false;
        } else {
            throw new CustomException("Invalid input!");
        }
    }
}
