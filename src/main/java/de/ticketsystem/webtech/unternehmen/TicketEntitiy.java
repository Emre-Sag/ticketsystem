package de.ticketsystem.webtech.unternehmen;

import jakarta.persistence.*;

@Entity
@Table(name = "tickets")
public class TicketEntitiy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "ticketnummer", nullable = false, unique = true)
    private String ticketnummer;

    @Column(name = "betreff", nullable = false)
    private String betreff;

    @Column(name = "nachricht", nullable = false)
    private String nachricht;

    @Column(name = "status")
    private String status;

    public TicketEntitiy(Long id, String ticketnummer, String betreff, String nachricht, String status){
        this.id = id;
        this.ticketnummer = ticketnummer;
        this.betreff = betreff;
        this.nachricht = nachricht;
        this.status = status;
    }

    protected TicketEntitiy() {}

    public Long getId() {
        return id;
    }

    public String getTicketnummer() {
        return ticketnummer;
    }

    public void setTicketnummer(String ticketnummer) {
        this.ticketnummer = ticketnummer;
    }

    public String getBetreff() {
        return betreff;
    }

    public void setBetreff(String betreff) {
        this.betreff = betreff;
    }

    public String getNachricht() {
        return nachricht;
    }

    public void setNachricht(String nachricht) {
        this.nachricht = nachricht;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
