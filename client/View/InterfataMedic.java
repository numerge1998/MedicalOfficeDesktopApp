package client;

import client.ControllerMedic;
import server.PersistentaContUtilizator;
import server.PersistentaPacient;
import server.PersistentaProgram;
import server.PersistentaProgramDoc;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class InterfataMedic {


    JFrame frame = new JFrame("Medic");
    JPanel login = new JPanel();
    private JLabel label = new JLabel();
    BufferedImage image;

    ControllerMedic co1 = new ControllerMedic();

    private JLabel nume = new JLabel("Nume:");
    private JLabel prenume = new JLabel("Prenume:");
    private JLabel varsta = new JLabel("Id:");
    private JLabel nrLegitimatie = new JLabel("NrLegitim:");
    private JLabel simptome = new JLabel("Simptome:");
    private JLabel diagnostic = new JLabel("Diagnostic:");
    private JLabel tratament = new JLabel("Tratament:");
    private JTextField nume1 = new JTextField();
    private JTextField prenume1 = new JTextField();
    private JTextField varsta1 = new JTextField();
    private JTextField nrLegitimatie1 = new JTextField();
    private  JTextField simptome1 = new JTextField();
    private  JTextField diagnostic1 = new JTextField();
    private  JTextField tratament1 = new JTextField();
    private  JLabel nume2 = new JLabel("Update/Delete Nume:");
    private  JLabel prenume2 = new JLabel("Update/Delete Prenume:");
    private  JLabel varsta2 = new JLabel("Update/Delete Id:");
    private  JLabel nrLegitimatie2 = new JLabel("Update/Delete NrLegitim:");
    private JLabel simptome2 = new JLabel("Update/Delete Simptome:");
    private JLabel diagnostic2 = new JLabel("Update/Delete Diagnostic:");
    private  JLabel tratament2 = new JLabel("Update/Delete Tratament:");
    private  JTextField nume3 = new JTextField();
    private JTextField prenume3 = new JTextField();
    private JTextField varsta3 = new JTextField();
    private JTextField nrLegitimatie3 = new JTextField();
    private JTextField simptome3 = new JTextField();
    private JTextField diagnostic3 = new JTextField();
    private JTextField tratament3 = new JTextField();
    private JTextField crit = new JTextField();
    private JTextField num = new JTextField();
    private JTextField prenum = new JTextField();
    private JButton view = new JButton("Vizualizare");
    private JButton update = new JButton("Schimbare");
    private JButton filtrare = new JButton("Filtrare");
    private JButton cautare = new JButton("Cautare");
    private JButton statistici = new JButton("Statistici");

    JComboBox facenameCombo = new JComboBox();
    JComboBox facenameCombo1 = new JComboBox();

    private JButton addProgram = new JButton("Adauga program");
    private JButton deleteProgram = new JButton("Sterge program");
    private JButton viewProgram = new JButton("Vizualizare program");
    private JButton viewProgramari = new JButton("Vizualizare programari");

    JLabel luna = new JLabel("Luna:");
    JLabel zi = new JLabel("Zi:");
    JLabel ora = new JLabel("Ora inceput:");
    JLabel orasf = new JLabel("Ora sfarsit:");
    JLabel minut = new JLabel("Minut sfarsit:");


    JTextField luna2 = new JTextField();
    JTextField zi2 = new JTextField();
    JTextField ora2 = new JTextField();
    JTextField orasf2 = new JTextField();
    JTextField minut2 = new JTextField();


    JLabel luna1 = new JLabel("Delete Id:");
    JLabel zi1 = new JLabel("Delete Zi:");
    JLabel ora1 = new JLabel("Delete Ora:");
    JLabel orasf1 = new JLabel("Delete Ora sfarsit:");
    JLabel minut1 = new JLabel("Delete Minut sfarsit:");


    JTextField luna3 = new JTextField();
    JTextField zi3 = new JTextField();
    JTextField ora3 = new JTextField();
    JTextField orasf3 = new JTextField();
    JTextField minut3 = new JTextField();

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

    public InterfataMedic(String nrLegitimatie6, PersistentaPacient pacienti, PersistentaContUtilizator conturi, PersistentaProgramDoc doc, PersistentaProgram programari, Properties prop, Properties roo, Properties frr, String limba1){
        frame.setSize(1800, 1000);
        frame.setLocation(10, 10);
        login.setLayout(null);

        facenameCombo.addItem("Diagnostic");
        facenameCombo.addItem("Tratament");



        facenameCombo1.addItem("Diagnostic");
        facenameCombo1.addItem("Simptome");

        //per1.getPacienti().add(new Pacient("Lung","Paula","21","1234","nimic","nimic","nimic"));

        label.setBounds(0,0,1800,1000);

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
        nume3.setBounds(460,10,100,20);
        prenume3.setBounds(460,40,100,20);
        varsta3.setBounds(460,70,100,20);
        nrLegitimatie3.setBounds(460,100,100,20);
        simptome3.setBounds(460,130,100,20);
        diagnostic3.setBounds(460,160,100,20);
        tratament3.setBounds(460,190,100,20);
        view.setBounds(10,240,100,20);
        update.setBounds(120,240,100,20);
        cautare.setBounds(230,270,100,20);
        num.setBounds(340,270,100,20);
        prenum.setBounds(450,270,100,20);
        filtrare.setBounds(230,240,100,20);
        facenameCombo.setBounds(340,240,100,20);
        crit.setBounds(450,240,100,20);
        statistici.setBounds(10,270,100,20);
        facenameCombo1.setBounds(120,270,100,20);

        addProgram.setBounds(590,10,180,20);
        viewProgram.setBounds(590,40,180,20);
        deleteProgram.setBounds(590,70,180,20);
        viewProgramari.setBounds(590,100,180,20);

        luna.setBounds(780,10,100,20);
        zi.setBounds(780,40,100,20);
        ora.setBounds(780,70,100,20);
        orasf.setBounds(780,100,100,20);
        minut.setBounds(780,130,100,20);

        luna2.setBounds(890,10,100,20);
        zi2.setBounds(890,40,100,20);
        ora2.setBounds(890,70,100,20);
        orasf2.setBounds(890,100,100,20);
        minut2.setBounds(890,130,100,20);

        luna1.setBounds(1000,10,100,20);
        zi1.setBounds(1000,40,100,20);
        ora1.setBounds(1000,70,100,20);
        orasf1.setBounds(1000,100,100,20);
        minut1.setBounds(1000,130,100,20);

        luna3.setBounds(1110,10,100,20);
        zi3.setBounds(1110,40,100,20);
        ora3.setBounds(1110,70,100,20);
        orasf3.setBounds(1110,100,100,20);
        minut3.setBounds(1110,130,100,20);

        lang.setBounds(1150,750,100,20);
        lang1.setBounds(1260,750,100,20);
        lang2.setBounds(1370,750,100,20);

        co1.limba(nume,prenume,varsta,nrLegitimatie,simptome,diagnostic,tratament,nume2,prenume2,varsta2,nrLegitimatie2,simptome2,diagnostic2,tratament2,view,update,filtrare,cautare,statistici,addProgram,deleteProgram,viewProgram,viewProgramari,luna,zi,ora,orasf,minut,luna1,zi1,ora1,orasf1,minut1,prop,roo,frr);

        if(limba1.equals("romana")){
            nume.setText(roo.getProperty("nume"));
            prenume.setText(roo.getProperty("prenume"));
            varsta.setText(roo.getProperty("id"));
            nrLegitimatie.setText(roo.getProperty("legitimatie"));
            simptome.setText(roo.getProperty("simptome"));
            diagnostic.setText(roo.getProperty("diagnostic"));
            tratament.setText(roo.getProperty("tratament"));

            nume2.setText(roo.getProperty("snume"));
            prenume2.setText(roo.getProperty("sprenume"));
            varsta2.setText(roo.getProperty("sid"));
            nrLegitimatie2.setText(roo.getProperty("slegitimatie"));
            simptome2.setText(roo.getProperty("ssimptome"));
            diagnostic2.setText(roo.getProperty("sdiagnostic"));
            tratament2.setText(roo.getProperty("stratament"));

            view.setText(roo.getProperty("vizualizare"));
            update.setText(roo.getProperty("schimba"));
            filtrare.setText(roo.getProperty("filtrare"));
            cautare.setText(roo.getProperty("cautare"));
            statistici.setText(roo.getProperty("statistici"));

            addProgram.setText(roo.getProperty("adaugap"));
            deleteProgram.setText(roo.getProperty("stergep"));
            viewProgram.setText(roo.getProperty("vizualizarep"));
            viewProgramari.setText(roo.getProperty("vizualizareprogramari"));

            luna.setText(roo.getProperty("luna"));
            zi.setText(roo.getProperty("zi"));
            ora.setText(roo.getProperty("orai"));
            orasf.setText(roo.getProperty("orasf"));
            minut.setText(roo.getProperty("minutsf"));

            luna1.setText(roo.getProperty("ssid"));
            zi1.setText(roo.getProperty("szi"));
            ora1.setText(roo.getProperty("sorai"));
            orasf1.setText(roo.getProperty("sorasf"));
            minut1.setText(roo.getProperty("sminutsf"));
        }
        else if(limba1.equals("engleza")){
            nume.setText(prop.getProperty("nume"));
            prenume.setText(prop.getProperty("prenume"));
            varsta.setText(prop.getProperty("id"));
            nrLegitimatie.setText(prop.getProperty("legitimatie"));
            simptome.setText(prop.getProperty("simptome"));
            diagnostic.setText(prop.getProperty("diagnostic"));
            tratament.setText(prop.getProperty("tratament"));

            nume2.setText(prop.getProperty("snume"));
            prenume2.setText(prop.getProperty("sprenume"));
            varsta2.setText(prop.getProperty("sid"));
            nrLegitimatie2.setText(prop.getProperty("slegitimatie"));
            simptome2.setText(prop.getProperty("ssimptome"));
            diagnostic2.setText(prop.getProperty("sdiagnostic"));
            tratament2.setText(prop.getProperty("stratament"));

            view.setText(prop.getProperty("vizualizare"));
            update.setText(prop.getProperty("schimba"));
            filtrare.setText(prop.getProperty("filtrare"));
            cautare.setText(prop.getProperty("cautare"));
            statistici.setText(prop.getProperty("statistici"));

            addProgram.setText(prop.getProperty("adaugap"));
            deleteProgram.setText(prop.getProperty("stergep"));
            viewProgram.setText(prop.getProperty("vizualizarep"));
            viewProgramari.setText(prop.getProperty("vizualizareprogramari"));

            luna.setText(prop.getProperty("luna"));
            zi.setText(prop.getProperty("zi"));
            ora.setText(prop.getProperty("orai"));
            orasf.setText(prop.getProperty("orasf"));
            minut.setText(prop.getProperty("minutsf"));

            luna1.setText(prop.getProperty("ssid"));
            zi1.setText(prop.getProperty("szi"));
            ora1.setText(prop.getProperty("sorai"));
            orasf1.setText(prop.getProperty("sorasf"));
            minut1.setText(prop.getProperty("sminutsf"));
        }
        else if(limba1.equals("franceza")){
            nume.setText(frr.getProperty("nume"));
            prenume.setText(frr.getProperty("prenume"));
            varsta.setText(frr.getProperty("id"));
            nrLegitimatie.setText(frr.getProperty("legitimatie"));
            simptome.setText(frr.getProperty("simptome"));
            diagnostic.setText(frr.getProperty("diagnostic"));
            tratament.setText(frr.getProperty("tratament"));

            nume2.setText(frr.getProperty("snume"));
            prenume2.setText(frr.getProperty("sprenume"));
            varsta2.setText(frr.getProperty("sid"));
            nrLegitimatie2.setText(frr.getProperty("slegitimatie"));
            simptome2.setText(frr.getProperty("ssimptome"));
            diagnostic2.setText(frr.getProperty("sdiagnostic"));
            tratament2.setText(frr.getProperty("stratament"));

            view.setText(frr.getProperty("vizualizare"));
            update.setText(frr.getProperty("schimba"));
            filtrare.setText(frr.getProperty("filtrare"));
            cautare.setText(frr.getProperty("cautare"));
            statistici.setText(frr.getProperty("statistici"));

            addProgram.setText(frr.getProperty("adaugap"));
            deleteProgram.setText(frr.getProperty("stergep"));
            viewProgram.setText(frr.getProperty("vizualizarep"));
            viewProgramari.setText(frr.getProperty("vizualizareprogramari"));

            luna.setText(frr.getProperty("luna"));
            zi.setText(frr.getProperty("zi"));
            ora.setText(frr.getProperty("orai"));
            orasf.setText(frr.getProperty("orasf"));
            minut.setText(frr.getProperty("minutsf"));

            luna1.setText(frr.getProperty("ssid"));
            zi1.setText(frr.getProperty("szi"));
            ora1.setText(frr.getProperty("sorai"));
            orasf1.setText(frr.getProperty("sorasf"));
            minut1.setText(frr.getProperty("sminutsf"));
        }

        login.add(nume);
        login.add(prenume);
        login.add(varsta);
        login.add(this.nrLegitimatie);
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
        login.add(view);
        login.add(update);
        login.add(filtrare);
        login.add(cautare);
        login.add(facenameCombo);
        login.add(crit);
        login.add(num);
        login.add(prenum);
        login.add(statistici);
        login.add(facenameCombo1);
        login.add(addProgram);
        login.add(deleteProgram);
        login.add(viewProgram);
        login.add(viewProgramari);
        login.add(luna);
        login.add(luna1);
        login.add(luna2);
        login.add(luna3);
        login.add(zi);
        //login.add(zi1);
        login.add(zi2);
        //login.add(zi3);
        login.add(ora);
        //login.add(ora1);
        login.add(ora2);
        //login.add(ora3);
        login.add(orasf);
        //login.add(orasf1);
        login.add(orasf2);
        //login.add(orasf3);
        login.add(minut);
        //login.add(minut1);
        login.add(minut2);
        //login.add(minut3);

        login.add(lang);
        login.add(lang1);
        login.add(lang2);


        try{
            image= ImageIO.read(new File("E:/an3/sem2/PS/Tema11/natura.jpg"));
        }catch (IOException e)
        {

        }

        ImageIcon icon = new ImageIcon(image);
        label.setIcon(icon);
        login.add(label);



        co1.vizual(view,nrLegitimatie6,login,nume3,prenume3,varsta3,nrLegitimatie3,simptome3,diagnostic3,tratament3,pacienti);
        co1.update1(update,nrLegitimatie6,simptome1,diagnostic1,tratament1,nume3,prenume3,varsta3,pacienti);
        co1.filtrare(filtrare,nrLegitimatie6,login,crit,facenameCombo,pacienti);
        co1.cauta(cautare,nrLegitimatie6,login,num,prenum,pacienti);
        co1.statistic(statistici,nrLegitimatie6,facenameCombo1,pacienti);
        co1.vizualProgramConsult(viewProgramari,nrLegitimatie6, programari);
        co1.addProgramDoctor(addProgram,luna2,zi2,ora2,orasf2,minut2,nrLegitimatie6,conturi,doc);
        co1.vizualProgramDoctor(viewProgram,nrLegitimatie6,login,luna3,zi3,ora3,orasf3,minut3,nrLegitimatie6,doc);
        co1.deleteProgramDoctor(deleteProgram,luna3,zi3,ora3,doc,nrLegitimatie3);

        frame.getContentPane().add(login);
        frame.setVisible(true);
    }

    public InterfataMedic() {

    }
}
