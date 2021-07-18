package com.nlc.ir.resume.domain.resume;

import java.io.Serializable;
import java.util.Date;

/**
 * resume_answer
 * @author 
 */
public class ResumeAnswer implements Serializable {
    private Integer id;

    /**
     * 答案编号
     */
    private Short num;

    /**
     * 答案内容
     */
    private String content;

    /**
     * 题目编号
     */
    private Short subjectNum;

    /**
     * 标签编号
     */
    private Short tagNum;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getNum() {
        return num;
    }

    public void setNum(Short num) {
        this.num = num;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Short getSubjectNum() {
        return subjectNum;
    }

    public void setSubjectNum(Short subjectNum) {
        this.subjectNum = subjectNum;
    }

    public Short getTagNum() {
        return tagNum;
    }

    public void setTagNum(Short tagNum) {
        this.tagNum = tagNum;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}