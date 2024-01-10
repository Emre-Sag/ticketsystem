package de.ticketsystem.webtech.web;

import de.ticketsystem.webtech.service.TicketService;
import de.ticketsystem.webtech.unternehmen.TicketEntitiy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    /* @GetMapping("/test")
    public ResponseEntity<String> testCommunication() {
        return ResponseEntity.ok("Die Kommunikation zwischen Frontend und Backend funktioniert!");
    }
*/
    @DeleteMapping("/ticket/{id}")
    public ResponseEntity<String> deleteTicket(@PathVariable String id) {
        Long ticketId = Long.parseLong(id);
        service.delete(ticketId);
        return ResponseEntity.ok("Ticket mit der ID " + ticketId + " wurde erfolgreich gelöscht.");
    }
}
