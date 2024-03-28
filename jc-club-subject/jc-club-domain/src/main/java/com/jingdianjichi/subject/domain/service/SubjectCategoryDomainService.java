package com.jingdianjichi.subject.domain.service;

import com.jingdianjichi.subject.domain.entity.SubjectCategoryBO;

import java.util.List;

/**
 * @description:
 * @author: asus
 * @time: 2024/3/12 16:46
 */
public interface SubjectCategoryDomainService {
    void add(SubjectCategoryBO subjectCategoryBO);

    /**
     * 查询岗位大类
     *
     * @author: guaiwu
     * @time: 2024/3/26 14:18
     */
    List<SubjectCategoryBO> queryCategory(SubjectCategoryBO subjectCategoryBO);

    /**
     * 更新分类
     *
     * @author: guaiwu
     * @time: 2024/3/26 18:31
     */

    Boolean update(SubjectCategoryBO subjectCategoryBO);

    /**
     * 删除分类
     *
     * @author: guaiwu
     * @time: 2024/3/27 8:39
     */
    Boolean delete(SubjectCategoryBO subjectCategoryBO);
}
