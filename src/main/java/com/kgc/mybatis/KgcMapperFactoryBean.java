package com.kgc.mybatis;
import org.springframework.beans.factory.FactoryBean;
//@Component  因为要传值
public class KgcMapperFactoryBean implements FactoryBean
{

    Class mapperInterface;


    public KgcMapperFactoryBean(Class mapperInterface) {
        this.mapperInterface = mapperInterface;
    }

    public KgcMapperFactoryBean() {
    }

    public Class getMapperInterface() {
        return mapperInterface;
    }

    public void setMapperInterface(Class mapperInterface) {
        this.mapperInterface = mapperInterface;
    }

    @Override
    public Object getObject() throws Exception {
        Object o =KgcSession.getMapper(mapperInterface);
        return o;
    }

    @Override
    public Class<?> getObjectType() {
        return mapperInterface;
    }
}
