package de.ticketsystem.webtech.web;

import de.ticketsystem.webtech.service.MitarbeiterService;
import de.ticketsystem.webtech.unternehmen.MitarbeiterEntitiy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
public class MitarbeiterRestController {

    /** private List<Mitarbeiter> mitarbeiter;

    public MitarbeiterRestController() {
        mitarbeiter = new ArrayList<>();
        mitarbeiter.add(new Mitarbeiter(1, "Emre", "Sag", 1000, "Emre.Sag@Student.HTW-berlin.de"));
        mitarbeiter.add(new Mitarbeiter(2, "Zeren", "Kanber", 1001, "Zeren.Kanber@Student.HTW-berlin.de"));
    }

    @GetMapping(path = "/api/v1/mitarbeiter")
    public ResponseEntity<List<Mitarbeiter>>fetchMitarbeiter(){
        return ResponseEntity.ok(mitarbeiter);
    } */

    @Autowired
    MitarbeiterService service;

    @PostMapping("/mitarbeiter")
    public MitarbeiterEntitiy createMitarbeiter(@RequestBody MitarbeiterEntitiy mitarbeiter){
        return service.save(mitarbeiter);
    }

    @CrossOrigin(origins = "http://localhost:8081")
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

}


