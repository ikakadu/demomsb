package com.lkl.demomsb.service;


import org.springframework.jdbc.core.JdbcTemplate;


import javax.annotation.Resource;
import javax.sql.DataSource;

public class ProviderJDBCTemplate {
    @Resource
    private DataSource dataSource;

    private static DataSource ds;

    private ProviderJDBCTemplate(){}

    private static class JdbcTemplateInstance {


        private static final JdbcTemplate INSTANCE = new JdbcTemplate();

    }

    public static JdbcTemplate getInstance() {

        return JdbcTemplateInstance.INSTANCE;
    }

}


