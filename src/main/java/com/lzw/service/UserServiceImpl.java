package com.lzw.service;

import com.lzw.entity.User;
import com.lzw.mapper.UserMapper;
import com.lzw.service.Interface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
}
