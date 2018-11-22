package com.alibaba.xinan.sirs.entity.vo;

import com.alibaba.xinan.sirs.enums.ResponseEnum;
import lombok.Data;

/**
 * @author XinAnzzZ
 * @date 2018/6/22 12:14
 */
@Data
@SuppressWarnings("unused")
public class ResponseVO<T> {

    private Integer code;

    private String msg;

    private T obj;

    private ResponseVO() {
        this.code = 200;
        this.msg = "success";
    }

    private ResponseVO(T obj) {
        this.code = 200;
        this.msg = "success";
        this.obj = obj;
    }

    public ResponseVO(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseVO(ResponseEnum responseEnum) {
        this.code = responseEnum.getCode();
        this.msg = responseEnum.getMsg();
    }

    public ResponseVO(int code, String msg, T obj) {
        this.code = code;
        this.msg = msg;
        this.obj = obj;
    }

    public static ResponseVO success() {
        return new ResponseVO<>();
    }

    public static ResponseVO success(Object obj) {
        return new ResponseVO<>(obj);
    }

    public static ResponseVO fail(ResponseEnum responseEnum) {
        ResponseVO responseJson = new ResponseVO<>();
        responseJson.setCode(responseEnum.getCode());
        responseJson.setMsg(responseEnum.getMsg());
        return responseJson;
    }

    public static ResponseVO fail(String msg) {
        ResponseVO responseJson = new ResponseVO<>();
        responseJson.setCode(400);
        responseJson.setMsg(msg);
        return responseJson;
    }

    public static ResponseVO fail(int code, String msg) {
        ResponseVO responseJson = new ResponseVO<>();
        responseJson.setCode(code);
        responseJson.setMsg(msg);
        return responseJson;
    }
}
