package com.xlw.model.base.response;

/**
 * Created by levyx on 2016/9/2 0002.
 */
public class Response {
    public Response() {
    }

    public Response(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    private Integer status = 200;
    private String message = "OK";

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
