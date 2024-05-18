package com.amalvadkar.ihms.common.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class AppException extends RuntimeException {

    private final HttpStatus httpStatus;

    private AppException(String message , HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    public static AppException from(String message , HttpStatus httpStatus){
        return new AppException(message , httpStatus);
    }


}
