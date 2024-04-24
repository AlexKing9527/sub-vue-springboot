package com.ruoyi.system.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 new
 *
 * @author ruoyi
 * @date 2024-04-18
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("new")
public class New extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * 
     */
    private String name;
    /**
     * 
     */
    private String value;
    /**
     * 
     */
    @TableId(value = "id")
    private Integer id;

}
