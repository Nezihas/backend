package nezihas.example.securityapicrud.services;

import java.util.List;

import org.springframework.stereotype.Repository;

import nezihas.example.securityapicrud.entity.Superviseurs;

@Repository
public interface SuperviseurService {
    List<Superviseurs> getAllSuperviseurs();

    void saveSuperviseur(Superviseurs superviseur);

    Superviseurs getSuperviseurById(long id);

    void deleteSuperviseurById(long id);
}
