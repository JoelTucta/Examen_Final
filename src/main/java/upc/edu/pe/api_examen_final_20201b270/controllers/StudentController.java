package upc.edu.pe.api_examen_final_20201b270.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.api_examen_final_20201b270.dtos.StudentDTO;
import upc.edu.pe.api_examen_final_20201b270.entities.Student;
import upc.edu.pe.api_examen_final_20201b270.services.StudentService;


@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentService tS;

    @PostMapping("/student")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public void insertStudent( @RequestBody StudentDTO dtostudent){
        ModelMapper m = new ModelMapper();
        Student v = m.map(dtostudent, Student.class);
        tS.insert(v);
    }



}
