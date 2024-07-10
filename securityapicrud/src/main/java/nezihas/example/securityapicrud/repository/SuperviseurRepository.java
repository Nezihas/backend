package nezihas.example.securityapicrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nezihas.example.securityapicrud.entity.Superviseurs;

@Repository
public interface SuperviseurRepository extends JpaRepository<Superviseurs, Long> {

}
