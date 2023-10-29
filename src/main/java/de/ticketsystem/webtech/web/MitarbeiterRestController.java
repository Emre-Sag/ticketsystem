package de.ticketsystem.webtech.web;

import de.ticketsystem.webtech.web.api.Mitarbeiter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MitarbeiterRestController {

    private List<Mitarbeiter> mitarbeiter;

    public MitarbeiterRestController() {
        mitarbeiter = new ArrayList<>();
        mitarbeiter.add(new Mitarbeiter(1, "Emre", "Sag", 1000, "Emre.Sag@Student.HTW-berlin.de"));
        mitarbeiter.add(new Mitarbeiter(2, "Zeren", "Kanber", 1001, "Zeren.Kanber@Student.HTW-berlin.de"));
    }

    @GetMapping(path = "/api/v1/mitarbeiter")
    public ResponseEntity<List<Mitarbeiter>>fetchMitarbeiter(){
        return ResponseEntity.ok(mitarbeiter);
    }
}
