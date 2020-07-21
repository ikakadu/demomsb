package com.lkl.demomsb.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Service
public class ServiceC {
    @Resource
    private DataSource ds;


    public void fun(){
        JdbcCorporateEventDao dao = new JdbcCorporateEventDao();
        dao.setDataSource(ds);
        System.out.println(dao.getJdbcTemplate());;
        JdbcCorporateEventDao dao1 = new JdbcCorporateEventDao();
        dao1.setDataSource(ds);
        System.out.println(dao1.getJdbcTemplate());;
    }

}
