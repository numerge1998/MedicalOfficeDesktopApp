package server;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "programare")
public class Program implements Serializable {
    @Column(name = "nr_legitimatie")
    private String nrLegitimatie;
    @Column(name = "data")
    private Timestamp data;
    /*private Integer oraSfarist;
    private Integer minutSfarist;
    */
    @Column(name = "nume")
    private String nume;
    @Column(name = "prenume")
    private String prenume;
    @Id
    @Column(name = "id")
    private String id;

    public Program(){

    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Program{" +
                "nrLegitimatie='" + nrLegitimatie + '\'' +
                ", data=" + data +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public Program setId(String id) {
        this.id = id;
        return this;
    }

    public Program(Timestamp data, String nume, String prenume, String nrLegitimatie,String id) {
        this.id = id;
        this.data = data;
        this.nume = nume;
        this.prenume = prenume;
        this.nrLegitimatie = nrLegitimatie;
    }

    /*public Program(Date data, Integer oraSfarist, Integer minutSfarist, String nrLegitimatie) {
        this.data = data;
        this.oraSfarist = oraSfarist;
        this.minutSfarist = minutSfarist;
        this.nrLegitimatie = nrLegitimatie;
    }*/

    public Timestamp getData() {
        return data;
    }

    public Program setData(Timestamp data) {
        this.data = data;
        return this;
    }

    /*public Integer getOraSfarist() {
        return oraSfarist;
    }

    public Program setOraSfarist(Integer oraSfarist) {
        this.oraSfarist = oraSfarist;
        return this;
    }

    public Integer getMinutSfarist() {
        return minutSfarist;
    }

    public Program setMinutSfarist(Integer minutSfarist) {
        this.minutSfarist = minutSfarist;
        return this;
    }*/

    public String getNume() {
        return nume;
    }

    public Program setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public String getPrenume() {
        return prenume;
    }

    public Program setPrenume(String prenume) {
        this.prenume = prenume;
        return this;
    }

    public String getNrLegitimatie() {
        return nrLegitimatie;
    }

    public Program setNrLegitimatie(String nrLegitimatie) {
        this.nrLegitimatie = nrLegitimatie;
        return this;
    }
}
