package com.xudd.asj.validate.service.service.impl;

import com.xudd.asj.validate.service.model.User;
import com.xudd.asj.validate.service.service.ILoginService;
import com.xudd.asj.validate.service.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author xudd
 * @Date 2018/8/14 0014 上午 10:30
 */
@Service
public class LoginServiceImpl implements ILoginService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String loginName) {
        return userMapper.selectByLoginName(loginName);
    }
}
