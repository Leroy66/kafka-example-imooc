package com.imooc.kafka.consumer;

import com.google.gson.Gson;
import com.imooc.kafka.common.MessageEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA
 * User: leroy
 * Time: 2018/10/31 15:48
 */
@Slf4j
@Component
public class SimpleConsumer {

    private final Gson gson = new Gson();

    @KafkaListener(topics = "${kafka.topic.default}", containerFactory = "kafkaListenerContainerFactory")
    public void receive(MessageEntity message) {
        log.info(gson.toJson(message));
    }

}
