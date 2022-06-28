package com.service1.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class controller1 {
    @Autowired
    public RestTemplate template;


    @GetMapping("/call1")
    public String call1(){
        return "call1" + "new Change";
    }

    @GetMapping("/call3")
    public String call3(){
        return template.getForObject("http://localhost:8082/service2Call2", String.class);
    }
    

    @GetMapping("/call4")
    public String call4(){
        return template.getForObject("http://localhost:8083/service3Call1", String.class);


    }
}

