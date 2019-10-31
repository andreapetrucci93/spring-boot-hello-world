package com.helloworld.service;

import com.helloworld.domain.HelloWorldEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class HelloWorldService {
    
    public HelloWorldEntity doSomethingWithEntity(HelloWorldEntity helloWorldEntity) {
        String hello = helloWorldEntity.getHello();
        String world = helloWorldEntity.getWorld();

        HelloWorldEntity response = new HelloWorldEntity();
        response.setHello(hello + " hello!!!");
        response.setWorld(world + " world!!!");
        return response;
    }

}