package com.lkl.demomsb.service;

import com.lkl.demomsb.dto.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Slf4j
@Service
public class ServiceB {
    @Resource
    JdbcTemplate jdbcTemplate;

    public void funB(){
        String sql = " update student set age = 11  where  id =1 ";
        List<Student> list = new ArrayList<>();
        int i = jdbcTemplate.update(sql);

        log.info(jdbcTemplate.toString());
        System.out.println("funB执行了");
//        throw new RuntimeException("抛了一个异常");
    }

}
