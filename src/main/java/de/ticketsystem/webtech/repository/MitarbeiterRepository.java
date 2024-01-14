package de.ticketsystem.webtech.repository;

import de.ticketsystem.webtech.unternehmen.MitarbeiterEntitiy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MitarbeiterRepository extends CrudRepository<MitarbeiterEntitiy, Long> {
    MitarbeiterEntitiy findByBenutzername(String benutzername);
}
