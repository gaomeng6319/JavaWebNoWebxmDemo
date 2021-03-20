package com.wying.spidemo;

import java.util.ServiceLoader;

/**
 * description:
 * date: 2021/3/5
 * author: gaom
 * version: 1.0
 */
public class TestMain {
    public static  void main(String[] args){
        //核心就是java.util提供的ServiceLoader类
        ServiceLoader<RegInterface> serviceLoader= ServiceLoader.load(RegInterface.class);
        System.out.println(" serviceLoader:"+ serviceLoader);
        //查看源码ServiceLoader通过 nextService会从src(classes )目录下查找META-INF/services/下的com.wying.spidemo.RegInterface配置文件
        for(RegInterface regInterface:serviceLoader){
            regInterface.reg("123");
        }

    }
}
