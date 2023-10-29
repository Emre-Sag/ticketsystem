package de.ticketsystem.webtech.web.api;

public class Mitarbeiter {

    private long id;
    private String vorname;
    private String nachname;
    private long personalnummer;
    private String mailadresse;

    public Mitarbeiter(long id, String vorname, String nachname, long personalnummer, String mailadresse) {
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
        this.personalnummer = personalnummer;
        this.mailadresse = mailadresse;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public long getPersonalnummer() {
        return personalnummer;
    }

    public void setPersonalnummer(long personalnummer) {
        this.personalnummer = personalnummer;
    }

    public String getMailadresse() {
        return mailadresse;
    }

    public void setMailadresse(String mailadresse) {
        this.mailadresse = mailadresse;
    }
}
