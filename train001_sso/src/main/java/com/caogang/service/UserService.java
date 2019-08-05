package com.caogang.service;
import com.caogang.dao.UserDao;

import com.caogang.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: xiaogang
 * @date: 2019/8/5 - 20:12
 */
@Transactional
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public UserInfo selectOneUser(String loginName){

        return userDao.findByLoginName(loginName);

    }

}
