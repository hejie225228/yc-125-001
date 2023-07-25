package com.yc.test.案例一;

import com.yc.test.案例一.biz.UserBiz;
import com.yc.test.案例一.springtest1.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        //首先创建容器
        ApplicationContext container=new AnnotationConfigApplicationContext(Config.class);
        //容器中已经创建好了这个类"键：userDaoImpl" 值：是对象


        //取业务层
        UserBiz ub=(UserBiz)container.getBean("userImpl");
        ub.add("王五");
    }
}
