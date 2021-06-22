package com.linging.model.vo;

import java.io.Serializable;

/**
 * @author Linging
 * @version 1.0.0
 * @since 1.0
 */
public class ResponseVo<T> implements Serializable {

    private int code;

    private T data;

    public ResponseVo() {
    }

    public ResponseVo(int code, T data) {
        this.code = code;
        this.data = data;
    }


    public static <T> ResponseVo<T> ok(){
        return new ResponseVo<T>(200,null);
    }

    public static <T> ResponseVo<T> ok(T data){
        return new ResponseVo<T>(200, data);
    }

    public static <T> ResponseVo<T> ok(int code, T data){
        return new ResponseVo<T>(code, data);
    }

    public static <T> ResponseVo<T> commonRes(int code, T data){
        return new ResponseVo<T>(code, data);
    }


    public static <T> ResponseVo<T> fail(){
        return new ResponseVo<T>(500,null);
    }

    public static <T> ResponseVo<T> fail(T data){
        return new ResponseVo<T>(500, data);
    }

    public static <T> ResponseVo<T> fail(int code, T data){
        return new ResponseVo<T>(code, data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseVo{" +
                "code=" + code +
                ", data=" + data +
                '}';
    }
}

