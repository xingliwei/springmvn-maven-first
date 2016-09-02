package com.xlw.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xlw.test.Resource;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2016/8/26 0026.
 */
@Controller
public class Helloworld {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public @ResponseBody Resource hello(@RequestParam(value = "userId", required = true) String userId,HttpServletRequest request){
        request.setAttribute("message","hello springmvc-maven!");
        WebApplicationContext ac = ContextLoader.getCurrentWebApplicationContext();
        Resource resource = (Resource)ac.getBean("resource");
        System.out.println(resource.getJdbcUrl());
        System.out.println(userId);
        return resource;
    }

    @RequestMapping(value = "/hello1",method = RequestMethod.GET)
    public void hello1(@RequestParam(value = "userId", required = true) String userId,HttpServletRequest request,HttpServletResponse response){
        request.setAttribute("message","hello springmvc-maven!");
        WebApplicationContext ac = ContextLoader.getCurrentWebApplicationContext();
        Resource resource = (Resource)ac.getBean("resource");
        response.setContentType("application/json; charset=UTF-8");
        ObjectMapper mapper = new ObjectMapper();
        try {
            String value = mapper.writeValueAsString(resource);
            response.getWriter().print(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("hello2")
    public String hello2(HttpServletRequest request){
        request.setAttribute("message","十多块撒好看的身份");
        return "hello";
    }
}
