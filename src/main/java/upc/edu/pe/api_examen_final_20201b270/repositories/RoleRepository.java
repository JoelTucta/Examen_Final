package upc.edu.pe.api_examen_final_20201b270.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upc.edu.pe.api_examen_final_20201b270.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
