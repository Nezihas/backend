package nezihas.example.securityapicrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nezihas.example.securityapicrud.models.Horaire;

@Repository
public interface HoraireRepository extends JpaRepository<Horaire, Long> {
}