package com.company.exceptions;

/**
 * Created by sonasargsyan on 2/22/20.
 */
public class IncorrectPowerException extends RuntimeException {

    public IncorrectPowerException(String errorMessage) {
        super(errorMessage);
    }
}
