package com.xhj.qcxjob.service.impl;

import com.xhj.qcxjob.bean.TUser;
import com.xhj.qcxjob.mapper.TUserMapper;
import com.xhj.qcxjob.service.TUserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: WM
 * @Date: 2020/1/17 08:38
 * @Description:
 */
@Service
public class TUserSeviceImpl implements TUserSevice {

    @Autowired
    TUserMapper tUserMapper;
    @Override
    public TUser getUserById(Integer id){
        return tUserMapper.selectByPrimaryKey(id);
    }
}
