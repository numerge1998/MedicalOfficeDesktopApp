package server;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "utilizator")
public class Utilizator extends Persoana  implements Serializable{

    @Column(name = "rol")
    private String rol;

    public Utilizator(String nume1, String prenume1, String varsta1, String nrLegitimatie1, String rol) {
        super(nume1, prenume1, varsta1, nrLegitimatie1);
        this.rol = rol;
    }

    public Utilizator(){

    }
    public String getRol() {
        return rol;
    }

    public Utilizator setRol(String rol) {
        this.rol = rol;
        return this;
    }

    public String toString(){
        return "nume :" + this.nume + ", prenume :" + this.prenume + ", varsta :" + this.varsta + ", nrLegitimatie :" + this.nrLegitimatie + " rol:" + this.rol;
    }


}