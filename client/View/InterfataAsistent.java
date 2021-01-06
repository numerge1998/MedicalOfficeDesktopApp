package client;
/*
import controller.ControllerAsistent;
import model.Pacient;
import model.PersistentaPacient;
import model.PersistentaProgram;
import model.Program;
*/
import server.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

public class InterfataAsistent {


    JFrame frame = new JFrame("Asistent");
    JPanel login = new JPanel();
    BufferedImage image;
    JLabel label = new JLabel();

    ControllerAsistent co1 = new ControllerAsistent();


    JLabel nume = new JLabel("Nume:");
    JLabel prenume = new JLabel("Prenume:");
    JLabel varsta = new JLabel("Varsta:");
    JLabel nrLegitimatie = new JLabel("NrLegitim:");
    JLabel simptome = new JLabel("Simptome:");
    JLabel diagnostic = new JLabel("Diagnostic:");
    JLabel tratament = new JLabel("Tratament:");
    JTextField nume1 = new JTextField();
    JTextField prenume1 = new JTextField();
    JTextField varsta1 = new JTextField();
    JTextField nrLegitimatie1 = new JTextField();
    JTextField simptome1 = new JTextField();
    JTextField diagnostic1 = new JTextField();
    JTextField tratament1 = new JTextField();
    JLabel nume2 = new JLabel("Update/Delete Nume:");
    JLabel prenume2 = new JLabel("Update/Delete Prenume:");
    JLabel varsta2 = new JLabel("Update/Delete Varsta:");
    JLabel nrLegitimatie2 = new JLabel("Update/Delete NrLegitim:");
    JLabel simptome2 = new JLabel("Update/Delete Simptome:");
    JLabel diagnostic2 = new JLabel("Update/Delete Diagnostic:");
    JLabel tratament2 = new JLabel("Update/Delete Tratament:");
    JLabel id2 = new JLabel("Update/Delete ID:");
    JTextField nume3 = new JTextField();
    JTextField prenume3 = new JTextField();
    JTextField varsta3 = new JTextField();
    JTextField nrLegitimatie3 = new JTextField();
    JTextField simptome3 = new JTextField();
    JTextField diagnostic3 = new JTextField();
    JTextField tratament3 = new JTextField();
    JTextField id3 = new JTextField();
    JTextField crit = new JTextField("Date filtrare");
    JTextField num = new JTextField("Nume cautare");
    JTextField prenum = new JTextField("Prenume cautare");
    private JButton add = new JButton("Adauga");
    private JButton delete = new JButton("Sterge");
    private JButton view = new JButton("Vizualizare");
    private JButton update = new JButton("Schimbare");
    private JButton filtrare = new JButton("Filtrare");
    private JButton cautare = new JButton("Cautare");
    private JButton salvare = new JButton("Salvare");

    private JButton addProgram = new JButton("Adauga programare");
    private JButton deleteProgram = new JButton("Sterge programare");
    private JButton viewProgram = new JButton("Vizualizare programari");

    JLabel luna = new JLabel("Luna:");
    JLabel zi = new JLabel("Zi:");
    JLabel ora = new JLabel("Ora:");
    JLabel nume4 = new JLabel("Nume pacient:");
    JLabel prenume4 = new JLabel("Prenume pacient:");
    JLabel nrLegitimatie4 = new JLabel("Numar legitim:");
    JLabel id = new JLabel("Id:");

    JTextField luna2 = new JTextField();
    JTextField zi2 = new JTextField();
    JTextField ora2 = new JTextField();
    JTextField nume6 = new JTextField();
    JTextField prenume6 = new JTextField();
    JTextField nrLegitimatie6 = new JTextField();
    JTextField id4 = new JTextField();

    JLabel luna1 = new JLabel("Delete Luna:");
    JLabel zi1 = new JLabel("Delete Zi:");
    JLabel ora1 = new JLabel("Delete Ora:");
    JLabel nume5 = new JLabel("Delete Nume pacient:");
    JLabel prenume5 = new JLabel("Delete Prenume pacient:");
    JLabel nrLegitimatie5 = new JLabel("Delete Numar legitim:");
    JLabel id1 = new JLabel("Delete Id:");

