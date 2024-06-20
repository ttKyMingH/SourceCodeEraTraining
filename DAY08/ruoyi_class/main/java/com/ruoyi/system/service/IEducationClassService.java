package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.EducationClass;

/**
 * 班级管理Service接口
 * 
 * @author kkmingKy
 * @date 2024-06-20
 */
public interface IEducationClassService 
{
    /**
     * 查询班级管理
     * 
     * @param id 班级管理主键
     * @return 班级管理
     */
    public EducationClass selectEducationClassById(Long id);

    /**
     * 查询班级管理列表
     * 
     * @param educationClass 班级管理
     * @return 班级管理集合
     */
    public List<EducationClass> selectEducationClassList(EducationClass educationClass);

    /**
     * 新增班级管理
     * 
     * @param educationClass 班级管理
     * @return 结果
     */
    public int insertEducationClass(EducationClass educationClass);

    /**
     * 修改班级管理
     * 
     * @param educationClass 班级管理
     * @return 结果
     */
    public int updateEducationClass(EducationClass educationClass);

    /**
     * 批量删除班级管理
     * 
     * @param ids 需要删除的班级管理主键集合
     * @return 结果
     */
    public int deleteEducationClassByIds(Long[] ids);

    /**
     * 删除班级管理信息
     * 
     * @param id 班级管理主键
     * @return 结果
     */
    public int deleteEducationClassById(Long id);
}
