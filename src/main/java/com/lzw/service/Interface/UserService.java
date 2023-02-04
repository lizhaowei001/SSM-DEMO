package com.lzw.service.Interface;

import com.lzw.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserService {

    List<User> getAllUser();
}
