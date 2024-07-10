package nezihas.example.securityapicrud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import nezihas.example.securityapicrud.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
