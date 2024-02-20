package upc.edu.pe.api_examen_final_20201b270.serviceimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.api_examen_final_20201b270.entities.Student;
import upc.edu.pe.api_examen_final_20201b270.repositories.StudentRepository;
import upc.edu.pe.api_examen_final_20201b270.services.StudentService;

import java.util.List;
@Service
public class Studentserviceimplement implements StudentService {
    @Autowired
    private StudentRepository tR;
    @Override
    public void insert(Student student) {
        tR.save(student);
    }
}