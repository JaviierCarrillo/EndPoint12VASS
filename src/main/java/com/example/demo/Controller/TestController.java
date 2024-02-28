package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("Test/Status")
    public String getStatus(@RequestParam int value){
        return value >= 3 ? "Aprobado" : "Reprobado";
    }
}
