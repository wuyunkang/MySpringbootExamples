package com.wu.mysql.lock.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.Version;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author wu
 * @since 2020-12-25
 */
@Data
@EqualsAndHashCode()
@ApiModel(value="Lock对象")
public class Lock implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    private Integer id;

    @ApiModelProperty(value = "测试值")
    private String value;

    @Version
    @ApiModelProperty(value = "版本")
    private Integer version;

    @ApiModelProperty(value = "删除:0=未删除,1=已删除")
    private Integer deleted;


}
