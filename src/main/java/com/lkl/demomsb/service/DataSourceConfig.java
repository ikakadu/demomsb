package com.lkl.demomsb.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean(name = "primaryDataSource")//命名这个datasource，用来区分不同的bean，比如多个数据库源
    @Qualifier("primaryDataSource")
    //@Autowired默认是根据类型进行注入的，因此如果有多个类型一样的Bean候选者，Qualifier则需要限定其中一个候选者，否则将抛出异常,@Qualifier限定描述符除了能根据名字进行注入，更能进行更细粒度的控制如何选择候选者
    @ConfigurationProperties(prefix = "spring.datasource")//读取前缀是什么的配置
    public DataSource primaryDataSource() {
        return DataSourceBuilder.create().build();
    }
}
