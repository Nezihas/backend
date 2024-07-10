package nezihas.example.securityapicrud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nezihas.example.securityapicrud.models.Horaire;
import nezihas.example.securityapicrud.services.HoraireService;

@RestController
@RequestMapping("/api/horaires")
public class HoraireController {

    @Autowired
    private HoraireService horaireService;

    @GetMapping
    public List<Horaire> getAllHoraires() {
        return horaireService.getAllHoraires();
    }

    @PostMapping
    public void createHoraire(@RequestBody Horaire horaire) {
        horaireService.saveHoraire(horaire);
    }
    // public ResponseEntity<?> createHoraire(@RequestBody Horaire horaire) {
    // try {
    // System.out.println("Received horaire: " + horaire);
    // Horaire savedHoraire = horaireService.saveHoraire(horaire);
    // System.out.println("Saved horaire: " + savedHoraire);
    // return ResponseEntity.ok(savedHoraire);
    // } catch (Exception e) {
    // System.err.println("Error: " + e.getMessage());
    // return ResponseEntity.status(500).body("Failed to add horaire: " +
    // e.getMessage());
    // }
    // }

    @GetMapping("/{id}")
    public ResponseEntity<Horaire> getHoraireById(@PathVariable Long id) {
        Horaire horaire = horaireService.getHoraireById(id);
        if (horaire != null) {
            return ResponseEntity.ok(horaire);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateHoraire(@PathVariable Long id, @RequestBody Horaire horaire) {
        Horaire existingHoraire = horaireService.getHoraireById(id);
        if (existingHoraire != null) {
            horaire.setId(id);
            Horaire updatedHoraire = horaireService.saveHoraire(horaire);
            return ResponseEntity.ok(updatedHoraire);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteHoraire(@PathVariable Long id) {
        try {
            horaireService.deleteHoraireById(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Failed to delete horaire: " + e.getMessage());
        }
    }
}
