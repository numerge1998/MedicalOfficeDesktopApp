package server;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "pacient")
public class Pacient implements Serializable{
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "nume")
    String nume;
    @Column(name = "prenume")
    String prenume;
    @Column(name = "simptome")
    private String simptome;
    @Column(name = "diagnostic")
    private String diagnostic;
    @Column(name = "tratament")
    private String tratament;
    @Column(name = "nr_legitimatie")
    private String nrLegitimatie;

    public Pacient(){

    }

    public Pacient(String id ,String nume, String prenume, String simptome, String diagnostic, String tratament,String nrLegitimatie) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.simptome = simptome;
        this.diagnostic = diagnostic;
        this.tratament = tratament;
        this.nrLegitimatie = nrLegitimatie;
    }

    public String getSimptome() {
        return simptome;
    }

    public String getNrLegitimatie() {
        return nrLegitimatie;
    }

    public Pacient setNrLegitimatie(String nrLegitimatie) {
        this.nrLegitimatie = nrLegitimatie;
        return this;
    }

    public Pacient setSimptome(String simptome) {
        this.simptome = simptome;
        return this;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public String getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public Pacient setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public String getPrenume() {
        return prenume;
    }

    public Pacient setPrenume(String prenume) {
        this.prenume = prenume;
        return this;
    }

    public Pacient setId(String id) {
        this.id = id;
        return this;
    }

    public Pacient setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
        return this;
    }

    public String getTratament() {
        return tratament;
    }

    public String toString1() {
        return  nume + "," + prenume + "," + nrLegitimatie + "," + simptome + "," + diagnostic + "," + tratament + "," + id ;
    }

    public Pacient setTratament(String tratament) {
        this.tratament = tratament;
        return this;
    }

}
