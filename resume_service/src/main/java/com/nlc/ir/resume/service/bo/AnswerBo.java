package com.nlc.ir.resume.service.bo;

import lombok.Data;

import java.io.Serializable;

@Data
public class AnswerBo implements Serializable {

    /**
     * 答案编码
     */
    private String num;

    /**
     * 答案内容
     */
    private String content;
}
