package com.company.exceptions;

/**
 * Created by sonasargsyan on 2/22/20.
 */
public class UndefinedDeviceException extends RuntimeException {
    public UndefinedDeviceException(String errorMessage){
        super(errorMessage);
    }
}
