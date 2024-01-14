package de.ticketsystem.webtech.repository;

import de.ticketsystem.webtech.unternehmen.TicketEntitiy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface TicketRepository extends CrudRepository<TicketEntitiy, Long> {
    Optional<TicketEntitiy> findByTicketnummer(String ticketnummer);
}

