package upc.edu.pe.api_examen_final_20201b270.serviceimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upc.edu.pe.api_examen_final_20201b270.entities.Users;
import upc.edu.pe.api_examen_final_20201b270.repositories.UserRepository;
import upc.edu.pe.api_examen_final_20201b270.services.IUserService;

import java.util.List;

@Service
public class UserServiceImplement implements IUserService {
    @Autowired
    private UserRepository uR;

    @Override
    public Integer insert(Users user) {
        int rpta = uR.buscarUsername(user.getUsername());
        if (rpta == 0) {
            uR.save(user);
        }
        return rpta;
    }

    @Override
    public List<Users> list() {
        // TODO Auto-generated method stub
        return uR.findAll();
    }
}
