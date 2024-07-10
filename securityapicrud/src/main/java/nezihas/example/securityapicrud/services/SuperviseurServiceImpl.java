package nezihas.example.securityapicrud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nezihas.example.securityapicrud.entity.Superviseurs;
import nezihas.example.securityapicrud.repository.SuperviseurRepository;

@Service
public class SuperviseurServiceImpl implements SuperviseurService {

    @Autowired
    private SuperviseurRepository superviseurRepository;

    @Override
    public List<Superviseurs> getAllSuperviseurs() {
        return superviseurRepository.findAll();
    }

    @Override
    public void saveSuperviseur(Superviseurs superviseur) {
        superviseurRepository.save(superviseur);
    }

    @Override
    public Superviseurs getSuperviseurById(long id) {
        Optional<Superviseurs> optional = superviseurRepository.findById(id);
        Superviseurs superviseur = null;
        if (optional.isPresent()) {
            superviseur = optional.get();
        } else {
            throw new RuntimeException("Superviseur not found for id :: " + id);
        }
        return superviseur;
    }

    @Override
    public void deleteSuperviseurById(long id) {
        superviseurRepository.deleteById(id);
    }
}
