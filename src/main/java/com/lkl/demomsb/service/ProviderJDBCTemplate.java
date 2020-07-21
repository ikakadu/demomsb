package com.lkl.demomsb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;
import javax.sql.DataSource;

public class ProviderJDBCTemplate {
    @Resource
    DataSource dataSource;

    @Autowired
    DataSource primaryDataSource;

    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(primaryDataSource);
    }
}
