package com.sapient.weather.vo.model;

/**
 * ExceptionVO class holds status, message and request flight
 * this is just a format which will be returned if no record found exception occurs
 *
 * @author MKushwaha
 */
public class ExceptionVO {

    private String status;
    private String message;
    private Object request;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getRequest() {
        return request;
    }

    public void setRequest(Object request) {
        this.request = request;
    }
}
