package com.xudd.asj.validate.service.mapper;

import com.xudd.asj.validate.service.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User selectByLoginName(@Param("loginName") String loginName);
}