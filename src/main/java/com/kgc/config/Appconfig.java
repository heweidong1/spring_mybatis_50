package com.kgc.config;

import com.kgc.dao.UserMapper;
import com.kgc.mybatis.KgcImportBeanDefiniionRegistart;
import com.kgc.mybatis.KgcMapperFactoryBean;
import com.kgc.mybatis.KgcSession;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.kgc")
//@MapperScan("com.kgc.dao")
@KgcScan
public class Appconfig
{
    //配置会话工厂sessionFactory
    /**
     *
     * @param
     * @return
     * @throws Exception
     */
//    @Bean
//    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource)throws Exception
//    {
//        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
//        factoryBean.setDataSource(dataSource);
//        return factoryBean;
//    }


    //配置数据源
//    @Bean
//    public DataSource dataSource()
//    {
//        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
//        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        driverManagerDataSource.setUsername("root");
//        driverManagerDataSource.setPassword("1394207767");
//        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/itripdb?useUnicode=true&characterEncoding=utf-8&useSSL=false");
//        return driverManagerDataSource;
//    }



    //将自己生成的代理对象交给spring容器
    //mybatis 会自动注入到spring中 但是 这种方法要
    //程序员自己注入   所以  不可取
//    @Bean
//    public UserMapper userMapper()
//    {
//        UserMapper mapper =(UserMapper) KgcSession.getMapper(UserMapper.class);
//        return mapper;
//    }

        //手动配置  传入 要代理得mapper  但是 当出现多个mapper得时候 会很麻烦
        //所以要  利用扫描
//        @Bean
//        public KgcMapperFactoryBean getporymapper()
//        {
//            KgcMapperFactoryBean kgcMapperFactoryBean = new KgcMapperFactoryBean();
//            kgcMapperFactoryBean.setMapperInterface(UserMapper.class);
//            return kgcMapperFactoryBean;
//        }

}
