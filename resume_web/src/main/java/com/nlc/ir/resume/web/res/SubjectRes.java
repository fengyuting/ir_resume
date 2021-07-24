package com.nlc.ir.resume.web.res;

import com.nlc.ir.resume.service.bo.SubjectBo;
import com.nlc.ir.resume.web.common.BaseResponse;
import com.nlc.ir.resume.web.common.ResCode;
import lombok.Data;

import java.util.List;

@Data
public class SubjectRes extends BaseResponse {

    List<SubjectBo> data;

    public static SubjectRes fail(ResCode resCode){
        SubjectRes res = new SubjectRes();
        res.setSuccess(false);
        res.setCode(resCode.getCode());
        res.setMsg(resCode.getMsg());
        return  res;
    }


    public static SubjectRes success(){
        SubjectRes res = new SubjectRes();
        res.setSuccess(true);
        res.setCode(ResCode.SUCCESS.getCode());
        res.setMsg(ResCode.SUCCESS.getCode());
        return  res;
    }

    public static SubjectRes error(){
        SubjectRes res = new SubjectRes();
        res.setSuccess(false);
        res.setCode(ResCode.ERROR.getCode());
        res.setMsg(ResCode.ERROR.getCode());
        return  res;
    }
}
