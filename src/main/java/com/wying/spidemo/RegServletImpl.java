package com.wying.spidemo;

/**
 * description:外部实现
 * date: 2021/3/5
 * author: gaom
 * version: 1.0
 */
public class RegServletImpl  implements  RegInterface{
    @Override
    public void reg(String param1) {
        System.out.println("RegServletImpl 注册服务 "+param1);
    }
}
