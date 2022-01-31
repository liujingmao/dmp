package com.imooc.dmp.dao;

import com.imooc.dmp.entity.User;
import com.imooc.dmp.service.impl.UserRowMapperImpl;
import org.springframework.stereotype.Repository;


@Repository
public class UserDao extends BaseDao {


    public User getUserById(){

        String sql = "select name from user2 where id = 2";

        return this.getHiveJdbcTemplate().queryForObject(sql,new UserRowMapperImpl());

    }



}
