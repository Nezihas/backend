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

import nezihas.example.securityapicrud.models.Abscence;
import nezihas.example.securityapicrud.services.AbscenceService;

@RestController
@RequestMapping("/api/abscences")
public class AbscenceController {

    @Autowired
    private AbscenceService abscenceService;

    @GetMapping
    public List<Abscence> getAllAbscences() {
        return abscenceService.getAllAbscences();
    }

    @PostMapping
    public void createAbscence(@RequestBody Abscence abscence) {
        abscenceService.saveAbscence(abscence);
    }

    @GetMapping("/{id}")
    public Abscence getAbscenceById(@PathVariable Long id) {
        return abscenceService.getAbscenceById(id);
    }

    @PutMapping("/{id}")
    public void updateAbscence(@PathVariable Long id, @RequestBody Abscence abscence) {
        Abscence existingAbscence = abscenceService.getAbscenceById(id);
        if (existingAbscence != null) {
            abscence.setId(id);
            abscenceService.saveAbscence(abscence);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteAbscence(@PathVariable Long id) {
        abscenceService.deleteAbscenceById(id);
    }
}
