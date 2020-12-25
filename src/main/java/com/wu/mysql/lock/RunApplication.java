package com.wu.mysql.lock;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @author WU
 * @date 2020-12-25 16:05
 */
@Slf4j
@SpringBootApplication
@MapperScan({"com.wu.dynamic.transaction.demo1.mapper","com.wu.dynamic.transaction.demo2.mapper"})
public class RunApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(RunApplication.class, args);
        Environment environment = context.getBean(Environment.class);
        log.info("Api管理 http://localhost:" + environment.getProperty("server.port") + environment.getProperty("server.servlet.context-path") + "/doc.html");
    }
}
