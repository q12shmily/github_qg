package com.baizhi.service;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class UserServiceLmpl implements UserService{
    @Autowired
    UserDao userDao;
    @Override
    public void add(User user) {
        user.setId(UUID.randomUUID().toString());
        userDao.save(user);
    }

    @Override
    public User findItem(User user) {
        User queryItem = userDao.queryItem(user);
        return queryItem;
    }
}
