package com.xhj.qcxjob.controller;

import com.xhj.qcxjob.bean.UserInfo;
import com.xhj.qcxjob.service.UserService;
import com.xhj.qcxjob.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;


/**
 * @Author: WM
 * @Date: 2020/1/19 15:54
 * @Description:
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserService userService;
    @CrossOrigin
    @PostMapping(value = "/login")
    @ResponseBody
    public Result login(@RequestBody UserInfo user, HttpSession session) {
        // 对 html 标签进行转义，防止 XSS 攻击
//        String username = user.getUserName();
//        username = HtmlUtils.htmlEscape(username);

        List<UserInfo> list =  userService.getUserListByInfo(user);
        if (list != null && list.size() >0 ) {
            session.setAttribute("user", user);
            return new Result(Result.SUCCESS);
        } else {
            return new Result(Result.FALL);

        }
    }

}
