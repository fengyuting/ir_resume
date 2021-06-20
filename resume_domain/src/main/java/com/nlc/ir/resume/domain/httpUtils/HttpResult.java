package com.nlc.ir.resume.domain.httpUtils;
import java.io.Serializable;

/**
 * http基础信息返回
 */
public class HttpResult implements Serializable {

    /**
     * 状体码
     */
    private Integer statusCode;

    /**
     * 响应内容
     */
    private String content;

    public HttpResult() {

    }

    public HttpResult(Integer statusCode, String content) {
        this.statusCode = statusCode;
        this.content = content;
    }

    /**
     * 获取状体码
     *
     * @return 状体码
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * 设置状体码
     *
     * @param statusCode
     *            状体码
     */
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * 获取响应内容
     *
     * @return 响应内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置响应内容
     *
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public String toString() {
        return "HttpResult [statusCode=" + statusCode + ", content=" + content
                + "]";
    }

}
