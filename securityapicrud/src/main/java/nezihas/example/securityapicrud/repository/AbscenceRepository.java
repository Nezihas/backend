package nezihas.example.securityapicrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nezihas.example.securityapicrud.models.Abscence;

public interface AbscenceRepository extends JpaRepository<Abscence, Long> {
}
