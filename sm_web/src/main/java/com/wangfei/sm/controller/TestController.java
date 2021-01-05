package com.wangfei.sm.controller;


import org.springframework.stereotype.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//  /test/*.do
@Controller("testController")

public class TestController {

//   /test/list.do  /show.jsp
    public void show(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("NAME","张三");
        request.setAttribute("SEX","male");

        request.getRequestDispatcher("../show.jsp").forward(request,response);
    }
}