    JTextField luna3 = new JTextField();
    JTextField zi3 = new JTextField();
    JTextField ora3 = new JTextField();
    JTextField nume7 = new JTextField();
    JTextField prenume7 = new JTextField();
    JTextField nrLegitimatie7 = new JTextField();
    JTextField id5 = new JTextField();

    JComboBox facenameCombo = new JComboBox();

    static JButton lang = new JButton("Romana");
    static JButton lang1 = new JButton("Engleza");
    static JButton lang2 = new JButton("Franceza");

    public static JButton getLang() {
        return lang;
    }

    public static JButton getLang1() {
        return lang1;
    }

    public static JButton getLang2() {
        return lang2;
    }

    public InterfataAsistent(PersistentaPacient pacienti, PersistentaContUtilizator conturi, PersistentaProgram programari, PersistentaProgramDoc program, Properties prop, Properties roo, Properties frr, String limba1){
        frame.setSize(1750, 1000);
        frame.setLocation(10, 10);
        login.setLayout(null);
        label.setBounds(0,0,1750,1000);

        facenameCombo.addItem("Medic");
        facenameCombo.addItem("Diagnostic");

        co1.limba(nume,prenume,varsta,nrLegitimatie,simptome,diagnostic,tratament,nume2,prenume2,varsta2,nrLegitimatie2,simptome2,diagnostic2,tratament2,id2,add,delete,view,update,filtrare,cautare,salvare,addProgram,viewProgram,deleteProgram,luna,zi,ora,nume4,prenume4,nrLegitimatie4,id,luna1,zi1,ora1,nume5,prenume5,nrLegitimatie5,id1,prop,roo,frr);

        nume.setBounds(10,10,100,20);
        prenume.setBounds(10,40,100,20);
        varsta.setBounds(10,70,100,20);
        nrLegitimatie.setBounds(10,100,100,20);
        simptome.setBounds(10,130,100,20);
        diagnostic.setBounds(10,160,100,20);
        tratament.setBounds(10,190,100,20);
        nume1.setBounds(120,10,100,20);
        prenume1.setBounds(120,40,100,20);
        varsta1.setBounds(120,70,100,20);
        nrLegitimatie1.setBounds(120,100,100,20);
        simptome1.setBounds(120,130,100,20);
        diagnostic1.setBounds(120,160,100,20);
        tratament1.setBounds(120,190,100,20);
        nume2.setBounds(300,10,200,20);
        prenume2.setBounds(300,40,200,20);
        varsta2.setBounds(300,70,200,20);
        nrLegitimatie2.setBounds(300,100,200,20);
        simptome2.setBounds(300,130,200,20);
        diagnostic2.setBounds(300,160,200,20);
        tratament2.setBounds(300,190,200,20);
        id2.setBounds(300,220,200,20);
        nume3.setBounds(460,10,100,20);
        prenume3.setBounds(460,40,100,20);
        varsta3.setBounds(460,70,100,20);
        nrLegitimatie3.setBounds(460,100,100,20);
        simptome3.setBounds(460,130,100,20);
        diagnostic3.setBounds(460,160,100,20);
        tratament3.setBounds(460,190,100,20);
        id3.setBounds(460,220,100,20);
        add.setBounds(10,270,100,20);
        delete.setBounds(120,270,100,20);
        view.setBounds(10,300,100,20);
        salvare.setBounds(10,330,100,20);
        update.setBounds(120,300,100,20);
        cautare.setBounds(230,300,100,20);
        num.setBounds(340,300,100,20);
        prenum.setBounds(450,300,100,20);
        filtrare.setBounds(230,270,100,20);
        facenameCombo.setBounds(340,270,100,20);
        crit.setBounds(450,270,100,20);

        addProgram.setBounds(590,10,180,20);
        viewProgram.setBounds(590,40,180,20);
        deleteProgram.setBounds(590,70,180,20);

        luna.setBounds(780,10,100,20);
        zi.setBounds(780,40,100,20);
        ora.setBounds(780,70,100,20);
        nume4.setBounds(780,100,100,20);
        prenume4.setBounds(780,130,100,20);
        nrLegitimatie4.setBounds(780,160,100,20);
        id.setBounds(780,190,100,20);

        luna2.setBounds(890,10,100,20);
        zi2.setBounds(890,40,100,20);
        ora2.setBounds(890,70,100,20);
        nume6.setBounds(890,100,100,20);
        prenume6.setBounds(890,130,100,20);
        nrLegitimatie6.setBounds(890,160,100,20);
        id4.setBounds(890,190,100,20);

        luna1.setBounds(1000,10,100,20);
        zi1.setBounds(1000,40,100,20);
        ora1.setBounds(1000,70,100,20);
        nume5.setBounds(1000,100,100,20);
        prenume5.setBounds(1000,130,100,20);
        nrLegitimatie5.setBounds(1000,160,100,20);
        id1.setBounds(1000,190,100,20);

        luna3.setBounds(1110,10,100,20);
        zi3.setBounds(1110,40,100,20);
        ora3.setBounds(1110,70,100,20);
        nume7.setBounds(1110,100,100,20);
        prenume7.setBounds(1110,130,100,20);
        nrLegitimatie7.setBounds(1110,160,100,20);
        id5.setBounds(1110,190,100,20);

        lang.setBounds(1150,750,100,20);
        lang1.setBounds(1260,750,100,20);
        lang2.setBounds(1370,750,100,20);

        if(limba1.equals("romana")){
            nume.setText(roo.getProperty("nume"));
            prenume.setText(roo.getProperty("prenume"));
            id.setText(roo.getProperty("id"));
            nrLegitimatie.setText(roo.getProperty("legitimatie"));
            simptome.setText(roo.getProperty("simptome"));
            diagnostic.setText(roo.getProperty("diagnostic"));
            tratament.setText(roo.getProperty("tratament"));

            nume2.setText(roo.getProperty("snume"));
            prenume2.setText(roo.getProperty("sprenume"));
            id2.setText(roo.getProperty("sid"));
            nrLegitimatie2.setText(roo.getProperty("slegitimatie"));
            simptome2.setText(roo.getProperty("ssimptome"));
            diagnostic2.setText(roo.getProperty("sdiagnostic"));
            tratament2.setText(roo.getProperty("stratament"));
            id2.setText(roo.getProperty("sid"));

            add.setText(roo.getProperty("adauga"));
            delete.setText(roo.getProperty("sterge"));
            update.setText(roo.getProperty("schimba"));
            view.setText(roo.getProperty("vizualizare"));
            filtrare.setText(roo.getProperty("filtrare"));
            cautare.setText(roo.getProperty("cautare"));
            salvare.setText(roo.getProperty("salvare"));

            addProgram.setText(roo.getProperty("adaugap"));
            deleteProgram.setText(roo.getProperty("stergep"));
            viewProgram.setText(roo.getProperty("vizualizarep"));

            luna.setText(roo.getProperty("luna"));
            zi.setText(roo.getProperty("zi"));
            ora.setText(roo.getProperty("orai"));
            nume4.setText(roo.getProperty("numep"));
            prenume4.setText(roo.getProperty("prenumep"));
            nrLegitimatie4.setText(roo.getProperty("legitimatiep"));
            id1.setText(roo.getProperty("idp"));

            luna1.setText(roo.getProperty("sluna"));
            zi1.setText(roo.getProperty("szi"));
            ora1.setText(roo.getProperty("sorai"));
            nume5.setText(roo.getProperty("snumep"));
            prenume5.setText(roo.getProperty("sprenumep"));
            nrLegitimatie5.setText(roo.getProperty("slegitimatiep"));
            id1.setText(roo.getProperty("sidp"));
        } else if(limba1.equals("engleza")){
            nume.setText(prop.getProperty("nume"));
            prenume.setText(prop.getProperty("prenume"));
            id.setText(prop.getProperty("id"));
            nrLegitimatie.setText(prop.getProperty("legitimatie"));
            simptome.setText(prop.getProperty("simptome"));
            diagnostic.setText(prop.getProperty("diagnostic"));
            tratament.setText(prop.getProperty("tratament"));

            nume2.setText(prop.getProperty("snume"));
            prenume2.setText(prop.getProperty("sprenume"));
            id2.setText(prop.getProperty("sid"));
            nrLegitimatie2.setText(prop.getProperty("slegitimatie"));
            simptome2.setText(prop.getProperty("ssimptome"));
            diagnostic2.setText(prop.getProperty("sdiagnostic"));
            tratament2.setText(prop.getProperty("stratament"));
            id2.setText(prop.getProperty("sid"));

            add.setText(prop.getProperty("adauga"));
            delete.setText(prop.getProperty("sterge"));
            update.setText(prop.getProperty("schimba"));
            view.setText(prop.getProperty("vizualizare"));
            filtrare.setText(prop.getProperty("filtrare"));
            cautare.setText(prop.getProperty("cautare"));
            salvare.setText(prop.getProperty("salvare"));

            addProgram.setText(prop.getProperty("adaugap"));
            deleteProgram.setText(prop.getProperty("stergep"));
            viewProgram.setText(prop.getProperty("vizualizarep"));

            luna.setText(prop.getProperty("luna"));
            zi.setText(prop.getProperty("zi"));
            ora.setText(prop.getProperty("orai"));
            nume4.setText(prop.getProperty("numep"));
            prenume4.setText(prop.getProperty("prenumep"));
            nrLegitimatie4.setText(prop.getProperty("legitimatiep"));
            id1.setText(prop.getProperty("idp"));

            luna1.setText(prop.getProperty("sluna"));
            zi1.setText(prop.getProperty("szi"));
            ora1.setText(prop.getProperty("sorai"));
            nume5.setText(prop.getProperty("snumep"));
            prenume5.setText(prop.getProperty("sprenumep"));
            nrLegitimatie5.setText(prop.getProperty("slegitimatiep"));
            id1.setText(prop.getProperty("sidp"));
        } else if(limba1.equals("franceza")){
            nume.setText(frr.getProperty("nume"));
            prenume.setText(frr.getProperty("prenume"));
            id.setText(frr.getProperty("id"));
            nrLegitimatie.setText(frr.getProperty("legitimatie"));
            simptome.setText(frr.getProperty("simptome"));
            diagnostic.setText(frr.getProperty("diagnostic"));
            tratament.setText(frr.getProperty("tratament"));

            nume2.setText(frr.getProperty("snume"));
            prenume2.setText(frr.getProperty("sprenume"));
            id2.setText(frr.getProperty("sid"));
            nrLegitimatie2.setText(frr.getProperty("slegitimatie"));
            simptome2.setText(frr.getProperty("ssimptome"));
            diagnostic2.setText(frr.getProperty("sdiagnostic"));
            tratament2.setText(frr.getProperty("stratament"));
            id2.setText(frr.getProperty("sid"));

            add.setText(frr.getProperty("adauga"));
            delete.setText(frr.getProperty("sterge"));
            update.setText(frr.getProperty("schimba"));
            view.setText(frr.getProperty("vizualizare"));
            filtrare.setText(frr.getProperty("filtrare"));
            cautare.setText(frr.getProperty("cautare"));
            salvare.setText(frr.getProperty("salvare"));

            addProgram.setText(frr.getProperty("adaugap"));
            deleteProgram.setText(frr.getProperty("stergep"));
            viewProgram.setText(frr.getProperty("vizualizarep"));

            luna.setText(frr.getProperty("luna"));
            zi.setText(frr.getProperty("zi"));
            ora.setText(frr.getProperty("orai"));
            nume4.setText(frr.getProperty("numep"));
            prenume4.setText(frr.getProperty("prenumep"));
            nrLegitimatie4.setText(frr.getProperty("legitimatiep"));
            id1.setText(frr.getProperty("idp"));

            luna1.setText(frr.getProperty("sluna"));
            zi1.setText(frr.getProperty("szi"));
            ora1.setText(frr.getProperty("sorai"));
            nume5.setText(frr.getProperty("snumep"));
            prenume5.setText(frr.getProperty("sprenumep"));
            nrLegitimatie5.setText(frr.getProperty("slegitimatiep"));
            id1.setText(frr.getProperty("sidp"));
        }

        login.add(nume);
        login.add(prenume);
        login.add(varsta);
        login.add(nrLegitimatie);
        login.add(simptome);
        login.add(diagnostic);
        login.add(tratament);
        login.add(nume1);
        login.add(prenume1);
        login.add(varsta1);
        login.add(nrLegitimatie1);
        login.add(simptome1);
        login.add(diagnostic1);
        login.add(tratament1);
        login.add(nume2);
        login.add(prenume2);
        login.add(varsta2);
        login.add(nrLegitimatie2);
        login.add(simptome2);
        login.add(diagnostic2);
        login.add(tratament2);
        login.add(nume3);
        login.add(prenume3);
        login.add(varsta3);
        login.add(nrLegitimatie3);
        login.add(simptome3);
        login.add(diagnostic3);
        login.add(tratament3);
        login.add(add);
        login.add(delete);
        login.add(view);
        login.add(update);
        login.add(filtrare);
        login.add(cautare);
        login.add(facenameCombo);
        login.add(crit);
        login.add(num);
        login.add(prenum);
        login.add(salvare);
        login.add(addProgram);
        login.add(deleteProgram);
        login.add(viewProgram);
        login.add(luna);
        login.add(luna1);
        login.add(luna2);
        login.add(luna3);
        login.add(zi);
        login.add(zi1);
        login.add(zi2);
        login.add(zi3);
        login.add(ora);
        login.add(ora1);
        login.add(ora2);
        login.add(ora3);
        login.add(nume4);
        login.add(nume5);
        login.add(nume6);
        login.add(nume7);
        login.add(prenume4);
        login.add(prenume5);
        login.add(prenume6);
        login.add(prenume7);
        login.add(nrLegitimatie4);
        login.add(nrLegitimatie5);
        login.add(nrLegitimatie6);
        login.add(nrLegitimatie7);
        login.add(id2);
        login.add(id3);

        login.add(id);
        login.add(id1);
        login.add(id4);
        login.add(id5);

        login.add(lang);
        login.add(lang1);
        login.add(lang2);

        try{
            image= ImageIO.read(new File("E:/an3/sem2/PS/Tema11/fundal.jpg"));
        }catch (IOException e)
        {

        }

        ImageIcon icon = new ImageIcon(image);
        label.setIcon(icon);
        login.add(label);

        co1.add1(add,nume1,prenume1,varsta1,nrLegitimatie1,simptome1,diagnostic1,tratament1,pacienti,conturi);
        co1.vizual(view,login,nume3,prenume3,varsta3,nrLegitimatie3,simptome3,diagnostic3,tratament3,id3,pacienti);
        co1.delete1(delete,id3,pacienti,programari);
        co1.update1(update,nume1,prenume1,nrLegitimatie1,id3,pacienti,programari,conturi);
        co1.cauta(cautare,login,num,prenum,pacienti);
        ArrayList<Pacient> list = co1.filtrare(filtrare,login,crit,facenameCombo,pacienti);
        co1.salvare(salvare,list);
        co1.addProgram(addProgram,luna2,zi2,ora2,nrLegitimatie6,id4,programari,pacienti,program,conturi);
        co1.deleteProgram(deleteProgram,nrLegitimatie7,id5,programari);
        co1.vizualProgram(viewProgram,login,luna3,zi3,ora3,nume7,prenume7,nrLegitimatie7,id5,programari);


        frame.getContentPane().add(login);
        frame.setVisible(true);
    }

}
