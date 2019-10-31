package com.helloworld.controller;

import com.helloworld.domain.HelloWorldEntity;
import com.helloworld.service.HelloWorldService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api/v1/helloworld")

public class MainController {

    @Autowired
    HelloWorldService helloWorldService;

    @PostMapping(value = "")
    public ResponseEntity<HelloWorldEntity> findByMsisdn(@RequestBody HelloWorldEntity helloWorldEntity) {
        return ResponseEntity.ok(helloWorldService.doSomethingWithEntity(helloWorldEntity));
    }
}