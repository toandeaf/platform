package com.boys.mcnab.api;

import com.boys.mcnab.service.McNabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/mcnab")
public class McNabController
{
    private McNabService mcNabService;

    @Autowired
    public McNabController(McNabService mcNabService) {
        this.mcNabService = mcNabService;
    }

    @GetMapping("/fetch")
    public String greetings() {
        return "Hey it's me, McNab!";
    }

    @GetMapping("/test")
    public String test() {
        return mcNabService.saveMongo();
    }
}
