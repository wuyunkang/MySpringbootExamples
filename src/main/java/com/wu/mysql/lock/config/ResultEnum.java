package com.wu.mysql.lock.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 响应结果状态枚举类
 *
 * @author MoCha
 * @date 2019/5/25
 */
@SuppressWarnings("unused")
@NoArgsConstructor
@AllArgsConstructor
public enum ResultEnum {
    /**
     * 请求成功
     */
    SUCCESS(200, "请求成功！"),
    /**
     * 请求成功
     */
    FAILED(500, "接口异常！"),
    /**
     * 密码错误
     */
    PASSWORD_NOT_MATCHING(400, "密码错误");

    @Getter
    @Setter
    private int code;

    @Getter
    @Setter
    private String message;
}
