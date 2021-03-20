package com.wying.Web;

import com.wying.servlet.TestServlet;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import java.util.Set;

/**
 * description:实现servlet-api.jar包下的javax.servlet.ServletContainerInitializer class
 * 重写onStartup方法 通过该方法配置 servlet 监听 等 代替 web.xml配置
 * date: 2021/3/5
 * author: gaom
 * version: 1.0
 */

public class MyServletContainerInitializer implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println("==============MyServletContainerInitializer  onStartup=========");
        ServletRegistration.Dynamic testServlet=servletContext.addServlet("testServlet",new TestServlet());
        testServlet.addMapping("/testServlet");
    }
}
