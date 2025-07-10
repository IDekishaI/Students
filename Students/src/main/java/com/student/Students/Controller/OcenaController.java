package com.student.Students.Controller;

import com.student.Students.Entity.Ocena;
import com.student.Students.Service.OcenaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ocene")
public class OcenaController {
    @Autowired
    private OcenaService ocenaService;

    @PostMapping("/{studentId}")
    public Ocena addOcena(@PathVariable int studentId, @RequestBody Ocena ocena){
        return ocenaService.dodajOcenuStudentu(studentId, ocena);
    }
}
