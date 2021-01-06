package server;

import org.hibernate.SessionFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table (name = "persoana")
public class Persoana implements Serializable {
    @Id
    @Column(name = "nr_legitimatie")
    protected  String nrLegitimatie;
    @Column(name = "nume")
    protected String nume;
    @Column(name = "prenume")
    protected  String prenume;
    @Column(name = "varsta")
    protected String varsta;


    public Persoana(String nume, String prenume, String varsta, String nrLegitimatie) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.nrLegitimatie = nrLegitimatie;
    }

    public Persoana() {

    }

    public String getNume() {
        return this.nume;
    }

    public Persoana setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public String getPrenume() {
        return this.prenume;
    }

    public Persoana setPrenume(String prenume) {
        this.prenume = prenume;
        return this;
    }

    public String getVarsta() {
        return this.varsta;
    }

    public Persoana setVarsta(String varsta) {
        this.varsta = varsta;
        return this;
    }

    public String getNrLegitimatie() {
        return this.nrLegitimatie;
    }

    public Persoana setNrLegitimatie(String nrLegitimatie) {
        this.nrLegitimatie = nrLegitimatie;
        return this;
    }

    public String toString(){
        return "nume :" + this.nume + ", prenume :" + this.prenume + ", varsta :" + this.varsta + ", nrLegitimatie :" + this.nrLegitimatie;
    }
}