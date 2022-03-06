package com.example.javawebdemo.liuerpnag.servle_test02;

import javax.naming.Context;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class servlet_configtextdemo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext Context = getServletContext();
        System.out.println(Context.getInitParameter("context"));
        System.out.println(Context.getContextPath());
        System.out.println(Context.getRealPath("/"));
        System.out.println(Context.getRealPath("/b.txt"));
        Context.setAttribute("username", "zhangsan");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
