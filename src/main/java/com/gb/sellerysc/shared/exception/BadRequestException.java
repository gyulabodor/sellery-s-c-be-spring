package com.gb.sellerysc.shared.exception;

public class BadRequestException extends Exception{

    public BadRequestException(){}
    public BadRequestException(String message){
        super(message);
    }
    public BadRequestException(String message, Throwable cause) {
        super(message, cause);
    }
    public BadRequestException(Throwable cause) {
        super(cause);
    }
    protected BadRequestException(String message, Throwable cause,
                                  boolean enableSuppression,
                                  boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
