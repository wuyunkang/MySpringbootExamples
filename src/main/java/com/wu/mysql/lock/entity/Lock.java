package com.wu.mysql.lock.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author wu
 * @since 2020-12-25
 */
@Builder
@Data
@EqualsAndHashCode()
@ApiModel(value = "Lock对象")
@TableName("`lock`")
public class Lock implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    @ApiModelProperty(value = "主键")
    private Integer id;

    @TableField("name")
    @ApiModelProperty(value = "测试值")
    private String name;

    @Version
    @ApiModelProperty(value = "版本")
    private Integer version;

    @TableLogic
    @ApiModelProperty(value = "删除:0=未删除,1=已删除")
    private Integer deleted;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime CreateTime;

    @ApiModelProperty(value = "修改时间")
    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime UpdateTime;
}
