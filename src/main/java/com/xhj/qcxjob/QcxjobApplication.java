package com.xhj.qcxjob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
/**
 * @Author: WM
 * @Date: 2020/1/16 15:26
 * @Description: 启动类
 */
public class QcxjobApplication {

    public static void main(String[] args) {
        SpringApplication.run(QcxjobApplication.class, args);
    }

}
