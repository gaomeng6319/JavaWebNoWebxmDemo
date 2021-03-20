package com.wying.spidemo;

/**
 * description:外部实现
 * date: 2021/3/5
 * author: gaom
 * version: 1.0
 */
public class RegListenerImpl implements  RegInterface{
    @Override
    public void reg(String param1) {
        System.out.println("RegListenerImpl 注册监听"+param1);
    }
}
