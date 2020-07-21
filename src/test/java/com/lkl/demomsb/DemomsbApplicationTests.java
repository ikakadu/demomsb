package com.lkl.demomsb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lkl.demomsb.dto.Student;
import com.lkl.demomsb.service.JDBCTemplateSingletonProvider;
import com.lkl.demomsb.service.ServiceA;
import com.lkl.demomsb.service.ServiceC;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemomsbApplicationTests {
    @Autowired
    ServiceA sa;

    @Autowired
    ServiceC sc;

    @Test
    void contextLoads() {
        Student s = new Student();
        s.setId(1);
        s.setName("张三");
        System.out.println(JSON.toJSONString(s));
        System.out.println(JSONObject.toJSON(s));
        System.out.println(JSONObject.toJSONString(s));
    }

    @Test
    public void transTest(){
//        sa.funA();
        System.out.println(JDBCTemplateSingletonProvider.getInstance());
        System.out.println(JDBCTemplateSingletonProvider.getInstance().getJdbcTemplate());

    }

    @Test
    public void Test(){
        sc.fun();
    }

}
