package com.nlc.ir.resume.service.impl;

import com.nlc.ir.resume.dao.ResumeAnswerDao;
import com.nlc.ir.resume.dao.ResumeSubjectDao;
import com.nlc.ir.resume.domain.resume.ResumeAnswer;
import com.nlc.ir.resume.domain.resume.ResumeSubject;
import com.nlc.ir.resume.service.SubjectService;
import com.nlc.ir.resume.service.bo.AnswerBo;
import com.nlc.ir.resume.service.bo.SubjectBo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 答题服务
 */
@Service
public class SubjectServiceImpl implements SubjectService {

    @Resource
    private ResumeSubjectDao resumeSubjectDao;

    @Resource
    private ResumeAnswerDao resumeAnswerDao;

    @Override
    public List<SubjectBo> getSubjectList() {
        List<ResumeSubject> subjects =   resumeSubjectDao.selectAll();
        if(null == subjects){
            return null;
        }
        List<ResumeAnswer> answerBos = resumeAnswerDao.selectAll();
        if(null == answerBos){
            return null;
        }
        List<SubjectBo> subjectBos = new ArrayList<>();
        for(ResumeSubject subject : subjects){
            SubjectBo subjectBo = new SubjectBo();
            subject.setNum(subject.getNum());
            subject.setContent(subject.getContent());
            subject.setType(subject.getType());

            List<AnswerBo> abos = new ArrayList<>();
            for(ResumeAnswer resumeAnswer : answerBos){
                AnswerBo answerBo = new AnswerBo();
                answerBo.setNum(resumeAnswer.getNum());
                answerBo.setContent(resumeAnswer.getContent());
                abos.add(answerBo);
            }
            subjectBo.setAnswer(abos);
        }
        return subjectBos;
    }
}
