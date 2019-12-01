package com.kgc.service;

import com.kgc.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class UserService
{
    @Resource
    private UserMapper userMapper;

    public void queryAll()
    {
        /**
         * UserMapper 对象
         * UserMapper 他是如何被实例化的 接口如何实例化
         * JDK动态代理产生的对象
         */
        List<Map<Object, Object>> query = userMapper.query();
        System.out.println(query);
    }
}
