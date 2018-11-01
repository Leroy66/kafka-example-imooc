package com.imooc.kafka.common;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by IntelliJ IDEA
 * User: leroy
 * Time: 2018/10/30 14:20
 */
@Getter
@Setter
public class Response {
    private int code;
    private String message;

    public Response(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
