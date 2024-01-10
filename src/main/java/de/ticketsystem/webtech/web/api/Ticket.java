package de.ticketsystem.webtech.web.api;

public class Ticket {
    private long id;
    private Long ticketnummer;
    private String betreff;
    private String nachricht;
    private String status;

    public Ticket(Long id, Long ticketnummer, String betreff, String nachricht, String status){
        this.id = id;
        this.ticketnummer = ticketnummer;
        this.betreff = betreff;
        this.nachricht = nachricht;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getTicketnummer() {
        return ticketnummer;
    }

    public void setTicketnummer(Long ticketnummer) {
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
