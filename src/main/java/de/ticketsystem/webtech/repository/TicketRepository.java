package de.ticketsystem.webtech.repository;

import de.ticketsystem.webtech.unternehmen.TicketEntitiy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends CrudRepository<TicketEntitiy, Long> {

}

