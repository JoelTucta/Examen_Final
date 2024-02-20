package upc.edu.pe.api_examen_final_20201b270.services;

import upc.edu.pe.api_examen_final_20201b270.entities.University;

import java.util.List;

public interface UniversityService {
    public void insert( University university);
    List<University> list();
    public University listId(Long id);
}
