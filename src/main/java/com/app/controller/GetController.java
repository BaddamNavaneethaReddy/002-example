package com.app.controller;

import com.app.model.Student;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class GetController {

    @GetMapping(value = "/api1", produces = MediaType.TEXT_PLAIN_VALUE)
    public String helloWorld() {
        return "Hello World";

    }

    @GetMapping(value = "/api2",produces=MediaType.APPLICATION_JSON_VALUE)
    public Student student1() {
        Student student = new Student();
        student.setId(1);
        student.setCourse("java");
        student.setName("nava");
        return student;
    }

    @GetMapping(value = "/api3",produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Student> student2() {
        Student student = new Student();
        student.setId(1);
        student.setCourse("java");
        student.setName("nava");
        return ResponseEntity.ok(student);
    }

    @GetMapping(value = "/api4",produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Student> student3() {
        Student student = new Student();
        student.setId(1);
        student.setCourse("java");
        student.setName("nava");
        List<Student> students = new ArrayList<>();
        students.add(student);
        return students;
    }

    @GetMapping(value="/api5/{id1}/{name1}/{course1}",produces=MediaType.APPLICATION_JSON_VALUE)
    public Student student4(@PathVariable("id1")Integer id,
                            @PathVariable("name1")String name,
                            @PathVariable("course1")String course){
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setCourse(course);
        return student;
    }
@GetMapping(value="/api6",produces=MediaType.APPLICATION_JSON_VALUE)
    public Student student5(@RequestHeader("id1")Integer id,
                            @RequestHeader("name1")String name,
                            @RequestHeader(value = "course1", required = false, defaultValue = "UNKNOWN")String course){
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setCourse(course);
        return student;
    }

    @GetMapping(value="/api7",produces=MediaType.APPLICATION_JSON_VALUE)
    public Student student6(@RequestParam("id1")Integer id,
                            @RequestParam("name1")String name,
                            @RequestParam(value = "course1", required = false, defaultValue = "UNKNOWN")String course){
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setCourse(course);
        return student;
    }

    @GetMapping(value="/api8/{id1}",produces=MediaType.APPLICATION_JSON_VALUE)
    public Student student7(@PathVariable("id1")Integer id,
                            @RequestHeader("name1")String name,
                            @RequestParam(value = "course1", required = false, defaultValue = "UNKNOWN")String course){
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setCourse(course);
        return student;
    }


}
