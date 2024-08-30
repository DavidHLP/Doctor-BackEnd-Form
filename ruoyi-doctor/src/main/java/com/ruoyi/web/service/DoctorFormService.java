package com.ruoyi.web.service;

import com.ruoyi.web.entity.FormData;

import java.util.List;

/**
 * @Title: octorFormService
 * @Author David
 * @Package com.ruoyi.web.service
 * @Date 2024/8/30 下午4:37
 */
public interface DoctorFormService {
    public int insetJson(FormData formData);
    public List<Long> selectIdByFormNameLike(String formName);
    public List<FormData> selectAllIsNoHasPatientId();
    public FormData selectFormDataById(Long id);
}
