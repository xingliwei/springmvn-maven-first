package com.xlw.exceptions;

import com.xlw.model.base.response.Response;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Administrator on 2016/9/2 0002.
 */
@ControllerAdvice
public class GlobalExceptionHandle {
    private static final Logger logger = Logger.getLogger(GlobalExceptionHandle.class);

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(UnsupportDeviceException.class)
    @ResponseBody
    public Response exception(UnsupportDeviceException e){
        Response response = new Response();
        response.setMessage(e.getMessage());
        response.setStatus(HttpStatus.BAD_REQUEST.value());
        return response;
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Response exception(Exception e){
        Response response = new Response();
        response.setMessage("后端错误！");
        response.setStatus(HttpStatus.BAD_REQUEST.value());
        return response;
    }
}
