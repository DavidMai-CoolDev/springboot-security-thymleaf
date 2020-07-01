package com.example.selflearning.demo.thymleafsercurity.repository;

import com.example.selflearning.demo.thymleafsercurity.emtity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByRole(String role);

}
