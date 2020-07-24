package com.lkl.demomsb.service;

import cn.hutool.core.lang.Singleton;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.sql.DataSource;

@Component
public class JDBCTemplateSingletonDoubleCheck {
    @Resource
    DataSource dataSource;

    private static DataSource ds;

    @PostConstruct
    public void setDataSource(){
        JDBCTemplateSingletonDoubleCheck.ds = dataSource;
    }



    private JDBCTemplateSingletonDoubleCheck(){}

    private static volatile JdbcTemplate jdbcTemplate;

    public static JdbcTemplate getInstance() {
        if (jdbcTemplate == null) {
            synchronized (Singleton.class) {
                if (jdbcTemplate == null) {
                    jdbcTemplate = new JdbcTemplate(ds);
                }
            }
        }
        return jdbcTemplate;
    }
}
