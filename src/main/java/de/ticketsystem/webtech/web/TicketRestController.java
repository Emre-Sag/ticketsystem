package de.ticketsystem.webtech.web;

import de.ticketsystem.webtech.service.TicketService;
import de.ticketsystem.webtech.unternehmen.TicketEntitiy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
public class TicketRestController {

    @Autowired
    TicketService service;

    @PostMapping("/ticket")
    public TicketEntitiy createTicket(@RequestBody TicketEntitiy ticket){
        return service.save(ticket);
    }

    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping("/ticket/{id}")
    public TicketEntitiy getTicket(@PathVariable String id){
        Long  ticketId = Long.parseLong(id);
        return service.get(ticketId);
    }

    @DeleteMapping("/ticket/{id}")
    public ResponseEntity<String> deleteTicket(@PathVariable String id) {
        Long ticketId = Long.parseLong(id);
        service.delete(ticketId);
        return ResponseEntity.ok("Ticket mit der ID " + ticketId + " wurde erfolgreich gelöscht.");
    }

    @GetMapping("/tickets")
    public List<TicketEntitiy> getAllTickets() {
        return service.getAllTickets();
    }

    @PutMapping("/ticket/{id}")
    public ResponseEntity<TicketEntitiy> updateTicket(@PathVariable String id, @RequestBody TicketEntitiy updatedTicket) {
        try {
            Long ticketId = Long.parseLong(id);

            TicketEntitiy existingTicket = service.get(ticketId);

            existingTicket.setBetreff(updatedTicket.getBetreff());
            existingTicket.setNachricht(updatedTicket.getNachricht());
            existingTicket.setStatus(updatedTicket.getStatus());

            TicketEntitiy savedTicket = service.save(existingTicket);

            return ResponseEntity.ok(savedTicket);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @GetMapping("/ticketByTicketnummer/{ticketnummer}")
    public ResponseEntity<?> getTicketByTicketnummer(@PathVariable String ticketnummer) {
        TicketEntitiy ticket = service.getTicketByTicketnummer(ticketnummer);
        if (ticket != null) {
            return ResponseEntity.ok(ticket);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ticket not found");
        }
    }

}

