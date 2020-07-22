package com.lkl.demomsb.service;


import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;
import javax.sql.DataSource;

public class JDBCTemplateSingletonStatic {

    private static DruidDataSource dataSource = new DruidDataSource();

    static {
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT%2B8");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    }

    private JDBCTemplateSingletonStatic(){
    }

    private static class JdbcTemplateInstance {
        private static final JdbcTemplate INSTANCE = new JdbcTemplate(dataSource);
    }

    public static final JdbcTemplate getInstance() {
        return JdbcTemplateInstance.INSTANCE;
    }

}


