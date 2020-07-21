package com.lkl.demomsb.service;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Service
public class ProviderJDBCTemplate {
    @Resource
    DataSource dataSource;



    public DataSource getDataSource(){
        return dataSource;
    }


    public JdbcTemplate getJdbcTemplate(){
        System.out.println("dataSource:"+dataSource);
        return new JdbcTemplate(dataSource);
    }

}
