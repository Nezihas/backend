package nezihas.example.securityapicrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nezihas.example.securityapicrud.entity.Permissions;

@Repository
public interface PermissionRepository extends JpaRepository<Permissions, Long> {
}
