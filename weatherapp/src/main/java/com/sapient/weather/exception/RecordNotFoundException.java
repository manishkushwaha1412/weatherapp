package com.sapient.weather.exception;

import com.sapient.weather.vo.model.ExceptionVO;

public class RecordNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private ExceptionVO exceptionVO;

    private String message;

    public RecordNotFoundException() {

    }

    public RecordNotFoundException(String message) {
        this.message = message;
    }

    public RecordNotFoundException(ExceptionVO exceptionVO) {
        this.exceptionVO = exceptionVO;
    }

    public ExceptionVO getExceptionVO() {
        return exceptionVO;
    }

    public void setExceptionVO(ExceptionVO exceptionVO) {
        this.exceptionVO = exceptionVO;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
