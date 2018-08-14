package com.xudd.asj.validate.service.controller;

import com.xudd.asj.validate.service.model.User;
import com.xudd.asj.validate.service.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author xudd
 * @Date 2018/8/14 0014 上午 10:22
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private ILoginService loginService;

    @GetMapping("/get")
    public User login(@RequestParam  String loginName) {
        return loginService.login(loginName);
    }

}
