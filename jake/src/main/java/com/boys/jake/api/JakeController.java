package com.boys.jake.api;

import com.boys.jake.service.JakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/jake")
public class JakeController
{
    private JakeService jakeService;

    @Autowired
    public JakeController(JakeService jakeService) {
        this.jakeService = jakeService;
    }

    @GetMapping("/fetch")
    public String greetings() {
        return "Hey it's me, Jake!";
    }

    @GetMapping("/test")
    public String test() {
        return jakeService.saveMongo();
    }
}
