package com.baizhi.service;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements  UserService {
    @Autowired
    private UserDao ud;
    @Override
    public List<User> selectAll() {
        System.out.println("目标方法");
        return ud.selectAll();
    }
}
