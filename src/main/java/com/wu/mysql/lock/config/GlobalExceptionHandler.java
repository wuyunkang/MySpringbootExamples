package com.wu.mysql.lock.config;

import com.wu.mysql.lock.exception.MyException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice(basePackages = {"com.wu.mysql.lock.controller"})
public class GlobalExceptionHandler {
    private static final Logger LOG = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 全局异常处理
     */
    @ExceptionHandler(MyException.class)
    public Result<Void> handleException(MyException e) {
        LOG.error(e.getMessage(), e);
        return new Result<>(e.getResultEnum());
    }
}