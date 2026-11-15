package com.telusko.kafka.service;

import com.telusko.kafka.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    private String message;

    @KafkaListener(topics = "telusko", groupId = "telusko-consumer-group")
    public void consume(Course course)
    {
        message = course+ "Got the data from Kafka";
        System.out.println(message);
    }

    public String getMessage() {
        return message;
    }
}
