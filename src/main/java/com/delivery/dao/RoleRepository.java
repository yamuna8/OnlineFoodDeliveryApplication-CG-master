package com.delivery.dao;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.delivery.entities.Role;
import com.delivery.entities.Roles;


public interface RoleRepository extends JpaRepository<Role, Integer>{
	Optional<Role> findByRoleName(Roles role);
}
