package client;


import client.InterfataAdmin;
import client.InterfataAsistent;
import client.InterfataMedic;
import server.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Properties;

public class ControllerInterfata{

    public void limba(JButton en, JLabel user, JLabel parola, JButton log, JButton ro, JButton fr, Limba ll, Properties prop, Properties roo, Properties frr, Interfata interfata){
        en.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.setText(prop.getProperty("utilizator"));
                parola.setText(prop.getProperty("parola"));
                log.setText(prop.getProperty("logare"));
                en.setText(prop.getProperty("engleza"));
                ro.setText(prop.getProperty("romana"));
                fr.setText(prop.getProperty("franceza"));
                ll.setLimbaa("engleza");
                interfata.limb.setText("engleza");

            }
        });

        ro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                user.setText(roo.getProperty("utilizator"));
                parola.setText(roo.getProperty("parola"));
                log.setText(roo.getProperty("logare"));
                en.setText(roo.getProperty("engleza"));
                ro.setText(roo.getProperty("romana"));
                fr.setText(roo.getProperty("franceza"));
                ll.setLimbaa("romana");
                interfata.limb.setText("romana");
            }
        });

        fr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                user.setText(frr.getProperty("utilizator"));
                parola.setText(frr.getProperty("parola"));
                log.setText(frr.getProperty("logare"));
                en.setText(frr.getProperty("engleza"));
                ro.setText(frr.getProperty("romana"));
                fr.setText(frr.getProperty("franceza"));
                ll.setLimbaa("franceza");
                interfata.limb.setText("franceza");
            }
        });

    }

    public void logare(JButton log, JTextField user1, JTextField parola1, Properties prop, Properties roo, Properties frr, String limba, Interfata interfata) {
        log.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Socket socket = null;
                PersistentaContUtilizator conturi = null;
                PersistentaPacient pacienti = null;
                PersistentaProgram programari = null;
                PersistentaProgramDoc program = null;
                PersistentaUtilizator utilizatori = null;

                System.out.println("\n\n" + interfata.limb.getText());

                try {
                    socket = new Socket("localhost", 7777);
                    System.out.println("Connected!");

                    InputStream inputStream = socket.getInputStream();
                    // create a DataInputStream so we can read data from it.
                    ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
                    conturi = (PersistentaContUtilizator) objectInputStream.readObject();
                    pacienti = (PersistentaPacient) objectInputStream.readObject();
                    programari = (PersistentaProgram) objectInputStream.readObject();
                    program = (PersistentaProgramDoc) objectInputStream.readObject();
                    utilizatori = (PersistentaUtilizator) objectInputStream.readObject();
                    socket.close();
                } catch (IOException | ClassNotFoundException ex) {
                    ex.printStackTrace();
                }


                boolean ok = false;
                for (ContUtilizator c : conturi.viewConturi())
                    if (c.getUser().equals(user1.getText()) && c.getParola().equals(parola1.getText()) && conturi.getRol(c.getNrLegitimatie()).equals("medic")) {
                        ok = true;
                        new InterfataMedic(c.getNrLegitimatie(),pacienti,conturi,program,programari,prop,roo,frr,interfata.limb.getText());
                        break;
                    } else if (c.getUser().equals(user1.getText()) && c.getParola().equals(parola1.getText()) && conturi.getRol(c.getNrLegitimatie()).equals("asistent")) {
                        ok = true;
                        new InterfataAsistent(pacienti,conturi,programari,program,prop,roo,frr,interfata.limb.getText());
                        break;

                    } else if (c.getUser().equals(user1.getText()) && c.getParola().equals(parola1.getText()) && conturi.getRol(c.getNrLegitimatie()).equals("admin")) {
                        ok = true;
                        new InterfataAdmin(conturi,utilizatori,prop,roo,frr,interfata.limb.getText());
                        break;

                    }
                if (ok == false) {
                    JOptionPane.showMessageDialog(null,
                            "Invalid username or password",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

}
