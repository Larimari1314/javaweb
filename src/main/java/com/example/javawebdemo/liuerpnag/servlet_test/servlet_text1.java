package com.example.javawebdemo.liuerpnag.servlet_test;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class servlet_text1 extends GenericServlet {
    public static void main(String[] args) {

    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("王景弘啥也不会");
    }
}
