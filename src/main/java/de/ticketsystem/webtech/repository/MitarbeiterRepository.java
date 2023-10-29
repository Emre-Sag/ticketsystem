package de.ticketsystem.webtech.repository;

import de.ticketsystem.webtech.web.api.Mitarbeiter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MitarbeiterRepository extends CrudRepository<Mitarbeiter, Long> { }
