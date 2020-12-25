package com.wu.mysql.lock.config;

import lombok.Data;

@SuppressWarnings("unused")
@Data
public class Result<T> {
    // 接口调用成功或者失败
    private Integer code = 200;
    // 需要传递的信息，例如错误信息
    private String message;
    // 需要传递的数据
    private T data;

    public Result() {
    }

    public Result(T data) {
        this.data = data;
    }

    public Result(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.message = resultEnum.getMessage();
    }

    public Result(ResultEnum resultEnum, T data) {
        this.code = resultEnum.getCode();
        this.message = resultEnum.getMessage();
        this.data = data;
    }
}