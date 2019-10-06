package com.yayako.user.service;


import com.yayako.user.entity.TUser;
import com.yayako.user.mapper.TUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private TUserMapper userMapper;

    public void register(TUser user) {
        userMapper.insert(user);
    }

//    public TUser findUserByUserName(String uname) {
//        return userMapper.insert()
//    }
}
