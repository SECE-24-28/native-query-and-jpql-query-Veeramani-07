package com.example.datajpa.Repository;

import com.example.datajpa.Modal.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo<id> extends JpaRepository<Student,id> {
    List<Student> findByNameAndTech(String name, String tech);

    @Query(
            value = "SELECT * FROM student WHERE name = :name AND gender = :gender",
            nativeQuery = true

    )
    Student getByNameAndGender(
            @Param("name") String name,
            @Param("gender") String gender);



}
