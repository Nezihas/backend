package nezihas.example.securityapicrud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nezihas.example.securityapicrud.models.Horaire;
import nezihas.example.securityapicrud.repository.HoraireRepository;

@Service
public class HoraireServiceImpl implements HoraireService {

    @Autowired
    private HoraireRepository horaireRepository;

    @Override
    public List<Horaire> getAllHoraires() {
        return horaireRepository.findAll();
    }

    @Override
    public Horaire saveHoraire(Horaire horaire) {
        return this.horaireRepository.save(horaire);
    }

    @Override
    public Horaire getHoraireById(long id) {
        Optional<Horaire> optional = horaireRepository.findById(id);
        Horaire horaire = null;
        if (optional.isPresent()) {
            horaire = optional.get();
        } else {
            throw new RuntimeException("Horaire not found for id :: " + id);
        }
        return horaire;
    }

    @Override
    public void deleteHoraireById(long id) {
        horaireRepository.deleteById(id);
    }
}
