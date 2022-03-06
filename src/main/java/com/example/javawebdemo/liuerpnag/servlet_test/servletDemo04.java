package com.example.javawebdemo.liuerpnag.servlet_test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*servlet线程安全*/
public class servletDemo04 extends HttpServlet {
    /*定义用户名的成员变量*/
    private String username;
    final Object o = new Object();

    public servletDemo04() {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取用户名
        synchronized (o) {
            username = req.getParameter("username");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //响应给浏览器
            PrintWriter pw = resp.getWriter();
            pw.println("welcome" + username);
            pw.close();
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
