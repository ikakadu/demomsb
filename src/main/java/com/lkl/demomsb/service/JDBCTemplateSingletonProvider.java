package com.lkl.demomsb.service;


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


