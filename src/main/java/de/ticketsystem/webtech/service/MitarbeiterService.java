package de.ticketsystem.webtech.service;

import de.ticketsystem.webtech.repository.MitarbeiterRepository;
import de.ticketsystem.webtech.unternehmen.MitarbeiterEntitiy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MitarbeiterService {

    @Autowired
    MitarbeiterRepository repo;

    public MitarbeiterEntitiy save(MitarbeiterEntitiy mitarbeiter){
        return repo.save(mitarbeiter);
    }

    public MitarbeiterEntitiy get(Long id){
        return repo.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public MitarbeiterEntitiy getByBenutzername(String benutzername) {
        return repo.findByBenutzername(benutzername);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
