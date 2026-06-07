package com.example.apicall.Controller;

import com.example.apicall.Modal.Student;
import com.example.apicall.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService s;

    @GetMapping("students")
    public List<Student> getAllStudents(){
       return s.getAllStudents();

    }

    @GetMapping("students/{id}")
    public Student getstudent(@PathVariable("id") int roll){
        return s.getstudent(roll);
    }

    @PostMapping("students")
    public String addStudent(@RequestBody Student std){
        s.addStudent(std);
        return "Student Added";

    }

    @PutMapping("students/{id}")
    public String updateStudent(@RequestBody Student std){
        s.updateStudent(std);
        return "Updated sucessfully";
    }

    @DeleteMapping("students/{id}")
    public void deleteStudent(@PathVariable("id") int r){
        s.deleteStudent(r);
    }



}
