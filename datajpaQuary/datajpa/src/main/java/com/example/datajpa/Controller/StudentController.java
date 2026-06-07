package com.example.datajpa.Controller;

import com.example.datajpa.Modal.Student;
import com.example.datajpa.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService s;


    @GetMapping("students")
    public List<Student> allStudent(){
       return s.allStudent();

    }

    @PostMapping("students")
    public String addStudent(@RequestBody Student std){
        s.addStudent(std);
        return "Added successfully";
    }

    @GetMapping("students/{id}")
    public Student getStudent(@PathVariable("id") int rn){
       return s.getStudent(rn);

    }

    @PutMapping("students")
    public String updateStudent(@RequestBody Student std){
        s.updateStudent(std);
        return "Updateded successfully";
    }

    @DeleteMapping("students")
    public String deleteStudent(){
        s.deleteStudent();
        return "deleted all Student sucessfully";
    }

    @DeleteMapping("Students/{id}")
    public String dStudent(@PathVariable("id") int i){
        s.dStudent(i);
        return "sucess";
    }

    @GetMapping("students/custom")
    public Student getStudent(@Param("name") String name,
                              @Param("tech") String tech) {
        return   (Student) s.getByNameAndT(name, tech);
    }


    @GetMapping("students/custom1")
    public Student getByNameAndGender(@Param("name") String name,
                              @Param("gender") String gender) {
        return   (Student) s.getByNameAndT(name,gender);
    }




}
