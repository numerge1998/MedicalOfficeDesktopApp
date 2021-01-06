package server;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "program_doc")
public class ProgramDoc implements Serializable {

    @Id
    @Column (name = "id_program")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id_prog;
    @Column(name = "nr_legitimatie")
    private String nrLegitimatie;
    @Column(name = "data")
    private Timestamp data;
    @Column(name = "ora_sfarsit")
    private Integer oraSfarist;
    @Column(name = "ora_inceput")
    private Integer oraInceput;

    public ProgramDoc(){

    }

    @Override
    public String toString() {
        return "ProgramDoc{" +
                "nrLegitimatie='" + nrLegitimatie + '\'' +
                ", data=" + data +
                ", oraSfarist=" + oraSfarist +
                ", oraInceput=" + oraInceput +
                '}';
    }

    public Timestamp getData() {
        return data;
    }

    public ProgramDoc setData(Timestamp data) {
        this.data = data;
        return this;
    }

    public Integer getOraSfarist() {
        return oraSfarist;
    }

    public ProgramDoc setOraSfarist(Integer oraSfarist) {
        this.oraSfarist = oraSfarist;
        return this;
    }

    public Integer getMinutSfarist() {
        return oraInceput;
    }

    public ProgramDoc setMinutSfarist(Integer minutSfarist) {
        this.oraInceput = minutSfarist;
        return this;
    }

    public String getNrLegitimatie() {
        return nrLegitimatie;
    }

    public ProgramDoc setNrLegitimatie(String nrLegitimatie) {
        this.nrLegitimatie = nrLegitimatie;
        return this;
    }

    public Integer getId_prog() {
        return id_prog;
    }

    public ProgramDoc setId_prog(Integer id_prog) {
        this.id_prog = id_prog;
        return this;
    }

    public ProgramDoc(Timestamp data, Integer oraSfarist, Integer minutSfarist, String nrLegitimatie) {
        this.data = data;
        this.oraSfarist = oraSfarist;
        this.oraInceput = minutSfarist;
        this.nrLegitimatie = nrLegitimatie;
    }
}
