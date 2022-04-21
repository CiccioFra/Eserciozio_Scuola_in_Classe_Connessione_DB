package engim.eserciozio_scuola_in_classe_connessione_db.model;

import java.security.PrivateKey;

public class Studente {
    private Long ID;
    private String nome;
    private String cognome;
    private String indirizzoScolastico;

    public Studente() {
    }

    public Studente(Long ID, String nome, String cognome, String indirizzoScolastico) {
        this.ID = ID;
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzoScolastico = indirizzoScolastico;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getIndirizzoScolastico() {
        return indirizzoScolastico;
    }

    public void setIndirizzoScolastico(String indirizzoScolastico) {
        this.indirizzoScolastico = indirizzoScolastico;
    }
}
