package com.app.controller;

import com.app.model.Student;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value="/post/api/v1")
public class PostController {

    @PostMapping(value = "/api1", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public/* Map<String, String>*/ Student method1(@RequestBody Student student) {
        // return Map.of("key1", "value1");
        return student;
    }

}