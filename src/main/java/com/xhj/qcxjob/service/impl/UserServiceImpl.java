package com.xhj.qcxjob.service.impl;

import com.xhj.qcxjob.bean.UserInfo;
import com.xhj.qcxjob.bean.UserInfoExample;
import com.xhj.qcxjob.mapper.UserInfoMapper;
import com.xhj.qcxjob.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @Author: WM
 * @Date: 2020/1/17 08:38
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserInfoMapper userInfoMapper;
    @Override
    public UserInfo getUserById(Integer id){
        return userInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UserInfo> getUserListByInfo(UserInfo userInfo){
        UserInfoExample example = new UserInfoExample();
        UserInfoExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(userInfo.getUserName());
        criteria.andPassWordEqualTo(userInfo.getPassWord());
        return userInfoMapper.selectByExample(example);
    }



}
