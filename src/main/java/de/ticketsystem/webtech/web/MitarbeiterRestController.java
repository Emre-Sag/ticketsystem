package de.ticketsystem.webtech.web;

import de.ticketsystem.webtech.service.MitarbeiterService;
import de.ticketsystem.webtech.unternehmen.MitarbeiterEntitiy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
public class MitarbeiterRestController {

    @Autowired
    MitarbeiterService service;

    @PostMapping("/mitarbeiter")
    public MitarbeiterEntitiy createMitarbeiter(@RequestBody MitarbeiterEntitiy mitarbeiter){
        return service.save(mitarbeiter);
    }

    @GetMapping("/mitarbeiter/{id}")
    public MitarbeiterEntitiy getMitarbeiter(@PathVariable String id){
        Long  mitarbeiterId = Long.parseLong(id);
        return service.get(mitarbeiterId);
    }

    @GetMapping("/test")
    public ResponseEntity<String> testCommunication() {
        return ResponseEntity.ok("Die Kommunikation zwischen Frontend und Backend funktioniert!");
    }

    @DeleteMapping("/mitarbeiter/{id}")
    public ResponseEntity<String> deleteMitarbeiter(@PathVariable String id) {
        Long mitarbeiterId = Long.parseLong(id);
        service.delete(mitarbeiterId);
        return ResponseEntity.ok("Mitarbeiter mit der ID " + mitarbeiterId + " wurde erfolgreich gelöscht.");
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody MitarbeiterEntitiy request) {
        MitarbeiterEntitiy user = service.getByBenutzername(request.getBenutzername());

        if (user != null && user.getPasswort().equals(request.getPasswort())) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(401).body("Invalid username or password");
        }
    }
}
