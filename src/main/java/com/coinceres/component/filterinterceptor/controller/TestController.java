package com.coinceres.component.filterinterceptor.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("one")
    public ResponseEntity<String> test() {
        System.out.println("controller1 is executing");
        return ResponseEntity.ok("hello world!");
    }

    @GetMapping("two")
    public ResponseEntity<String> test2() {
        System.out.println("controller2 is executing");
        return ResponseEntity.ok("hello world!");
    }
}
