package com.lkl.demomsb.service;

import com.lkl.demomsb.dto.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ServiceA {
    @Autowired
    ServiceB sb;
    @Resource
    JdbcTemplate jdbcTemplate;

    @Resource
    DataSource dataSource;

    @Transactional(propagation = Propagation.REQUIRED,  rollbackFor = RuntimeException.class)
    public void funA()  {
        List<Object> args = new ArrayList<Object>();
//        String sql = " update student set age = 11  where  id =1 ";
        String sql = " select  *  from student ";
        List<Student> list = new ArrayList<>();
//        int i = jdbcTemplate.update(sql);
        list = JDBCTemplateSingletonProvider.getInstance().getJdbcTemplate().query(sql, args.toArray(), new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student s = new Student();
                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                return s;
            }
        });
        log.info("funA执行了，结果:{}",list);
        log.info("jdbcTemplate:{}",jdbcTemplate);


        System.out.println("funA执行了");
        sb.funB();
    }
}
