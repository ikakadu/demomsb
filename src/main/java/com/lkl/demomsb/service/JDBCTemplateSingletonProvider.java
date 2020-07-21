package com.lkl.demomsb.service;


import cn.hutool.core.lang.Singleton;
import org.springframework.jdbc.core.JdbcTemplate;


import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.sql.DataSource;

public class JDBCTemplateSingletonProvider {

    private  ProviderJDBCTemplate providerJDBCTemplate;


    private JDBCTemplateSingletonProvider(){
        this.providerJDBCTemplate = new ProviderJDBCTemplate();
    }

    private static class JdbcTemplateInstance {
        private static final JDBCTemplateSingletonProvider INSTANCE = new JDBCTemplateSingletonProvider();
    }

    public static final ProviderJDBCTemplate getInstance() {

        return JdbcTemplateInstance.INSTANCE.providerJDBCTemplate;
    }

}


