package com.student.Students.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "ocene")
public class Ocena {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ocenaId")
    private int ocenaId;

    @ManyToOne
    @JoinColumn(name="studentId")
    @JsonBackReference
    private Student student;

    @Column(name = "ocena")
    private int ocena;

    public int getOcenaId() {
        return ocenaId;
    }

    public void setOcenaId(int ocenaId) {
        this.ocenaId = ocenaId;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student s){
        this.student = s;
    }
}
