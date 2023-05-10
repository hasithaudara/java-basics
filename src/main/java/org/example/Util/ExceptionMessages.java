package org.example.Util;

public enum ExceptionMessages {
    INVALID_CHARACTER_FOUND("Expected character values, Found numerics values as well");

    ExceptionMessages(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    private String exceptionMessage;

    public String getExceptionMessage() {
        return exceptionMessage;
    }
}
