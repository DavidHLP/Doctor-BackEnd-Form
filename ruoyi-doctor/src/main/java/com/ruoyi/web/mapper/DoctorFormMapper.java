package com.ruoyi.web.mapper;

import com.ruoyi.web.entity.FormData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Title: DoctorFormMapper
 * @Author David
 * @Package com.ruoyi.web.mapper
 * @Date 2024/8/30 下午4:41
 */
@Mapper
public interface DoctorFormMapper {

    public int insertFormData(FormData formData);

    public List<Long> selectIdByFormNameLike(@Param("formName") String formName);

    public List<FormData> selectAllIsNoHasPatientId();

    public FormData selectFormDataById(@Param("id")Long id);
}
