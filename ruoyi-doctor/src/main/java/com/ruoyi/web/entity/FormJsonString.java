package com.ruoyi.web.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Title: FormJsonString
 * @Author David
 * @Package com.ruoyi.web.controller.Entity
 * @Date 2024/8/29 下午4:16
 * @description: 表单json字符串
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FormJsonString {
    private String jsonStr;
    private String optionsStr;
}