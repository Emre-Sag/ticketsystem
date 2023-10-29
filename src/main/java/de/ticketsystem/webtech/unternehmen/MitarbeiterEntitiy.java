package de.ticketsystem.webtech.unternehmen;

import jakarta.persistence.*;

@Entity(name = "mitarbeiter")
public class MitarbeiterEntitiy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "vorname", nullable = false)
    private String vorname;

    @Column(name = "nachname", nullable = false)
    private String nachname;

    @Column(name = "personalnummer", nullable = false)
    private long personalnummer;

    @Column(name = "mailadresse")
    private String mailadresse;

    public MitarbeiterEntitiy(String vorname, String nachname, long personalnummer, String mailadresse) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.personalnummer = personalnummer;
        this.mailadresse = mailadresse;
    }

    protected MitarbeiterEntitiy() {}

    public long getId() {
        return id;
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
