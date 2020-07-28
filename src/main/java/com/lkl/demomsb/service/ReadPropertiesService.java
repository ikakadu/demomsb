package com.lkl.demomsb.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ReadPropertiesService {
    private static String url ;

    @Value("${spring.datasource.url}")
    public  void setUrl(String url) {
        ReadPropertiesService.url = url;
        System.out.println("setUrl执行了");
        fun();
    }

    public static  String getUrl(){
        return url;
    }
    public static  void fun(){
        System.out.println("fun方法执行了");;
    }
}
