package client;

//import model.*;
//import view.InterfataAdmin;

import server.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Properties;

public class ControllerAdministrator {

    public void limba(JLabel user, JLabel parola, JLabel rol, JLabel nume, JLabel prenuma, JLabel varsta, JLabel nrlegit, JLabel user2, JLabel parola2, JLabel rol2, JLabel nume2, JLabel prenuma2, JLabel varsta2, JLabel nrlegit2, JButton add, JButton delete, JButton update, JButton view, Properties prop, Properties roo, Properties frr){
        Interfata.getLang().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.setText(roo.getProperty("utilizator"));
                parola.setText(roo.getProperty("parola"));
                rol.setText(roo.getProperty("rol"));
                nume.setText(roo.getProperty("nume"));
                prenuma.setText(roo.getProperty("prenume"));
                varsta.setText(roo.getProperty("varsta"));
                nrlegit.setText(roo.getProperty("legitimatie"));

                user2.setText(roo.getProperty("sutilizator"));
                parola2.setText(roo.getProperty("sparola"));
                rol2.setText(roo.getProperty("srol"));
                nume2.setText(roo.getProperty("snume"));
                prenuma2.setText(roo.getProperty("sprenume"));
                varsta2.setText(roo.getProperty("svarsta"));
                nrlegit2.setText(roo.getProperty("slegitimatie"));

                add.setText(roo.getProperty("adauga"));
                delete.setText(roo.getProperty("sterge"));
                update.setText(roo.getProperty("schimba"));
                view.setText(roo.getProperty("vizualizare"));

            }
        });

        Interfata.getLang1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.setText(prop.getProperty("utilizator"));
                parola.setText(prop.getProperty("parola"));
                rol.setText(prop.getProperty("rol"));
                nume.setText(prop.getProperty("nume"));
                prenuma.setText(prop.getProperty("prenume"));
                varsta.setText(prop.getProperty("varsta"));
                nrlegit.setText(prop.getProperty("legitimatie"));

                user2.setText(prop.getProperty("sutilizator"));
                parola2.setText(prop.getProperty("sparola"));
                rol2.setText(prop.getProperty("srol"));
                nume2.setText(prop.getProperty("snume"));
                prenuma2.setText(prop.getProperty("sprenume"));
                varsta2.setText(prop.getProperty("svarsta"));
                nrlegit2.setText(prop.getProperty("slegitimatie"));

                add.setText(prop.getProperty("adauga"));
                delete.setText(prop.getProperty("sterge"));
                update.setText(prop.getProperty("schimba"));
                view.setText(prop.getProperty("vizualizare"));

            }
        });

        Interfata.getLang2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.setText(frr.getProperty("utilizator"));
                parola.setText(frr.getProperty("parola"));
                rol.setText(frr.getProperty("rol"));
                nume.setText(frr.getProperty("nume"));
                prenuma.setText(frr.getProperty("prenume"));
                varsta.setText(frr.getProperty("varsta"));
                nrlegit.setText(frr.getProperty("legitimatie"));

                user2.setText(frr.getProperty("sutilizator"));
                parola2.setText(frr.getProperty("sparola"));
                rol2.setText(frr.getProperty("srol"));
                nume2.setText(frr.getProperty("snume"));
                prenuma2.setText(frr.getProperty("sprenume"));
                varsta2.setText(frr.getProperty("svarsta"));
                nrlegit2.setText(frr.getProperty("slegitimatie"));

                add.setText(frr.getProperty("adauga"));
                delete.setText(frr.getProperty("sterge"));
                update.setText(frr.getProperty("schimba"));
                view.setText(frr.getProperty("vizualizare"));

            }
        });

        InterfataAdmin.getLang().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.setText(roo.getProperty("utilizator"));
                parola.setText(roo.getProperty("parola"));
                rol.setText(roo.getProperty("rol"));
                nume.setText(roo.getProperty("nume"));
                prenuma.setText(roo.getProperty("prenume"));
                varsta.setText(roo.getProperty("varsta"));
                nrlegit.setText(roo.getProperty("legitimatie"));

                user2.setText(roo.getProperty("sutilizator"));
                parola2.setText(roo.getProperty("sparola"));
                rol2.setText(roo.getProperty("srol"));
                nume2.setText(roo.getProperty("snume"));
                prenuma2.setText(roo.getProperty("sprenume"));
                varsta2.setText(roo.getProperty("svarsta"));
                nrlegit2.setText(roo.getProperty("slegitimatie"));

                add.setText(roo.getProperty("adauga"));
                delete.setText(roo.getProperty("sterge"));
                update.setText(roo.getProperty("schimba"));
                view.setText(roo.getProperty("vizualizare"));

            }
        });

        InterfataAdmin.getLang1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.setText(prop.getProperty("utilizator"));
                parola.setText(prop.getProperty("parola"));
                rol.setText(prop.getProperty("rol"));
                nume.setText(prop.getProperty("nume"));
                prenuma.setText(prop.getProperty("prenume"));
                varsta.setText(prop.getProperty("varsta"));
                nrlegit.setText(prop.getProperty("legitimatie"));

                user2.setText(prop.getProperty("sutilizator"));
                parola2.setText(prop.getProperty("sparola"));
                rol2.setText(prop.getProperty("srol"));
                nume2.setText(prop.getProperty("snume"));
                prenuma2.setText(prop.getProperty("sprenume"));
                varsta2.setText(prop.getProperty("svarsta"));
                nrlegit2.setText(prop.getProperty("slegitimatie"));

                add.setText(prop.getProperty("adauga"));
                delete.setText(prop.getProperty("sterge"));
                update.setText(prop.getProperty("schimba"));
                view.setText(prop.getProperty("vizualizare"));

            }
        });

        InterfataAdmin.getLang2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.setText(frr.getProperty("utilizator"));
                parola.setText(frr.getProperty("parola"));
                rol.setText(frr.getProperty("rol"));
                nume.setText(frr.getProperty("nume"));
                prenuma.setText(frr.getProperty("prenume"));
                varsta.setText(frr.getProperty("varsta"));
                nrlegit.setText(frr.getProperty("legitimatie"));

                user2.setText(frr.getProperty("sutilizator"));
                parola2.setText(frr.getProperty("sparola"));
                rol2.setText(frr.getProperty("srol"));
                nume2.setText(frr.getProperty("snume"));
                prenuma2.setText(frr.getProperty("sprenume"));
                varsta2.setText(frr.getProperty("svarsta"));
                nrlegit2.setText(frr.getProperty("slegitimatie"));

                add.setText(frr.getProperty("adauga"));
                delete.setText(frr.getProperty("sterge"));
                update.setText(frr.getProperty("schimba"));
                view.setText(frr.getProperty("vizualizare"));

            }
        });

        InterfataAsistent.getLang().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.setText(roo.getProperty("utilizator"));
                parola.setText(roo.getProperty("parola"));
                rol.setText(roo.getProperty("rol"));
                nume.setText(roo.getProperty("nume"));
                prenuma.setText(roo.getProperty("prenume"));
                varsta.setText(roo.getProperty("varsta"));
                nrlegit.setText(roo.getProperty("legitimatie"));

                user2.setText(roo.getProperty("sutilizator"));
                parola2.setText(roo.getProperty("sparola"));
                rol2.setText(roo.getProperty("srol"));
                nume2.setText(roo.getProperty("snume"));
                prenuma2.setText(roo.getProperty("sprenume"));
                varsta2.setText(roo.getProperty("svarsta"));
                nrlegit2.setText(roo.getProperty("slegitimatie"));

                add.setText(roo.getProperty("adauga"));
                delete.setText(roo.getProperty("sterge"));
                update.setText(roo.getProperty("schimba"));
                view.setText(roo.getProperty("vizualizare"));

            }
        });

        InterfataAsistent.getLang1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.setText(prop.getProperty("utilizator"));
                parola.setText(prop.getProperty("parola"));
                rol.setText(prop.getProperty("rol"));
                nume.setText(prop.getProperty("nume"));
                prenuma.setText(prop.getProperty("prenume"));
                varsta.setText(prop.getProperty("varsta"));
                nrlegit.setText(prop.getProperty("legitimatie"));

                user2.setText(prop.getProperty("sutilizator"));
                parola2.setText(prop.getProperty("sparola"));
                rol2.setText(prop.getProperty("srol"));
                nume2.setText(prop.getProperty("snume"));
                prenuma2.setText(prop.getProperty("sprenume"));
                varsta2.setText(prop.getProperty("svarsta"));
                nrlegit2.setText(prop.getProperty("slegitimatie"));

                add.setText(prop.getProperty("adauga"));
                delete.setText(prop.getProperty("sterge"));
                update.setText(prop.getProperty("schimba"));
                view.setText(prop.getProperty("vizualizare"));

            }
        });

        InterfataAsistent.getLang2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.setText(frr.getProperty("utilizator"));
                parola.setText(frr.getProperty("parola"));
                rol.setText(frr.getProperty("rol"));
                nume.setText(frr.getProperty("nume"));
                prenuma.setText(frr.getProperty("prenume"));
                varsta.setText(frr.getProperty("varsta"));
                nrlegit.setText(frr.getProperty("legitimatie"));

                user2.setText(frr.getProperty("sutilizator"));
                parola2.setText(frr.getProperty("sparola"));
                rol2.setText(frr.getProperty("srol"));
                nume2.setText(frr.getProperty("snume"));
                prenuma2.setText(frr.getProperty("sprenume"));
                varsta2.setText(frr.getProperty("svarsta"));
                nrlegit2.setText(frr.getProperty("slegitimatie"));

                add.setText(frr.getProperty("adauga"));
                delete.setText(frr.getProperty("sterge"));
                update.setText(frr.getProperty("schimba"));
                view.setText(frr.getProperty("vizualizare"));

            }
        });

        InterfataMedic.getLang().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.setText(roo.getProperty("utilizator"));
                parola.setText(roo.getProperty("parola"));
                rol.setText(roo.getProperty("rol"));
                nume.setText(roo.getProperty("nume"));
                prenuma.setText(roo.getProperty("prenume"));
                varsta.setText(roo.getProperty("varsta"));
                nrlegit.setText(roo.getProperty("legitimatie"));

                user2.setText(roo.getProperty("sutilizator"));
                parola2.setText(roo.getProperty("sparola"));
                rol2.setText(roo.getProperty("srol"));
                nume2.setText(roo.getProperty("snume"));
                prenuma2.setText(roo.getProperty("sprenume"));
                varsta2.setText(roo.getProperty("svarsta"));
                nrlegit2.setText(roo.getProperty("slegitimatie"));

                add.setText(roo.getProperty("adauga"));
                delete.setText(roo.getProperty("sterge"));
                update.setText(roo.getProperty("schimba"));
                view.setText(roo.getProperty("vizualizare"));

            }
        });

        InterfataMedic.getLang1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.setText(prop.getProperty("utilizator"));
                parola.setText(prop.getProperty("parola"));
                rol.setText(prop.getProperty("rol"));
                nume.setText(prop.getProperty("nume"));
                prenuma.setText(prop.getProperty("prenume"));
                varsta.setText(prop.getProperty("varsta"));
                nrlegit.setText(prop.getProperty("legitimatie"));

                user2.setText(prop.getProperty("sutilizator"));
                parola2.setText(prop.getProperty("sparola"));
                rol2.setText(prop.getProperty("srol"));
                nume2.setText(prop.getProperty("snume"));
                prenuma2.setText(prop.getProperty("sprenume"));
                varsta2.setText(prop.getProperty("svarsta"));
                nrlegit2.setText(prop.getProperty("slegitimatie"));

                add.setText(prop.getProperty("adauga"));
                delete.setText(prop.getProperty("sterge"));
                update.setText(prop.getProperty("schimba"));
                view.setText(prop.getProperty("vizualizare"));

            }
        });

        InterfataMedic.getLang2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.setText(frr.getProperty("utilizator"));
                parola.setText(frr.getProperty("parola"));
                rol.setText(frr.getProperty("rol"));
                nume.setText(frr.getProperty("nume"));
                prenuma.setText(frr.getProperty("prenume"));
                varsta.setText(frr.getProperty("varsta"));
                nrlegit.setText(frr.getProperty("legitimatie"));

                user2.setText(frr.getProperty("sutilizator"));
                parola2.setText(frr.getProperty("sparola"));
                rol2.setText(frr.getProperty("srol"));
                nume2.setText(frr.getProperty("snume"));
                prenuma2.setText(frr.getProperty("sprenume"));
                varsta2.setText(frr.getProperty("svarsta"));
                nrlegit2.setText(frr.getProperty("slegitimatie"));

                add.setText(frr.getProperty("adauga"));
                delete.setText(frr.getProperty("sterge"));
                update.setText(frr.getProperty("schimba"));
                view.setText(frr.getProperty("vizualizare"));

            }
        });
    }

    public void add1(JButton ad,JTextField user,JPasswordField pass,JTextField rol,JTextField nume,JTextField prenume,JTextField varsta,JTextField nrLegit,PersistentaContUtilizator conturi){
        ad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                boolean ok = true;
                if(rol.getText().equals("admin")){
                    JOptionPane.showMessageDialog(null,
                            "Nu se pot pot adauga admini noi",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
                else {
                    for (ContUtilizator c : conturi.viewConturi()) {
                        //System.out.println(c.getUser() + " " + c.getParola());
                        if (c.getUser().equals(user.getText()) && c.getParola().equals(pass.getText()) || c.getNrLegitimatie().equals(nrLegit.getText())) {
                            ok = false;
                            JOptionPane.showMessageDialog(null,
                                    "Contul exista deja",
                                    "Error",
                                    JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                    }
                    if (ok == true) {
                        Utilizator ut = new Utilizator(nume.getText(),prenume.getText(),varsta.getText(),nrLegit.getText(),rol.getText());
                        conturi.addUtilizator(ut);
                        if (rol.getText().equals("medic") || rol.getText().equals("asistent") || rol.getText().equals("admin")) {
                            conturi.addCont(new ContUtilizator(user.getText(), pass.getText(), nrLegit.getText()));


                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Rol inexistent",
                                    "Error",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
        });


    }

    public String[][] getData(ArrayList<Object[]> cont)
    {
        String [][] data=new String[cont.size()][7];

        int i=0;
        for(Object[] object : cont) {

            int j=0;
            for (Object field : object) {
                data[i][j] = field.toString();
                j++;
            }
            i++;
        }

        return data;
    }

    public void vizual(JButton view, JPanel login,JTextField user3,JTextField parola3,JTextField rol3,JTextField nume2, JTextField prenume2, JTextField varsta2, JTextField nrLegitim2,PersistentaContUtilizator conturi){
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ArrayList<Object[]> list = conturi.getAll();
                String[][] data = (String[][]) getData(list);
                String[] columnNames = {"User","Parola","Rol","Nume","Prenume","Varsta","NrLegitim"};
                JTable j = new JTable(data, columnNames);
                JScrollPane sp = new JScrollPane(j);
                sp.setBounds(10, 310, 450, 300);
                login.add(sp);
                j.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        user3.setText((String) j.getValueAt(j.getSelectedRow(),0));
                        parola3.setText((String) j.getValueAt(j.getSelectedRow(),1));
                        rol3.setText((String) j.getValueAt(j.getSelectedRow(),2));
                        nume2.setText((String) j.getValueAt(j.getSelectedRow(),3));
                        prenume2.setText((String) j.getValueAt(j.getSelectedRow(),4));
                        varsta2.setText((String) j.getValueAt(j.getSelectedRow(),5));
                        nrLegitim2.setText((String) j.getValueAt(j.getSelectedRow(),6));
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {

                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {

                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {

                    }

                    @Override
                    public void mouseExited(MouseEvent e) {

                    }
                });

            }
        });

    }

    public void delete1(JButton btn,JTextField user3,JTextField parola3,JTextField rol3,JTextField nume3, JTextField prenume3, JTextField varsta3, JTextField nrLegitim3,PersistentaContUtilizator conturi){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                ArrayList<ContUtilizator> list = conturi.viewConturi();
//                ArrayList<ProgramDoc> list1 = program.viewProgramDoc();
////                ArrayList<Program> list2 = programari.viewProgramari();
////                ArrayList<Pacient> list3 = pacienti.viewPacienti();


//                        for (int j = list1.size() - 1; j >=0 ; j--) {
//                            if (list1.get(j).getNrLegitimatie().equals(list.get(i).getUtil().getNrLegitimatie()))
//                                list1.remove(j);
//                        }
//                        for (int j = list2.size() - 1; j >=0 ; j--) {
//                            if (list2.get(j).getNrLegitimatie().equals(list.get(i).getUtil().getNrLegitimatie()))
//                                list2.remove(j);
//                        }
//                        for (int j = list3.size() - 1; j >=0 ; j--) {
//                            if (list3.get(j).getNrLegitimatie().equals(list.get(i).getUtil().getNrLegitimatie()))
//                                list3.remove(j);
//                        }

                        conturi.deleteCont(nrLegitim3.getText());




            }
        });
    }

    public void update1(JButton btn,JTextField user2,JTextField parola2,JTextField rol2,JTextField nume2, JTextField prenume2, JTextField varsta2, JTextField nrLegitim2,JTextField user3,JTextField parola3,JTextField rol3,JTextField nume3, JTextField prenume3, JTextField varsta3, JTextField nrLegitim3,PersistentaContUtilizator conturi,PersistentaUtilizator utlizatori){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(rol3.getText().equals("admin")){
                    JOptionPane.showMessageDialog(null,
                            "Nu se pot efectua modificari adminilor",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
                else if(false == rol2.getText().equals("medic") && false == rol2.getText().equals("asistent")){
                    JOptionPane.showMessageDialog(null,
                            "Rol introdus gresit",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
                else{
                            conturi.updateCont(nrLegitim3.getText(),user2.getText(),parola2.getText());
                            //list.get(i).setUtil(new Utilizator(nume2.getText(),prenume2.getText(),varsta2.getText(),nrLegitim2.getText(),rol2.getText()));
                            utlizatori.updateUtilizator(nrLegitim3.getText(),nume2.getText(),prenume2.getText(),varsta2.getText(),rol2.getText());

                }
            }
        });
    }

}
