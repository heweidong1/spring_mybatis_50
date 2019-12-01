package com.kgc.mybatis;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * bean 得后置处理器
 * spring 在实例化对象时 得顺序是：
 * class --scan--- beanDefin -- map  -- new
 * 当扫描到class 时  先反倒后置处理器中 在放到map 中 在new 出来
 * 自己得FactoryBean  可以参照次方法 不使用Compont 注解 自动扫描 new对象
 * 可以自己手动将这个类放到后置处理器中 在放到后置处理器中 时 传参
 */
public class KgcImportBeanDefiniionRegistart implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
                                        BeanDefinitionRegistry registry) {

        //指定要将KgcMapperFactoryBean 放到后置处理器中
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.
                genericBeanDefinition(KgcMapperFactoryBean.class);

        //spring 在实例化KgcMapperfactoryBean  时 会根据BeanDefinition去实例化
        AbstractBeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();
        //指定要传入得参数
        beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("com.kgc.dao.UserMapper");

        registry.registerBeanDefinition("xxx",beanDefinition);


    }
}
