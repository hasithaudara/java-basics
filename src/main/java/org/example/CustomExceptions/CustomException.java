package org.example.CustomExceptions;

public class CustomException extends Exception {

    public String getCustomException() {
        return "Error is : " + super.getMessage() + " and it is in the line :" + super.getStackTrace()[0].getLineNumber();
    }
}
