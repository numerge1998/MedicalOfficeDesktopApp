package client;

import org.jfree.data.general.DefaultPieDataset;
import server.Pacient;
import server.PersistentaPacient;

import javax.swing.*;
import java.util.ArrayList;

public class BuilderStatistica {

    public DefaultPieDataset creareStatistica(String legit, JComboBox facenameCombo, PersistentaPacient pacienti){
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        String crit = (String) facenameCombo.getSelectedItem();
        ArrayList<String> diag = new ArrayList<>();
        ArrayList<Pacient> list = pacienti.viewPacienti();
        ArrayList<Integer> frecv = new ArrayList<>(diag.size());

        for(Pacient p:list){
            if(false == diag.contains(p.getDiagnostic()) && p.getNrLegitimatie().equals(legit) && crit.equals("Diagnostic"))
                diag.add(p.getDiagnostic());
            else if(false == diag.contains(p.getSimptome()) && p.getNrLegitimatie().equals(legit) && crit.equals("Simptome"))
                diag.add(p.getSimptome());
        }

        for(int i=0;i<diag.size();i++){
            frecv.add(0);
        }

        for(Pacient p:list){
            if(p.getNrLegitimatie().equals(legit) && crit.equals("Diagnostic")){
                int i = frecv.get(diag.indexOf(p.getDiagnostic()));
                ++i;
                frecv.set(diag.indexOf(p.getDiagnostic()),i);
            }
            else if(p.getNrLegitimatie().equals(legit) && crit.equals("Simptome")){
                int i = frecv.get(diag.indexOf(p.getSimptome()));
                ++i;
                frecv.set(diag.indexOf(p.getSimptome()),i);
            }
        }

        for(int i=0;i<diag.size();i++){
            pieDataset.setValue(diag.get(i),frecv.get(i));
        }
        return pieDataset;
    }
}
