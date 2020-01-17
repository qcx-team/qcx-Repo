package com.xhj.qcxjob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 启动类
 */
@SpringBootApplication
@EnableSwagger2
//@ComponentScan("com.xhj.qcxjob")
public class QcxjobApplication {

    public static void main(String[] args) {
        SpringApplication.run(QcxjobApplication.class, args);
    }

}
