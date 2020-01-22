package com.xhj.qcxjob.utils;

import lombok.Data;

/**
 * @Author: WM
 * @Date: 2020/1/19 15:56
 * @Description: 定义接口响应码 200成功  400 失败
 */
@Data
public class Result {

    public  static final int SUCCESS =200;
    public  static final int FALL =400;

    private int code;

    public Result(int code) {
        this.code = code;
    }


}
