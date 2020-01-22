package com.xhj.qcxjob.service;

import com.xhj.qcxjob.bean.UserInfo;

import java.util.List;

/**
 * @Author: WM
 * @Date: 2020/1/17 08:38
 * @Description:
 */
public interface UserService {
    /**
     * 获取人员信息
     * @param id 主键
     * @return
     */
    public UserInfo getUserById(Integer id);

    /**
     * 获取人员信息
     * @param userInfo
     * @return
     */
    public List<UserInfo> getUserListByInfo(UserInfo userInfo);
}
