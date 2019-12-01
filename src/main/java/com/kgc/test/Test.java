package com.kgc.test;
import com.kgc.config.Appconfig;
import com.kgc.dao.UserMapper;
import com.kgc.mybatis.KgcSession;
import com.kgc.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test
{
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac =
                new AnnotationConfigApplicationContext(Appconfig.class);
        UserService bean = ac.getBean(UserService.class);
        bean.queryAll();


        //获取代理对象 如果要和spring整合  要将 代理对象放进spring容器中
        UserMapper mapper =(UserMapper)KgcSession.getMapper(UserMapper.class);
        mapper.query();

        /**
         *
         * mybatis将mapper 代理
         * 先添加mapper
         *
         * 在获取mapper
         *  SqlSessionFactory sqlSessionFactory =null;
         *         SqlSession sqlSession =
         *                 sqlSessionFactory.openSession();
         *
         *    //UserMapper usermapper = Proxy.newProxyInstance();
         *    //已经实现了动态代理
         *    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
         *
         */


    }
}
