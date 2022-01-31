package com.imooc.dmp.service.impl;

import com.imooc.dmp.entity.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;



public class UserRowMapperImpl implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {

        String name = resultSet.getString("name");

        User user = new User();

        user.setName(name);

        return user;
    }
}
