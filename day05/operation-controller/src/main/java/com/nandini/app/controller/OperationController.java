package com.nandini.app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class OperationController {
    @GetMapping("/add")
    public long add(@RequestParam("a") long a,@RequestParam("b")long b){
        return a+b;
    }

    @PostMapping("/sub")
    public long sub(@RequestParam("a")long a,@RequestParam("b")long b){
        return a-b;
    }

    @PutMapping("/mul")
    public long mul(@RequestParam("a")long a,@RequestParam("b")long b){
        return a*b;
    }

}
