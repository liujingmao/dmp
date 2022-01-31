package com.imooc.dmp.config;


import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class HiveDataSourceConfig {

    /**
     *生成datasource
     * @return
     */

    @ConfigurationProperties(prefix = "spring.datasource.druid.hive")
    @Bean(name = "hiveDataSource")
    public DataSource hiveDataSource(){
        return DruidDataSourceBuilder.create().build();
    }
}
