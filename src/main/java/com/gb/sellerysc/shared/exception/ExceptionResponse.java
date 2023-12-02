package com.gb.sellerysc.shared.exception;

import org.springframework.http.HttpStatus;

import java.util.List;

public class ExceptionResponse {
    private HttpStatus status;
    private String message;
    private List<ValidationError> validationErrors;
    public ExceptionResponse(){}
    public ExceptionResponse(HttpStatus status, String message){
        this.status=status;
        this.message=message;
    }

    public ExceptionResponse(HttpStatus status, String message, List<ValidationError> validationErrors){
        this.status=status;
        this.message=message;
        this.validationErrors=validationErrors;
    }
    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ValidationError> getValidationErrors() {
        return validationErrors;
    }

    public void setValidationErrors(List<ValidationError> validationErrors) {
        this.validationErrors = validationErrors;
    }
}