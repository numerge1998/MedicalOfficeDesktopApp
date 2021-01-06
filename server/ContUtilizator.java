package server;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "cont_utilizator")
public class ContUtilizator implements Serializable {
    @Id
    @Column(name = "nr_legitimatie")
    private String nrLegitimatie;
    @Column(name = "user")
    private String user;
    @Column(name = "parola")
    private String parola;

    public ContUtilizator(String user, String parola, String nrLegitimatie) {
        this.user = user;
        this.parola = parola;
        this.nrLegitimatie = nrLegitimatie;
    }

    public ContUtilizator() {

    }

    public String getNrLegitimatie() {
        return nrLegitimatie;
    }

    public ContUtilizator setNrLegitimatie(String nrLegitimatie) {
        this.nrLegitimatie = nrLegitimatie;
        return this;
    }

    public String getUser() {
        return user;
    }

    public ContUtilizator setUser(String user) {
        this.user = user;
        return this;
    }

    public String getParola() {
        return parola;
    }

    @Override
    public String toString() {
        return "ContUtilizator{" +
                "nrLegitimatie='" + nrLegitimatie + '\'' +
                ", user='" + user + '\'' +
                ", parola='" + parola + '\'' +
                '}';
    }

    public ContUtilizator setParola(String parola) {
        this.parola = parola;
        return this;
    }
}
