package de.ticketsystem.webtech.service;

import de.ticketsystem.webtech.repository.MitarbeiterRepository;
import de.ticketsystem.webtech.web.api.Mitarbeiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MitarbeiterService {

    @Autowired
    MitarbeiterRepository repo;

    public Mitarbeiter save(Mitarbeiter mitarbeiter){
        return repo.save(mitarbeiter);
    }

    public Mitarbeiter get(Long id){
        return repo.findById(id).orElseThrow(() -> new RuntimeException());
    }
}
