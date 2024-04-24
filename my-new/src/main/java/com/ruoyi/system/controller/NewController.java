package com.ruoyi.system.controller;

import java.util.List;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import lombok.RequiredArgsConstructor;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.*;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;
import com.ruoyi.common.annotation.RepeatSubmit;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.PageQuery;
import com.ruoyi.common.core.domain.R;
import com.ruoyi.common.core.validate.AddGroup;
import com.ruoyi.common.core.validate.EditGroup;
import com.ruoyi.common.core.validate.QueryGroup;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.vo.NewVo;
import com.ruoyi.system.domain.bo.NewBo;
import com.ruoyi.system.service.INewService;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】
 *
 * @author ruoyi
 * @date 2024-04-18
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/system/new")
public class NewController extends BaseController {

    private final INewService iNewService;

    /**
     * 查询【请填写功能名称】列表
     */
    @SaCheckPermission("system:new:list")
    @GetMapping("/list")
    public TableDataInfo<NewVo> list(NewBo bo, PageQuery pageQuery) {
        return iNewService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @SaCheckPermission("system:new:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(NewBo bo, HttpServletResponse response) {
        List<NewVo> list = iNewService.queryList(bo);
        ExcelUtil.exportExcel(list, "【请填写功能名称】", NewVo.class, response);
    }

    /**
     * 获取【请填写功能名称】详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("system:new:query")
    @GetMapping("/{id}")
    public R<NewVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Integer id) {
        return R.ok(iNewService.queryById(id));
    }

    /**
     * 新增【请填写功能名称】
     */
    @SaCheckPermission("system:new:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody NewBo bo) {
        return toAjax(iNewService.insertByBo(bo));
    }

    /**
     * 修改【请填写功能名称】
     */
    @SaCheckPermission("system:new:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody NewBo bo) {
        return toAjax(iNewService.updateByBo(bo));
    }

    /**
     * 删除【请填写功能名称】
     *
     * @param ids 主键串
     */
    @SaCheckPermission("system:new:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Integer[] ids) {
        return toAjax(iNewService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
