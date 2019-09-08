package com.zq.controller;

import com.zq.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @author ZQ
 * @create 2019-09-07
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonHandler {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return restTemplate.getForObject("http://privder/student/findAll", Collection.class);
    }
    @GetMapping("/index")
    public String index(){
        return restTemplate.getForObject("http://privder/student/index",String.class);
    }

}
