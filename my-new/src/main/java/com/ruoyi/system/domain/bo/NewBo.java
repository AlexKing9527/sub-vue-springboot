package com.ruoyi.system.domain.bo;

import com.ruoyi.common.core.validate.AddGroup;
import com.ruoyi.common.core.validate.EditGroup;
import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.validation.constraints.*;

import java.util.Date;

import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】业务对象 new
 *
 * @author ruoyi
 * @date 2024-04-18
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class NewBo extends BaseEntity {

    /**
     * 
     */
    @NotBlank(message = "不能为空", groups = { AddGroup.class, EditGroup.class })
    private String name;

    /**
     * 
     */
    @NotBlank(message = "不能为空", groups = { AddGroup.class, EditGroup.class })
    private String value;

    /**
     * 
     */
    @NotNull(message = "不能为空", groups = { EditGroup.class })
    private Integer id;


}
