package server;

import java.awt.*;
import java.io.Serializable;

public class FabricaPersistenta implements Serializable {
    public Persistenta getPersistenta(String persType){
        if(persType == null){
            return null;
        }
        if(persType.equalsIgnoreCase("Cont")){
            return new PersistentaContUtilizator();

        } else if(persType.equalsIgnoreCase("Pacienti")){
            return new PersistentaPacient();

        } else if(persType.equalsIgnoreCase("Program")){
            return new PersistentaProgram();
        }
        else if(persType.equalsIgnoreCase("ProgramDoctor")){
            return new PersistentaProgram();
        }

        return null;
    }
}
