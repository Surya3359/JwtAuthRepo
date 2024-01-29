package com.Restapi.Lion.Repository;

import java.util.Optional;
import com.Restapi.Lion.Models.Emode;
import com.Restapi.Lion.Models.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RoleRepository extends JpaRepository<Roles,Integer> {
	Optional<Roles> findByName(Emode name);
}
