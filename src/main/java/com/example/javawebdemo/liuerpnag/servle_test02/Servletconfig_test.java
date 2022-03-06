package com.example.javawebdemo.liuerpnag.servle_test02;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

public class Servletconfig_test extends GenericServlet {
    private ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config=config;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println(config.getInitParameter("encoding"));
        Enumeration<String> vlaues = config.getInitParameterNames();
        while (vlaues.hasMoreElements()){
            String s = vlaues.nextElement();
            String ss = config.getInitParameter(s);
            System.out.println(s+","+ss);
        }
        System.out.println(config.getServletName());
        ServletContext sss = config.getServletContext();
        Object username = sss.getAttribute("username");
        System.out.println(username);
        sss.removeAttribute("username");
        System.out.println(username);










        /*        String encodingvalue = config.getInitParameter("encoding");
        System.out.println(encodingvalue);

        Enumeration<String> encodingvalues = config.getInitParameterNames();
        while (encodingvalues.hasMoreElements()){
            String s = encodingvalues.nextElement();
            String ss = config.getInitParameter(s);
            System.out.println(s+","+ss);
        }
        System.out.println(config.getServletName());
        ServletContext servletContext = config.getServletContext();
        System.out.println(servletContext);*/
    }
}
