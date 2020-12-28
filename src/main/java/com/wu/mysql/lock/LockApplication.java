package com.wu.mysql.lock;

import io.swagger.annotations.Api;
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
@Api(tags = "mysql-乐观锁-悲观锁-逻辑删除")
@SpringBootApplication
@MapperScan({"com.wu.mysql.lock.mapper"})
public class LockApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LockApplication.class, args);
        Environment environment = context.getBean(Environment.class);
        log.info("Api管理 http://localhost:" + environment.getProperty("server.port") + environment.getProperty("server.servlet.context-path") + "/doc.html");
    }
}
