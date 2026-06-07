package com.example.apicall.Service;

import com.example.apicall.Modal.Student;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    List<Student> s=  new ArrayList<>(Arrays.asList(
            new Student(1,"veera","ece"),
            new Student(2,"tamil","cse")
    ));



    public List<Student> getAllStudents() {

      /*  s.getId();
        s.getName();
        s.getTech()  */


        return s;

    }

    public Student getstudent(int id){
        int i=0;
        while(i<s.size()){
            if(s.get(i).getId() == id){
                return s.get(i);
            }
            i++;
        }
        return null;
    }


    public void addStudent(Student std){
       s.add(std);
    }


    public void updateStudent(Student std){
        for(int i=0;i<s.size();i++){
            if(s.get(i).getId()==std.getId()){
                s.get(i).setName(std.getName());
                s.get(i).setTech(std.getTech());

            }
        }
    }


    public void deleteStudent(int r) {
        boolean f=false;
        for(int i=0;i<s.size();i++){
            if(s.get(i).getId()==r){
                s.remove(r);
                f=true;
                break;
            }


        }

    }
}
