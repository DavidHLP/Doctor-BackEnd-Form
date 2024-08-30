package com.ruoyi.web.controller.form;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.web.entity.FormData;
import com.ruoyi.web.entity.FormJsonString;
import com.ruoyi.web.service.DoctorFormService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @Title: DoctorFormController
 * @Author David
 * @Package com.ruoyi.web
 * @Date 2024/8/27 下午10:28
 * @description: 医生表单自定义API
 */
@RequestMapping("/doctor")
@RestController
public class DoctorFormController extends BaseController {

    @Resource
    private DoctorFormService doctorFormService;

    private FormData getformData;

    public DoctorFormController() {
        getformData = new FormData();
    }

    @PostMapping("/insetJson/{name}")
    public AjaxResult insetJson(@PathVariable String name,@RequestBody FormJsonString data) {
        getformData.setFormJsonString(data);
        getformData.setCreateUsrid(getUserId());
        getformData.setCreateTime(LocalDateTime.now());
        getformData.setFormName(name);
        int num = doctorFormService.insetJson(getformData);
        return AjaxResult.success("表单提交成功", num);
    }

    @GetMapping("/throwformid/{id}")
    public AjaxResult getJsonById(@PathVariable("id") Long id) {
        FormData formData = doctorFormService.selectFormDataById(id);
        return AjaxResult.success("查询成功",formData);
    }


    @GetMapping("/getallhasnotpatientid")
    public AjaxResult getallhasnotpatientid() {
        List<FormData> formData = doctorFormService.selectAllIsNoHasPatientId();
        return AjaxResult.success("查询成功", formData);
    }
}