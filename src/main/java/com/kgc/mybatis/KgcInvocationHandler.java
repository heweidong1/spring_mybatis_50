package com.kgc.mybatis;

import org.apache.ibatis.annotations.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class KgcInvocationHandler implements InvocationHandler {
    //此方法中定义的代码逻辑 会放到代理对象的 代理方法中

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //parse get sql 获取sql语句
        //method 接口中方法对象 可以通过方法对象 获取方法上的注解 从而拿到sql语句

        Select annotation = method.getAnnotation(Select.class);
        String sql = annotation.value()[0];

        //执行sql语句 jdbc
        System.out.println("sql----------"+sql);

        return null;
    }
}
