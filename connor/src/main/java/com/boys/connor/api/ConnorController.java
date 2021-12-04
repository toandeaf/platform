package com.boys.connor.api;

import com.boys.connor.service.ConnorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/connor")
public class ConnorController
{
    private ConnorService connorService;

    @Autowired
    public ConnorController(ConnorService connorService) {
        this.connorService = connorService;
    }

    @GetMapping("/fetch")
    public String greetings() {
        return "Hey it's me, connor!";
    }

    @GetMapping("/test")
    public String test() {
        return connorService.saveMongo();
    }
}
