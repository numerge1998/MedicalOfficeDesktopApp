package client;


import javax.imageio.ImageIO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Interfata extends JFrame{

    JFrame frame = new JFrame("Logare");
    JPanel login = new JPanel();
    JLabel label = new JLabel();
    BufferedImage image;

    ControllerInterfata inter = new ControllerInterfata();

    JLabel user = new JLabel("Utilizator:");
    JLabel parola = new JLabel("Parola:");


    JTextField user1 = new JTextField();
    JPasswordField parola1 = new JPasswordField();
    JButton log = new JButton("Logare");

    JLabel limb = new JLabel("romana");

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

    public Interfata()
    {
        frame.setSize(500,500);
        frame.setLocation(10, 10);
        login.setLayout(null);
        label.setBounds(0,0,500,500);

        user.setBounds(150,150,100,20);
        user1.setBounds(220,150,100,20);
        parola.setBounds(150,180,100,20);
        parola1.setBounds(220,180,100,20);
        log.setBounds(220,210,100,20);
        lang.setBounds(150,410,100,20);
        lang1.setBounds(260,410,100,20);
        lang2.setBounds(370,410,100,20);

        Limba ll = new Limba("romana");
        Properties en = new Properties();
        Properties ro = new Properties();
        Properties fr = new Properties();
        try (InputStream input = new FileInputStream("E:/an3/sem2/PS/Tema21/src/main/resources/engleza.properties");
             InputStream input1 = new FileInputStream("E:/an3/sem2/PS/Tema21/src/main/resources/romana.properties");
             InputStream input2 = new FileInputStream("E:/an3/sem2/PS/Tema21/src/main/resources/franceza.properties")) {

            en.load(input);
            ro.load(input1);
            fr.load(input2);

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        InterfataAdmin.getLang().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.setText(ro.getProperty("utilizator"));
                parola.setText(ro.getProperty("parola"));
                log.setText(ro.getProperty("logare"));
                lang.setText(ro.getProperty("engleza"));
                lang1.setText(ro.getProperty("romana"));
                lang2.setText(ro.getProperty("franceza"));
                ll.setLimbaa("romana");
                limb.setText("romana");
            }
        });

        InterfataAdmin.getLang1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.setText(en.getProperty("utilizator"));
                parola.setText(en.getProperty("parola"));
                log.setText(en.getProperty("logare"));
                lang.setText(en.getProperty("engleza"));
                lang1.setText(en.getProperty("romana"));
                lang2.setText(en.getProperty("franceza"));
                ll.setLimbaa("engleza");
                limb.setText("engleza");
            }
        });

        InterfataAdmin.getLang2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.setText(fr.getProperty("utilizator"));
                parola.setText(fr.getProperty("parola"));
                log.setText(fr.getProperty("logare"));
                lang.setText(fr.getProperty("engleza"));
                lang1.setText(fr.getProperty("romana"));
                lang2.setText(fr.getProperty("franceza"));
                ll.setLimbaa("franceza");
                limb.setText("franceza");
            }
        });

        InterfataAsistent.getLang().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.setText(ro.getProperty("utilizator"));
                parola.setText(ro.getProperty("parola"));
                log.setText(ro.getProperty("logare"));
                lang.setText(ro.getProperty("engleza"));
                lang1.setText(ro.getProperty("romana"));
                lang2.setText(ro.getProperty("franceza"));
                ll.setLimbaa("romana");
                limb.setText("romana");
            }
        });

        InterfataAsistent.getLang1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.setText(en.getProperty("utilizator"));
                parola.setText(en.getProperty("parola"));
                log.setText(en.getProperty("logare"));
                lang.setText(en.getProperty("engleza"));
                lang1.setText(en.getProperty("romana"));
                lang2.setText(en.getProperty("franceza"));
                ll.setLimbaa("engleza");
                limb.setText("engleza");
            }
        });

        InterfataAsistent.getLang2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.setText(fr.getProperty("utilizator"));
                parola.setText(fr.getProperty("parola"));
                log.setText(fr.getProperty("logare"));
                lang.setText(fr.getProperty("engleza"));
                lang1.setText(fr.getProperty("romana"));
                lang2.setText(fr.getProperty("franceza"));
                ll.setLimbaa("franceza");
                limb.setText("franceza");
            }
        });

        InterfataMedic.getLang().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.setText(ro.getProperty("utilizator"));
                parola.setText(ro.getProperty("parola"));
                log.setText(ro.getProperty("logare"));
                lang.setText(ro.getProperty("engleza"));
                lang1.setText(ro.getProperty("romana"));
                lang2.setText(ro.getProperty("franceza"));
                ll.setLimbaa("romana");
                limb.setText("romana");
            }
        });

        InterfataMedic.getLang1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.setText(en.getProperty("utilizator"));
                parola.setText(en.getProperty("parola"));
                log.setText(en.getProperty("logare"));
                lang.setText(en.getProperty("engleza"));
                lang1.setText(en.getProperty("romana"));
                lang2.setText(en.getProperty("franceza"));
                ll.setLimbaa("engleza");
                limb.setText("engleza");
            }
        });

        InterfataMedic.getLang2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.setText(fr.getProperty("utilizator"));
                parola.setText(fr.getProperty("parola"));
                log.setText(fr.getProperty("logare"));
                lang.setText(fr.getProperty("engleza"));
                lang1.setText(fr.getProperty("romana"));
                lang2.setText(fr.getProperty("franceza"));
                ll.setLimbaa("franceza");
                limb.setText("franceza");
            }
        });

        inter.limba(lang1,user,parola,log,lang,lang2,ll,en,ro,fr,this);

        login.add(user);
        login.add(user1);
        login.add(parola);
        login.add(parola1);
        login.add(log);
        login.add(lang);
        login.add(lang1);
        login.add(lang2);

        try{
            image= ImageIO.read(new File("E:/an3/sem2/PS/Tema11/doctor.jpg"));
        }catch (IOException e)
        {

        }

        ImageIcon icon = new ImageIcon(image);
        label.setIcon(icon);
        login.add(label);

        frame.getContentPane().add(login);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        inter.logare(log,user1,parola1,en,ro,fr,ll.getLimbaa(),this);

    }
}