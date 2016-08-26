package com.xlw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2016/8/26 0026.
 */
@Controller
public class Helloworld {
    @RequestMapping("hello")
    public String hello(HttpServletRequest request){
        request.setAttribute("message","hello springmvc-maven!");
        return "hello";
    }
}
