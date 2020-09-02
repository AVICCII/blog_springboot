package com.aviccii.cc.result;

import lombok.Data;

/**
 * @author aviccii 2020/8/28
 * @Discrimination
 */

@Data
public class Result {
    private int code;
    private String message;
    private Object result;

    Result(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.result = data;
    }
}