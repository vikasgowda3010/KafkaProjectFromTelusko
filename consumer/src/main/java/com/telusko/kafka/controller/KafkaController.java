package com.telusko.kafka.controller;

import com.telusko.kafka.model.Course;
import com.telusko.kafka.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private KafkaService service;

    @GetMapping("/get-course")
    public ResponseEntity<String> getCourse()
    {
        String response = service.getMessage();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
