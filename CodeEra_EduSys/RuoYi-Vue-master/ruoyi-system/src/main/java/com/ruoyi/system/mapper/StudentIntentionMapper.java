package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.StudentIntention;

/**
 * student_intentionMapper接口
 * 
 * @author ttKymingH
 * @date 2024-06-24
 */
public interface StudentIntentionMapper 
{
    /**
     * 查询student_intention
     * 
     * @param recordId student_intention主键
     * @return student_intention
     */
    public StudentIntention selectStudentIntentionByRecordId(Long recordId);

    /**
     * 查询student_intention列表
     * 
     * @param studentIntention student_intention
     * @return student_intention集合
     */
    public List<StudentIntention> selectStudentIntentionList(StudentIntention studentIntention);

    /**
     * 新增student_intention
     * 
     * @param studentIntention student_intention
     * @return 结果
     */
    public int insertStudentIntention(StudentIntention studentIntention);

    /**
     * 修改student_intention
     * 
     * @param studentIntention student_intention
     * @return 结果
     */
    public int updateStudentIntention(StudentIntention studentIntention);

    /**
     * 删除student_intention
     * 
     * @param recordId student_intention主键
     * @return 结果
     */
    public int deleteStudentIntentionByRecordId(Long recordId);

    /**
     * 批量删除student_intention
     * 
     * @param recordIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStudentIntentionByRecordIds(Long[] recordIds);
}
