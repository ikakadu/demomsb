package com.lkl.demomsb.service;

import com.alibaba.fastjson.JSON;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StatementService {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT%2B8";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, "root", "123456");
            conn.createStatement();
            String sql = "select *  from  student";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println(id + name + age);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
