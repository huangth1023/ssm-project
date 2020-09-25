package com.dcits.controller;

import com.dcits.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: huangth tel:13246649002
 * Date: 2020/9/25 10:53
 * @Version:
 * @Description:
 */

@Controller
public class UserController {



    @RequestMapping("/login")
    public void login(User user) {

        System.out.println(user.getUserName() + user.getUserAge());


    }

}
