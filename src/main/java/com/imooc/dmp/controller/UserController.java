package com.imooc.dmp.controller;


import com.imooc.dmp.dao.UserDao;
import com.imooc.dmp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("getUserById")
    public User getUserById(){
        return userDao.getUserById();
    }
}
