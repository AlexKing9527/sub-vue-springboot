package com.ruoyi.system.service;

import com.ruoyi.system.domain.New;
import com.ruoyi.system.domain.vo.NewVo;
import com.ruoyi.system.domain.bo.NewBo;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author ruoyi
 * @date 2024-04-18
 */
public interface INewService {

    /**
     * 查询【请填写功能名称】
     */
    NewVo queryById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     */
    TableDataInfo<NewVo> queryPageList(NewBo bo, PageQuery pageQuery);

    /**
     * 查询【请填写功能名称】列表
     */
    List<NewVo> queryList(NewBo bo);

    /**
     * 新增【请填写功能名称】
     */
    Boolean insertByBo(NewBo bo);

    /**
     * 修改【请填写功能名称】
     */
    Boolean updateByBo(NewBo bo);

    /**
     * 校验并批量删除【请填写功能名称】信息
     */
    Boolean deleteWithValidByIds(Collection<Integer> ids, Boolean isValid);
}
