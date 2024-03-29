package com.qf.waimai.service.impl;

import com.qf.waimai.mapper.UserMapper;
import com.qf.waimai.pojo.Users;
import com.qf.waimai.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Auther:
 * @Date: 2019/8/21 20:22
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public Users findUserInfo(String userName) {
        Users users=userMapper.findUserInfo(userName);
        return users;
    }
}
