package com.example.datajpa.Service;

import com.example.datajpa.Modal.Student;
import com.example.datajpa.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {

    @Autowired
    StudentRepo st;

    public List<Student> allStudent() {

        return st.findAll();

    }

    public void addStudent(Student std){
       st.save(std);
    }


    public Student getStudent(int rn) {
        return (Student) st.findById(rn).orElse(new Student());
    }

    public void updateStudent(Student std) {
        st.save(std);

    }

    public void deleteStudent() {
        st.deleteAll();
    }

    public void dStudent(int i) {
        st.deleteById(i);
    }

    public List<Student> getByNameAndT(String name, String tech) {
        return st.findByNameAndTech(name, tech);
    }

    public Student getByNamendGender(String name, String gender) {
        return st.getByNameAndGender(name, gender);
    }
}
