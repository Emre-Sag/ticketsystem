package de.ticketsystem.webtech.service;

import de.ticketsystem.webtech.repository.TicketRepository;
import de.ticketsystem.webtech.unternehmen.TicketEntitiy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    @Autowired
    TicketRepository repo;

    public TicketEntitiy save(TicketEntitiy ticket){
        return repo.save(ticket);
    }

    public TicketEntitiy get(Long id){
        return repo.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
