package com.lkl.demomsb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lkl.demomsb.dto.Student;
import com.lkl.demomsb.service.ReadPropertiesService;
import com.lkl.demomsb.service.ServiceA;
import com.lkl.demomsb.service.ServiceC;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.Map;

@SpringBootTest
class DemomsbApplicationTests {
    @Autowired
    ServiceA sa;


//    @Autowired
//    ReadPropertiesService rs;

    @Autowired
    ServiceC sc;
    @Autowired
    private ApplicationContext applicationContext;
    @Resource
    private DataSource dataSource;

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
        sa.funA();

    }
    @Test
    public void readTest(){

        String url = ReadPropertiesService.getUrl();
        System.out.println(url);

    }

    @Test
    public void getJdbc() {
        sc.fun1();
//        System.out.println("--------------------------------");
//        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//        System.out.println(beanDefinitionNames);
//        System.out.println("--------------------------------");
    }


}
