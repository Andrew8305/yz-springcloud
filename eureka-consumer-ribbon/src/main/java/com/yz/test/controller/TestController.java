package com.yz.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/user/{id}")
    public String findById(@PathVariable Long id) {
        return restTemplate.getForObject("http://eureka-client/user/" + id, String.class);
    }

}

