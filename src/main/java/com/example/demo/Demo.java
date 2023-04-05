package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Demo {

    @GetMapping("test")
    public ResponseEntity<?> test()
    {
        return ResponseEntity.ok("salom");
    }
}
