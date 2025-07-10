package com.student.Students.Controller;

import com.student.Students.Entity.Student;
import com.student.Students.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudent();
    }
    @PostMapping
    public Student addStudent(@RequestBody Student s){
        return studentService.saveStudent(s);
    }
}
