package com.jingdianjichi.subject.application.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: guaiwu
 * @time: 2024/3/12 18:28
 */
@Data
public class SubjectLabelDTO implements Serializable {

    /**
     * 主键
     */
    private Long id;

    /**
     * 分类id
     */
    private Long categoryId;

    /**
     * 标签分类
     */
    private String labelName;
    /**
     * 排序
     */
    private Integer sortNum;

}

