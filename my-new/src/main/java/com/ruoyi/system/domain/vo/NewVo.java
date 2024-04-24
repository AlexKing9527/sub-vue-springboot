package com.ruoyi.system.domain.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import com.ruoyi.common.annotation.ExcelDictFormat;
import com.ruoyi.common.convert.ExcelDictConvert;
import lombok.Data;
import java.util.Date;

import java.io.Serializable;

/**
 * 【请填写功能名称】视图对象 new
 *
 * @author ruoyi
 * @date 2024-04-18
 */
@Data
@ExcelIgnoreUnannotated
public class NewVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    @ExcelProperty(value = "")
    private String name;

    /**
     * 
     */
    @ExcelProperty(value = "")
    private String value;

    /**
     * 
     */
    @ExcelProperty(value = "")
    private Integer id;


}
