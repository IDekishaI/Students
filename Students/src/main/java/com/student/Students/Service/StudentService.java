package com.student.Students.Service;

import com.student.Students.Entity.Student;
import com.student.Students.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepo;

    public List<Student> getAllStudent(){
        return studentRepo.findAll();
    }
    public Student saveStudent(Student s){
        return studentRepo.save(s);
    }
}
