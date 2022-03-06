package com.example.javawebdemo.liuerpnag.servle_test02;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class servlet_01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int money=1000;
        String ss = req.getRequestURI();
        ss= ss.substring(ss.lastIndexOf("/"));
        if("/vip".equals(ss)){
            System.out.println("商品原价"+money+",优惠价钱"+money*(0.9));
        } else if ("/vvip".equals(ss)) {
            System.out.println("商品原价"+money+",优惠价钱"+money*(0.8));
        }else {
            System.out.println("商品价值"+money);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
