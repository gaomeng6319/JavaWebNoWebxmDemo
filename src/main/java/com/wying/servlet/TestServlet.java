package com.wying.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * description:测试servlet 由于去除web.xml文件 该servlet在MyServletContainerInitializer 配置
 * date: 2021/3/5
 * author: gaom
 * version: 1.0
 */
public class TestServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("=========TestServlet.init()=========");
        super.init();

    }



    @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("=========TestServlet.doGet()=========");
        response.getWriter().write("TestServlet");

    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("=========TestServlet.doPost()=========");
        doGet(request, response);

    }
}
