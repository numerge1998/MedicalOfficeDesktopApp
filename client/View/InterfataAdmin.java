package client;

//import controller.ControllerAdministrator;

import server.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Properties;

public class InterfataAdmin extends JFrame{


    private JFrame frame = new JFrame("Administrator");
    private JPanel login = new JPanel();
    private JLabel label = new JLabel();
    BufferedImage image;

    private JLabel user = new JLabel("Utilizaotr:");
    private JLabel parola = new JLabel("Parola:");
    private JLabel rol = new JLabel("Rol:");

    public JLabel getUser() {
        return user;
    }

    private JLabel nume = new JLabel("Nume:");
    private JLabel prenume = new JLabel("Prenume:");
    private JLabel varsta = new JLabel("Varsta:");
    private JLabel nrlegitimatie = new JLabel("NrLegitim:");
    private JTextField user1 = new JTextField();
    private JPasswordField parola1 = new JPasswordField();
    private JTextField nume1 = new JTextField();
    private JTextField prenume1 = new JTextField();
    private JTextField varsta1 = new JTextField();
    private JTextField nrLegitimatie1 = new JTextField();
    private JTextField rol1 = new JTextField();
    private JLabel user2 = new JLabel("Schimba/Sterge Utilizator:");
    private JLabel parola2 = new JLabel("Schimba/Sterge Parola:");
    private JLabel rol2 = new JLabel("Schimba/Sterge Rol:");
    private JLabel nume2 = new JLabel("Schimba/Sterge Nume:");
    private JLabel prenume2 = new JLabel("Schimba/Sterge Prenume:");



    private JLabel varsta2 = new JLabel("Schimba/Sterge Varsta:");
    private JLabel nrlegitimatie2 = new JLabel("Schimba/Sterge NrLegitim:");
    private JTextField user3 = new JTextField();
    private JTextField parola3 = new JTextField();
    private JTextField rol3 = new JTextField();
    private JTextField nume3 = new JTextField();
    private JTextField prenume3 = new JTextField();
    private JTextField varsta3 = new JTextField();
    private JTextField nrLegitimatie3 = new JTextField();
    private JButton add = new JButton("Adauga");
    private JButton delete = new JButton("Sterge");
    private JButton view = new JButton("Vizualizare");
    private JButton update = new JButton("Schimbare");

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

