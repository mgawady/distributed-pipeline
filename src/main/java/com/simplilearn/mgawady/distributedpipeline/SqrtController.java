package com.simplilearn.mgawady.distributedpipeline;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SqrtController {

    @RequestMapping("/")
    public Double sqrt(@RequestParam int number){

        return Math.sqrt(number);
    }
}
