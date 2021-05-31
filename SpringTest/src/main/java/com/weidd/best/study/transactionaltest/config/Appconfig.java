package com.weidd.best.study.transactionaltest.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-05-11 10:44
 **/
//@Configuration //表明为配置类
@ComponentScan("java.study.best.transactionaltest") //扫描的包
@EnableTransactionManagement //开启注解事务 功能同于配置文件中:<tx:annotation-driven/>
public class Appconfig {

//    @Bean //TransactionTemplate 事务管理模板类(编程式事务需要此配置)
//    public TransactionTemplate transactionTemplate(DataSourceTransactionManager dataSourceTransactionManager) {
//        return new TransactionTemplate(dataSourceTransactionManager);
//    }

    @Bean // DataSourceTransactionManager 事务管理器
    public DataSourceTransactionManager dataSourceTransactionManager(DataSource dataSource) {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }

    @Bean // JdbcTemplate
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean //DataSource
    public DataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/mysqlStudy");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("3.014/*-+");
        return druidDataSource;
    }

}
