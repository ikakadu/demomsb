package com.lkl.demomsb.service;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.sql.DataSource;
@Component
public class JDBCTemplateSingletonHungry {

    @Resource
    DataSource ds;

    private static  DataSource dataSource;

    @PostConstruct
    public void setDataSource(){
        JDBCTemplateSingletonHungry.dataSource = ds;
    }

    private JDBCTemplateSingletonHungry(){}


    private static final JdbcTemplate INSTANCE = new JdbcTemplate();

    public static JdbcTemplate getInstance(){
        return INSTANCE;
    }
}
