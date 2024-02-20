package upc.edu.pe.api_examen_final_20201b270.services;


import upc.edu.pe.api_examen_final_20201b270.entities.Role;

import java.util.List;

public interface IRoleService {
    public void insert(Role role);

    List<Role> list();
}
