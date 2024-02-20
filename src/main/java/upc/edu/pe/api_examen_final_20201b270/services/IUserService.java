package upc.edu.pe.api_examen_final_20201b270.services;

import upc.edu.pe.api_examen_final_20201b270.entities.Users;

import java.util.List;

public interface IUserService {
    public Integer insert(Users user);

    List<Users> list();
}
