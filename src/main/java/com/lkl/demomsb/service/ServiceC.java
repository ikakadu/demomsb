package com.lkl.demomsb.service;

import com.lkl.demomsb.dto.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
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
        List<Object> args = new ArrayList<Object>();
        String sql = " select  *  from student ";
        List<Student> list = new ArrayList<>();

        JdbcTemplate instance1 = JDBCTemplateSingletonStatic.getInstance();
        JdbcTemplate instance2 = JDBCTemplateSingletonStatic.getInstance();

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());


        list = JDBCTemplateSingletonStatic.getInstance().query(sql, args.toArray(), new RowMapper<Student>() {
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

    public void  fun2(){
        List<Object> args = new ArrayList<Object>();
        String sql = " select  *  from student ";
        List<Student> list = new ArrayList<>();

        list = JDBCTemplateSingletonDoubleCheck.getInstance().query(sql, args.toArray(), new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student s = new Student();
                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                return s;
            }
        });
        log.info("fun2执行了，结果:{}",list);
    }



}
