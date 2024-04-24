package com.ruoyi.system.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.core.domain.PageQuery;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.ruoyi.system.domain.bo.NewBo;
import com.ruoyi.system.domain.vo.NewVo;
import com.ruoyi.system.domain.New;
import com.ruoyi.system.mapper.NewMapper;
import com.ruoyi.system.service.INewService;

import java.util.List;
import java.util.Map;
import java.util.Collection;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2024-04-18
 */
@RequiredArgsConstructor
@Service
public class NewServiceImpl implements INewService {

    private final NewMapper baseMapper;

    /**
     * 查询【请填写功能名称】
     */
    @Override
    public NewVo queryById(Integer id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @Override
    public TableDataInfo<NewVo> queryPageList(NewBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<New> lqw = buildQueryWrapper(bo);
        Page<NewVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @Override
    public List<NewVo> queryList(NewBo bo) {
        LambdaQueryWrapper<New> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<New> buildQueryWrapper(NewBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<New> lqw = Wrappers.lambdaQuery();
        lqw.like(StringUtils.isNotBlank(bo.getName()), New::getName, bo.getName());
        lqw.eq(StringUtils.isNotBlank(bo.getValue()), New::getValue, bo.getValue());
        return lqw;
    }

    /**
     * 新增【请填写功能名称】
     */
    @Override
    public Boolean insertByBo(NewBo bo) {
        New add = BeanUtil.toBean(bo, New.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改【请填写功能名称】
     */
    @Override
    public Boolean updateByBo(NewBo bo) {
        New update = BeanUtil.toBean(bo, New.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(New entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除【请填写功能名称】
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Integer> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
