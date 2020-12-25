package com.wu.mysql.lock.exception;

import com.wu.mysql.lock.config.ResultEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings("unused")
@EqualsAndHashCode(callSuper = true)
@Data
public class MyException extends RuntimeException {
    private ResultEnum resultEnum;

    public MyException() {
    }

    public MyException(ResultEnum resultEnum) {
        this.resultEnum = resultEnum;
    }


}