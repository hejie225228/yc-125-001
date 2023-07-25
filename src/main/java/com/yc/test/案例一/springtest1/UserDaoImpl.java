package com.yc.test.案例一.springtest1;

import com.yc.test.案例一.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
class UserDaoImpl implements UserDao {
    public UserDaoImpl(){
        System.out.println("UserDaoImpl类的构造。。。。");
    }
    @Override
    public void add(String uname) {
        System.out.println("添加了："+uname);
    }
}
