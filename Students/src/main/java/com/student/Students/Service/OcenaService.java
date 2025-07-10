package com.student.Students.Service;

import com.student.Students.Entity.Ocena;
import com.student.Students.Entity.Student;
import com.student.Students.Repository.OcenaRepository;
import com.student.Students.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OcenaService {
    @Autowired
    private OcenaRepository ocenaRepo;
    @Autowired
    private StudentRepository studentRepo;
    public Ocena dodajOcenuStudentu(int studentId, Ocena o) {
        Student student = studentRepo.getReferenceById(studentId);
        if (student == null) {
            System.out.println("Student ne postoji.");
            return null;
        }
        o.setStudent(student);
        return ocenaRepo.save(o);
    }
}
