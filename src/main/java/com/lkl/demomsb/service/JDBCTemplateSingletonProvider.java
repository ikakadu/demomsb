/*
package com.lkl.demomsb.service;


import org.springframework.beans.factory.annotation.Autowired;

public class JDBCTemplateSingletonProvider {

    @Autowired
    private static   ProviderJDBCTemplate providerJDBCTemplate;


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


*/
