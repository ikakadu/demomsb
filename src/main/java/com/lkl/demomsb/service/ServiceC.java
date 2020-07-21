package com.lkl.demomsb.service;

import com.alibaba.fastjson.JSON;
import com.lkl.demomsb.dto.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
@Slf4j
@Service
public class ServiceC {
    @Resource
    private DataSource dataSource;


    public void fun() throws SQLException {
        Connection connection = dataSource.getConnection();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(" select  *  from student ");
        while(rs.next()){
            Student s = new Student();
            s.setId(rs.getInt("id"));
            s.setName(rs.getString("name"));
            System.out.println(s);
        }

    }

    public void  fun1(){
        log.info("dataSource:{}",dataSource);
        List<Object> args = new ArrayList<Object>();
        String sql = " select  *  from student ";
        List<Student> list = new ArrayList<>();
        list = JDBCTemplateSingletonProvider.getInstance().getJdbcTemplate().query(sql, args.toArray(), new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student s = new Student();
                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                return s;
            }
        });
        log.info("fun1执行了，结果:{}",list);
    }

}
