package com.company.exceptions;

/**
 * Created by sonasargsyan on 2/22/20.
 */
public class UnpluggedDeviceException extends RuntimeException{
    public UnpluggedDeviceException(String errorMessage){
        super(errorMessage);
    }
}
