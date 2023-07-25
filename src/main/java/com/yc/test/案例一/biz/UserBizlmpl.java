package com.yc.test.案例一.biz;

import com.yc.test.案例一.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserBizlmpl {
    //将dao层的对象主人注入到biz DI依赖注入（将spring容器中托管的userDao的对象传到此处）
//    @Resource(name="userDaoImpl")  由spring容器根据id名为userDaoImpl到容器中找到这个实例，并注入）

    @Autowired //根据类型完成注入。在spring容器中根据UserDao接口类找实例
    @Qualifier("userDaoImpl")
    private UserDao userDao;
    public  UserBizlmpl(){
        System.out.println("userBizImpl的构造。。。。。");
    }

    public void add(String uname) {
        userDao.add(uname);
    }
}
