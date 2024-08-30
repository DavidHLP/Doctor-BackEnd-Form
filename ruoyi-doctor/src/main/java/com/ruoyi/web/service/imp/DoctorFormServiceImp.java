package com.ruoyi.web.service.imp;

import com.ruoyi.web.entity.FormData;
import com.ruoyi.web.mapper.DoctorFormMapper;
import com.ruoyi.web.service.DoctorFormService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Title: DoctorFormServiceImp
 * @Author David
 * @Package com.ruoyi.web.service.imp
 * @Date 2024/8/30 下午4:37
 */
@Service
public class DoctorFormServiceImp implements DoctorFormService {
    @Resource
    private DoctorFormMapper doctorFormMapper;

    public int insetJson(FormData formData) {
        return doctorFormMapper.insertFormData(formData);
    }

    public List<Long> selectIdByFormNameLike(String formName) {
        return doctorFormMapper.selectIdByFormNameLike(formName);
    }

    public List<FormData> selectAllIsNoHasPatientId(){
        return doctorFormMapper.selectAllIsNoHasPatientId();
    }

    public FormData selectFormDataById(Long id){
        return doctorFormMapper.selectFormDataById(id);
    }
}
