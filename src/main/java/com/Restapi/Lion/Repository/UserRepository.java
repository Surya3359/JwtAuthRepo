package com.Restapi.Lion.Repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Restapi.Lion.Models.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
	
	Optional<Users>findByUsername(String username);
	
	Boolean existsByUsername(String username);
	Boolean existsByEmail(String email);

}
