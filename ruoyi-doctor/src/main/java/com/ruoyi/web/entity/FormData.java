package com.ruoyi.web.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

/**
 * @Title: FormData
 * @Author David
 * @Package com.ruoyi.web.entity
 * @Date 2024/8/30 下午4:50
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FormData {
    private Long id;
    private String formName;
    private Long createUsrid;
    private Long updateUsrid;
    private Long deleteUsrid;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updateTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime deleteTime;
    private Byte status;
    private FormJsonString formJsonString;
    private Long patientId;
}
