package com.imooc.dmp.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Basic Class
 */


public class BaseDao {

    @Autowired
    @Qualifier("hiveJdbcTemplate")
    private JdbcTemplate hiveJdbcTemplate;

    public JdbcTemplate getHiveJdbcTemplate(){
        return hiveJdbcTemplate;
    }
}
