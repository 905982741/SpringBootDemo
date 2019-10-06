package com.yayako.user.web;


import com.yayako.user.entity.TUser;
import com.yayako.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/register")
    public String register(@RequestParam String userName, String userPwd, int userAge){

        TUser user = new TUser();
        user.setUname(userName);
        user.setPwd(userPwd);
        user.setAge(userAge);
        System.out.println(user);
        return "registerSuccess";
    }
}
