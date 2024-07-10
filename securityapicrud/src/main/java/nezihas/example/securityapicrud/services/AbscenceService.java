package nezihas.example.securityapicrud.services;

import java.util.List;

import nezihas.example.securityapicrud.models.Abscence;

public interface AbscenceService {
    List<Abscence> getAllAbscences();

    void saveAbscence(Abscence abscence);

    Abscence getAbscenceById(long id);

    void deleteAbscenceById(long id);
}
