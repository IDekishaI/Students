package com.student.Students.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "studenti")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "studentId")
    private int studentId;
    @Column(name = "ime")
    private String ime;
    @Column(name = "prezime")
    private String prezime;
    @Column(name = "grupa")
    private String grupa;

    @OneToMany(mappedBy="student", cascade=CascadeType.ALL)
    @JsonManagedReference
    private List<Ocena> ocene = new ArrayList<>();

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getGrupa() {
        return grupa;
    }

    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }

    public List<Ocena> getOcene() {
        return ocene;
    }

    public void setOcene(List<Ocena> ocene) {
        this.ocene = ocene;
    }
}
