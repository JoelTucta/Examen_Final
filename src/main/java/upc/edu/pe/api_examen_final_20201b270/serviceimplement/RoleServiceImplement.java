package upc.edu.pe.api_examen_final_20201b270.serviceimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upc.edu.pe.api_examen_final_20201b270.entities.Role;
import upc.edu.pe.api_examen_final_20201b270.repositories.RoleRepository;
import upc.edu.pe.api_examen_final_20201b270.services.IRoleService;

import java.util.List;

@Service
public class RoleServiceImplement implements IRoleService {
    @Autowired
    private RoleRepository rR;


    @Override
    public void insert(Role jrrole) {
        rR.save(jrrole);
    }

    @Override
    public List<Role> list() {
        return rR.findAll();
    }
}
