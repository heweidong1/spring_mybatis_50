package com.kgc.mybatis;

import java.lang.reflect.Proxy;

public class KgcSession
{
    public static Object getMapper(Class clazz)
    {
        //将要产生代理对象的类传进来  这个方法将生成代理对象
        /**
         * ClassLoader loader,
         * Class<?>[] interfaces,
         * InvocationHandler h
         */
        Class[]clazzs = new Class[]{clazz};
        Object object =  Proxy.newProxyInstance(KgcSession.class.getClassLoader(),
               clazzs,new KgcInvocationHandler());
        return object;
    }
}