    public InterfataAdmin(PersistentaContUtilizator conturi, PersistentaUtilizator utilizatori, Properties prop, Properties roo, Properties frr, String limba1){
        ControllerAdministrator co = new ControllerAdministrator();
        frame.setSize(1788,1000);
        frame.setLocation(10, 10);
        login.setLayout(null);
        label.setBounds(0,0,1788,1000);

        user.setBounds(10,10,100,20);
        parola.setBounds(10,40,100,20);
        rol.setBounds(10,70,100,20);
        nume.setBounds(10,100,100,20);
        prenume.setBounds(10,130,100,20);
        varsta.setBounds(10,160,100,20);
        nrlegitimatie.setBounds(10,190,100,20);
        user1.setBounds(120,10,100,20);
        parola1.setBounds(120,40,100,20);
        rol1.setBounds(120,70,100,20);
        nume1.setBounds(120,100,100,20);
        prenume1.setBounds(120,130,100,20);
        varsta1.setBounds(120,160,100,20);
        nrLegitimatie1.setBounds(120,190,100,20);
        user2.setBounds(300,10,200,20);
        parola2.setBounds(300,40,200,20);
        rol2.setBounds(300,70,200,20);
        nume2.setBounds(300,100,200,20);
        prenume2.setBounds(300,130,200,20);
        varsta2.setBounds(300,160,200,20);
        nrlegitimatie2.setBounds(300,190,200,20);
        user3.setBounds(460,10,100,20);
        parola3.setBounds(460,40,100,20);
        rol3.setBounds(460,70,100,20);
        nume3.setBounds(460,100,100,20);
        prenume3.setBounds(460,130,100,20);
        varsta3.setBounds(460,160,100,20);
        nrLegitimatie3.setBounds(460,190,100,20);
        add.setBounds(10,240,100,20);
        delete.setBounds(120,240,100,20);
        view.setBounds(10,270,100,20);
        update.setBounds(120,270,100,20);

        lang.setBounds(1150,750,100,20);
        lang1.setBounds(1260,750,100,20);
        lang2.setBounds(1370,750,100,20);

        co.limba(user,parola,rol,nume,prenume,varsta,nrlegitimatie,user2,parola2,rol2,nume2,prenume2,varsta2,nrlegitimatie2,add,delete,update,view,prop,roo,frr);

        if(limba1.equals("romana")){
            user.setText(roo.getProperty("utilizator"));
            parola.setText(roo.getProperty("parola"));
            rol.setText(roo.getProperty("rol"));
            nume.setText(roo.getProperty("nume"));
            prenume.setText(roo.getProperty("prenume"));
            varsta.setText(roo.getProperty("varsta"));
            nrlegitimatie.setText(roo.getProperty("legitimatie"));

            user2.setText(roo.getProperty("sutilizator"));
            parola2.setText(roo.getProperty("sparola"));
            rol2.setText(roo.getProperty("srol"));
            nume2.setText(roo.getProperty("snume"));
            prenume2.setText(roo.getProperty("sprenume"));
            varsta2.setText(roo.getProperty("svarsta"));
            nrlegitimatie2.setText(roo.getProperty("slegitimatie"));

            add.setText(roo.getProperty("adauga"));
            delete.setText(roo.getProperty("sterge"));
            update.setText(roo.getProperty("schimba"));
            view.setText(roo.getProperty("vizualizare"));
        } else if(limba1.equals("engleza")){
            user.setText(prop.getProperty("utilizator"));
            parola.setText(prop.getProperty("parola"));
            rol.setText(prop.getProperty("rol"));
            nume.setText(prop.getProperty("nume"));
            prenume.setText(prop.getProperty("prenume"));
            varsta.setText(prop.getProperty("varsta"));
            nrlegitimatie.setText(prop.getProperty("legitimatie"));

            user2.setText(prop.getProperty("sutilizator"));
            parola2.setText(prop.getProperty("sparola"));
            rol2.setText(prop.getProperty("srol"));
            nume2.setText(prop.getProperty("snume"));
            prenume2.setText(prop.getProperty("sprenume"));
            varsta2.setText(prop.getProperty("svarsta"));
            nrlegitimatie2.setText(prop.getProperty("slegitimatie"));

            add.setText(prop.getProperty("adauga"));
            delete.setText(prop.getProperty("sterge"));
            update.setText(prop.getProperty("schimba"));
            view.setText(prop.getProperty("vizualizare"));
        } else if(limba1.equals("franceza")){
            user.setText(frr.getProperty("utilizator"));
            parola.setText(frr.getProperty("parola"));
            rol.setText(frr.getProperty("rol"));
            nume.setText(frr.getProperty("nume"));
            prenume.setText(frr.getProperty("prenume"));
            varsta.setText(frr.getProperty("varsta"));
            nrlegitimatie.setText(frr.getProperty("legitimatie"));

            user2.setText(frr.getProperty("sutilizator"));
            parola2.setText(frr.getProperty("sparola"));
            rol2.setText(frr.getProperty("srol"));
            nume2.setText(frr.getProperty("snume"));
            prenume2.setText(frr.getProperty("sprenume"));
            varsta2.setText(frr.getProperty("svarsta"));
            nrlegitimatie2.setText(frr.getProperty("slegitimatie"));

            add.setText(frr.getProperty("adauga"));
            delete.setText(frr.getProperty("sterge"));
            update.setText(frr.getProperty("schimba"));
            view.setText(frr.getProperty("vizualizare"));
        }

        login.add(user);
        login.add(user1);
        login.add(rol);
        login.add(rol1);
        login.add(parola);
        login.add(parola1);
        login.add(user2);
        login.add(user3);
        login.add(rol2);
        login.add(rol3);
        login.add(parola2);
        login.add(parola3);
        login.add(add);
        login.add(delete);
        login.add(view);
        login.add(update);
        login.add(nume);
        login.add(nume1);
        login.add(nume2);
        login.add(nume3);
        login.add(prenume);
        login.add(prenume1);
        login.add(prenume2);
        login.add(prenume3);
        login.add(varsta);
        login.add(varsta1);
        login.add(varsta2);
        login.add(varsta3);
        login.add(nrlegitimatie);
        login.add(nrLegitimatie1);
        login.add(nrlegitimatie2);
        login.add(nrLegitimatie3);
        login.add(lang);
        login.add(lang1);
        login.add(lang2);

        try{
            image= ImageIO.read(new File("E:/an3/sem2/PS/Tema11/car1.jpg"));
        }catch (IOException e)
        {

        }

        ImageIcon icon = new ImageIcon(image);
        label.setIcon(icon);
        login.add(label);



        co.add1(add,user1,parola1,rol1,nume1,prenume1,varsta1,nrLegitimatie1,conturi);
        co.vizual(view,login,user3,parola3,rol3,nume3,prenume3,varsta3,nrLegitimatie3,conturi);
        co.delete1(delete,user3,parola3,rol3,nume3,prenume3,varsta3,nrLegitimatie3,conturi);
        co.update1(update,user1,parola1,rol1,nume1,prenume1,varsta1,nrLegitimatie1,user3,parola3,rol3,nume3,prenume3,varsta3,nrLegitimatie3,conturi,utilizatori);

        frame.getContentPane().add(login);
        frame.setVisible(true);
    }

    public InterfataAdmin() {

    }
}
