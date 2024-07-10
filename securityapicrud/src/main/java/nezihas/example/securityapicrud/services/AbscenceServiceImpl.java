package nezihas.example.securityapicrud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nezihas.example.securityapicrud.models.Abscence;
import nezihas.example.securityapicrud.repository.AbscenceRepository;

@Service
public class AbscenceServiceImpl implements AbscenceService {

    @Autowired
    private AbscenceRepository abscenceRepository;

    @Override
    public List<Abscence> getAllAbscences() {
        return abscenceRepository.findAll();
    }

    @Override
    public void saveAbscence(Abscence abscence) {
        this.abscenceRepository.save(abscence);
    }

    @Override
    public Abscence getAbscenceById(long id) {
        Optional<Abscence> optional = abscenceRepository.findById(id);
        Abscence abscence = null;
        if (optional.isPresent()) {
            abscence = optional.get();
        } else {
            throw new RuntimeException("Abscence not found for id :: " + id);
        }
        return abscence;
    }

    @Override
    public void deleteAbscenceById(long id) {
        this.abscenceRepository.deleteById(id);
    }
}
