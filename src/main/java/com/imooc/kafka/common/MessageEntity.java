package com.imooc.kafka.common;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by IntelliJ IDEA
 * User: leroy
 * Time: 2018/10/30 14:15
 */
@Getter
@Setter
public class MessageEntity {
    private String title;
    private String body;

    @Override
    public String toString() {
        return "MessageEntity{" + "title='" + title + '\'' + ", body='" + body + '\'' + '}';
    }
}
