package com.imooc.dmp.config;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * 配置类 jdbc
 */

@Configuration
public class JdbcTemplateConfig {

    /**
     *
     * @param dataSource
     * @return
     */

    @Bean(name = "hiveJdbcTemplate")
    public JdbcTemplate hiveJdbcTemplate(@Qualifier("hiveDataSource") DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }




}
