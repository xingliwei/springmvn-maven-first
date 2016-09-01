package com.xlw.controller;

import com.xlw.test.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2016/8/26 0026.
 */
@Controller
public class Helloworld {
    @RequestMapping("/hello")
    public String hello(HttpServletRequest request){
        request.setAttribute("message","hello springmvc-maven!");
        WebApplicationContext ac = ContextLoader.getCurrentWebApplicationContext();
        Resource resource = (Resource)ac.getBean("resource");
        System.out.println(resource.getJdbcUrl());
        return "hello";
    }
}
