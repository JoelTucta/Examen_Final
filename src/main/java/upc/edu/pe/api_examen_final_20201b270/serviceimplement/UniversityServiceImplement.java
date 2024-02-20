package upc.edu.pe.api_examen_final_20201b270.serviceimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.api_examen_final_20201b270.entities.University;
import upc.edu.pe.api_examen_final_20201b270.repositories.UnviversityRepository;
import upc.edu.pe.api_examen_final_20201b270.services.UniversityService;

import java.util.List;
@Service
public class UniversityServiceImplement implements UniversityService {
    @Autowired
    private UnviversityRepository aR;
    @Override
    public void insert(University university) {
        aR.save(university);
    }

    @Override
    public List<University> list() {
        return aR.findAll();
    }

    @Override
    public University listId(Long id) {
        return aR.findById(id).orElse(new University());
    }
}
