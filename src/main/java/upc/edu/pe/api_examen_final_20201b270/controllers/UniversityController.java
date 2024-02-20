package upc.edu.pe.api_examen_final_20201b270.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.api_examen_final_20201b270.dtos.StudentDTO;
import upc.edu.pe.api_examen_final_20201b270.dtos.UniversityDTO;
import upc.edu.pe.api_examen_final_20201b270.entities.University;

import upc.edu.pe.api_examen_final_20201b270.services.UniversityService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class UniversityController {
    @Autowired
    private UniversityService universityService;

    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    @PostMapping("/universities")
    public void insertUniversity(@RequestBody UniversityDTO universityDTO){
        ModelMapper modelMapper = new ModelMapper();
        University university = modelMapper.map(universityDTO, University.class);
        universityService.insert(university);
    }

    @GetMapping("/listUniversity")
    @PreAuthorize("hasAuthority('USUARIO')")
    public List<UniversityDTO> listUniversities(){
        return universityService.list().stream().map(x -> {
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, UniversityDTO.class);
        }).collect(Collectors.toList());
    }
}
