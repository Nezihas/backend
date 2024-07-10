package nezihas.example.securityapicrud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nezihas.example.securityapicrud.entity.Superviseurs;
import nezihas.example.securityapicrud.services.SuperviseurService;

@RestController
@RequestMapping("/api/superviseurs")
public class SuperviseurController {

    @Autowired
    private SuperviseurService superviseurService;

    @GetMapping
    public List<Superviseurs> getAllSuperviseurs() {
        return superviseurService.getAllSuperviseurs();
    }

    @PostMapping
    public void createSuperviseur(@RequestBody Superviseurs superviseur) {
        superviseurService.saveSuperviseur(superviseur);
    }

    @GetMapping("/{id}")
    public Superviseurs getSuperviseurById(@PathVariable Long id) {
        return superviseurService.getSuperviseurById(id);
    }

    @PutMapping("/{id}")
    public void updateSuperviseur(@PathVariable Long id, @RequestBody Superviseurs superviseur) {
        Superviseurs existingSuperviseur = superviseurService.getSuperviseurById(id);
        if (existingSuperviseur != null) {
            superviseur.setId(id);
            superviseurService.saveSuperviseur(superviseur);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteSuperviseur(@PathVariable Long id) {
        superviseurService.deleteSuperviseurById(id);
    }
}
