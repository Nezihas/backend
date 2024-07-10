package nezihas.example.securityapicrud.services;

import java.util.List;

import nezihas.example.securityapicrud.models.Horaire;

public interface HoraireService {
    List<Horaire> getAllHoraires();

    Horaire saveHoraire(Horaire horaire);

    Horaire getHoraireById(long id);

    void deleteHoraireById(long id);
}
