package org.example.CustomExceptions;

import java.io.IOException;

public class CustomException extends IOException {

    public String getCustomException() {
        return "Error is : " + super.getMessage() + " and it is in the line :" + super.getStackTrace()[0].getLineNumber();
    }
}
