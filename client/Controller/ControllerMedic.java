package client;

//import model.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.DefaultValueDataset;
import server.*;

import javax.imageio.ImageIO;
import javax.persistence.criteria.CriteriaBuilder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

public class ControllerMedic {


    BuilderStatistica stat = new BuilderStatistica();

    public void limba(JLabel nume, JLabel prenume, JLabel id, JLabel nrLegitimatie, JLabel simptome, JLabel diagnostic, JLabel tratament, JLabel nume2, JLabel prenume2, JLabel id2, JLabel nrLegitimatie2, JLabel simptome2, JLabel diagnostic2, JLabel tratament2, JButton view, JButton update, JButton filtrare, JButton cautare, JButton statistici, JButton addProgram, JButton deleteProg, JButton viewProg, JButton viewProgramari, JLabel luna, JLabel zi, JLabel ora, JLabel orasf, JLabel minut, JLabel luna2, JLabel zi2, JLabel ora2, JLabel orasf2, JLabel minut2, Properties prop, Properties roo, Properties frr){

        Interfata.getLang().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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

                view.setText(roo.getProperty("vizualizare"));
                update.setText(roo.getProperty("schimba"));
                filtrare.setText(roo.getProperty("filtrare"));
                cautare.setText(roo.getProperty("cautare"));
                statistici.setText(roo.getProperty("statistici"));

                addProgram.setText(roo.getProperty("adaugap"));
                deleteProg.setText(roo.getProperty("stergep"));
                viewProg.setText(roo.getProperty("vizualizarep"));
                viewProgramari.setText(roo.getProperty("vizualizareprogramari"));

                luna.setText(roo.getProperty("luna"));
                zi.setText(roo.getProperty("zi"));
                ora.setText(roo.getProperty("orai"));
                orasf.setText(roo.getProperty("orasf"));
                minut.setText(roo.getProperty("minutsf"));

                luna2.setText(roo.getProperty("ssid"));
                zi2.setText(roo.getProperty("szi"));
                ora2.setText(roo.getProperty("sorai"));
                orasf2.setText(roo.getProperty("sorasf"));
                minut2.setText(roo.getProperty("sminutsf"));

            }
        });

        Interfata.getLang1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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

                view.setText(prop.getProperty("vizualizare"));
                update.setText(prop.getProperty("schimba"));
                filtrare.setText(prop.getProperty("filtrare"));
                cautare.setText(prop.getProperty("cautare"));
                statistici.setText(prop.getProperty("statistici"));

                addProgram.setText(prop.getProperty("adaugap"));
                deleteProg.setText(prop.getProperty("stergep"));
                viewProg.setText(prop.getProperty("vizualizarep"));
                viewProgramari.setText(prop.getProperty("vizualizareprogramari"));

                luna.setText(prop.getProperty("luna"));
                zi.setText(prop.getProperty("zi"));
                ora.setText(prop.getProperty("orai"));
                orasf.setText(prop.getProperty("orasf"));
                minut.setText(prop.getProperty("minutsf"));

                luna2.setText(prop.getProperty("ssid"));
                zi2.setText(prop.getProperty("szi"));
                ora2.setText(prop.getProperty("sorai"));
                orasf2.setText(prop.getProperty("sorasf"));
                minut2.setText(prop.getProperty("sminutsf"));

            }
        });

        Interfata.getLang2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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

                view.setText(frr.getProperty("vizualizare"));
                update.setText(frr.getProperty("schimba"));
                filtrare.setText(frr.getProperty("filtrare"));
                cautare.setText(frr.getProperty("cautare"));
                statistici.setText(frr.getProperty("statistici"));

                addProgram.setText(frr.getProperty("adaugap"));
                deleteProg.setText(frr.getProperty("stergep"));
                viewProg.setText(frr.getProperty("vizualizarep"));
                viewProgramari.setText(frr.getProperty("vizualizareprogramari"));

                luna.setText(frr.getProperty("luna"));
                zi.setText(frr.getProperty("zi"));
                ora.setText(frr.getProperty("orai"));
                orasf.setText(frr.getProperty("orasf"));
                minut.setText(frr.getProperty("minutsf"));

                luna2.setText(frr.getProperty("ssid"));
                zi2.setText(frr.getProperty("szi"));
                ora2.setText(frr.getProperty("sorai"));
                orasf2.setText(frr.getProperty("sorasf"));
                minut2.setText(frr.getProperty("sminutsf"));

            }
        });

        InterfataAdmin.getLang().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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

                view.setText(roo.getProperty("vizualizare"));
                update.setText(roo.getProperty("schimba"));
                filtrare.setText(roo.getProperty("filtrare"));
                cautare.setText(roo.getProperty("cautare"));
                statistici.setText(roo.getProperty("statistici"));

                addProgram.setText(roo.getProperty("adaugap"));
                deleteProg.setText(roo.getProperty("stergep"));
                viewProg.setText(roo.getProperty("vizualizarep"));
                viewProgramari.setText(roo.getProperty("vizualizareprogramari"));

                luna.setText(roo.getProperty("luna"));
                zi.setText(roo.getProperty("zi"));
                ora.setText(roo.getProperty("orai"));
                orasf.setText(roo.getProperty("orasf"));
                minut.setText(roo.getProperty("minutsf"));

                luna2.setText(roo.getProperty("ssid"));
                zi2.setText(roo.getProperty("szi"));
                ora2.setText(roo.getProperty("sorai"));
                orasf2.setText(roo.getProperty("sorasf"));
                minut2.setText(roo.getProperty("sminutsf"));

            }
        });

        InterfataAdmin.getLang1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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

                view.setText(prop.getProperty("vizualizare"));
                update.setText(prop.getProperty("schimba"));
                filtrare.setText(prop.getProperty("filtrare"));
                cautare.setText(prop.getProperty("cautare"));
                statistici.setText(prop.getProperty("statistici"));

                addProgram.setText(prop.getProperty("adaugap"));
                deleteProg.setText(prop.getProperty("stergep"));
                viewProg.setText(prop.getProperty("vizualizarep"));
                viewProgramari.setText(prop.getProperty("vizualizareprogramari"));

                luna.setText(prop.getProperty("luna"));
                zi.setText(prop.getProperty("zi"));
                ora.setText(prop.getProperty("orai"));
                orasf.setText(prop.getProperty("orasf"));
                minut.setText(prop.getProperty("minutsf"));

                luna2.setText(prop.getProperty("ssid"));
                zi2.setText(prop.getProperty("szi"));
                ora2.setText(prop.getProperty("sorai"));
                orasf2.setText(prop.getProperty("sorasf"));
                minut2.setText(prop.getProperty("sminutsf"));

            }
        });

        InterfataAdmin.getLang2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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

                view.setText(frr.getProperty("vizualizare"));
                update.setText(frr.getProperty("schimba"));
                filtrare.setText(frr.getProperty("filtrare"));
                cautare.setText(frr.getProperty("cautare"));
                statistici.setText(frr.getProperty("statistici"));

                addProgram.setText(frr.getProperty("adaugap"));
                deleteProg.setText(frr.getProperty("stergep"));
                viewProg.setText(frr.getProperty("vizualizarep"));
                viewProgramari.setText(frr.getProperty("vizualizareprogramari"));

                luna.setText(frr.getProperty("luna"));
                zi.setText(frr.getProperty("zi"));
                ora.setText(frr.getProperty("orai"));
                orasf.setText(frr.getProperty("orasf"));
                minut.setText(frr.getProperty("minutsf"));

                luna2.setText(frr.getProperty("ssid"));
                zi2.setText(frr.getProperty("szi"));
                ora2.setText(frr.getProperty("sorai"));
                orasf2.setText(frr.getProperty("sorasf"));
                minut2.setText(frr.getProperty("sminutsf"));

            }
        });

        InterfataAsistent.getLang().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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

                view.setText(roo.getProperty("vizualizare"));
                update.setText(roo.getProperty("schimba"));
                filtrare.setText(roo.getProperty("filtrare"));
                cautare.setText(roo.getProperty("cautare"));
                statistici.setText(roo.getProperty("statistici"));

                addProgram.setText(roo.getProperty("adaugap"));
                deleteProg.setText(roo.getProperty("stergep"));
                viewProg.setText(roo.getProperty("vizualizarep"));
                viewProgramari.setText(roo.getProperty("vizualizareprogramari"));

                luna.setText(roo.getProperty("luna"));
                zi.setText(roo.getProperty("zi"));
                ora.setText(roo.getProperty("orai"));
                orasf.setText(roo.getProperty("orasf"));
                minut.setText(roo.getProperty("minutsf"));

                luna2.setText(roo.getProperty("ssid"));
                zi2.setText(roo.getProperty("szi"));
                ora2.setText(roo.getProperty("sorai"));
                orasf2.setText(roo.getProperty("sorasf"));
                minut2.setText(roo.getProperty("sminutsf"));

            }
        });

        InterfataAsistent.getLang1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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

                view.setText(prop.getProperty("vizualizare"));
                update.setText(prop.getProperty("schimba"));
                filtrare.setText(prop.getProperty("filtrare"));
                cautare.setText(prop.getProperty("cautare"));
                statistici.setText(prop.getProperty("statistici"));

                addProgram.setText(prop.getProperty("adaugap"));
                deleteProg.setText(prop.getProperty("stergep"));
                viewProg.setText(prop.getProperty("vizualizarep"));
                viewProgramari.setText(prop.getProperty("vizualizareprogramari"));

                luna.setText(prop.getProperty("luna"));
                zi.setText(prop.getProperty("zi"));
                ora.setText(prop.getProperty("orai"));
                orasf.setText(prop.getProperty("orasf"));
                minut.setText(prop.getProperty("minutsf"));

                luna2.setText(prop.getProperty("ssid"));
                zi2.setText(prop.getProperty("szi"));
                ora2.setText(prop.getProperty("sorai"));
                orasf2.setText(prop.getProperty("sorasf"));
                minut2.setText(prop.getProperty("sminutsf"));

            }
        });

        InterfataAsistent.getLang2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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

                view.setText(frr.getProperty("vizualizare"));
                update.setText(frr.getProperty("schimba"));
                filtrare.setText(frr.getProperty("filtrare"));
                cautare.setText(frr.getProperty("cautare"));
                statistici.setText(frr.getProperty("statistici"));

                addProgram.setText(frr.getProperty("adaugap"));
                deleteProg.setText(frr.getProperty("stergep"));
                viewProg.setText(frr.getProperty("vizualizarep"));
                viewProgramari.setText(frr.getProperty("vizualizareprogramari"));

                luna.setText(frr.getProperty("luna"));
                zi.setText(frr.getProperty("zi"));
                ora.setText(frr.getProperty("orai"));
                orasf.setText(frr.getProperty("orasf"));
                minut.setText(frr.getProperty("minutsf"));

                luna2.setText(frr.getProperty("ssid"));
                zi2.setText(frr.getProperty("szi"));
                ora2.setText(frr.getProperty("sorai"));
                orasf2.setText(frr.getProperty("sorasf"));
                minut2.setText(frr.getProperty("sminutsf"));

            }
        });

        InterfataMedic.getLang().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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

                view.setText(roo.getProperty("vizualizare"));
                update.setText(roo.getProperty("schimba"));
                filtrare.setText(roo.getProperty("filtrare"));
                cautare.setText(roo.getProperty("cautare"));
                statistici.setText(roo.getProperty("statistici"));

                addProgram.setText(roo.getProperty("adaugap"));
                deleteProg.setText(roo.getProperty("stergep"));
                viewProg.setText(roo.getProperty("vizualizarep"));
                viewProgramari.setText(roo.getProperty("vizualizareprogramari"));

                luna.setText(roo.getProperty("luna"));
                zi.setText(roo.getProperty("zi"));
                ora.setText(roo.getProperty("orai"));
                orasf.setText(roo.getProperty("orasf"));
                minut.setText(roo.getProperty("minutsf"));

                luna2.setText(roo.getProperty("ssid"));
                zi2.setText(roo.getProperty("szi"));
                ora2.setText(roo.getProperty("sorai"));
                orasf2.setText(roo.getProperty("sorasf"));
                minut2.setText(roo.getProperty("sminutsf"));

            }
        });

        InterfataMedic.getLang1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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

                view.setText(prop.getProperty("vizualizare"));
                update.setText(prop.getProperty("schimba"));
                filtrare.setText(prop.getProperty("filtrare"));
                cautare.setText(prop.getProperty("cautare"));
                statistici.setText(prop.getProperty("statistici"));

                addProgram.setText(prop.getProperty("adaugap"));
                deleteProg.setText(prop.getProperty("stergep"));
                viewProg.setText(prop.getProperty("vizualizarep"));
                viewProgramari.setText(prop.getProperty("vizualizareprogramari"));

                luna.setText(prop.getProperty("luna"));
                zi.setText(prop.getProperty("zi"));
                ora.setText(prop.getProperty("orai"));
                orasf.setText(prop.getProperty("orasf"));
                minut.setText(prop.getProperty("minutsf"));

                luna2.setText(prop.getProperty("ssid"));
                zi2.setText(prop.getProperty("szi"));
                ora2.setText(prop.getProperty("sorai"));
                orasf2.setText(prop.getProperty("sorasf"));
                minut2.setText(prop.getProperty("sminutsf"));

            }
        });

        InterfataMedic.getLang2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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

                view.setText(frr.getProperty("vizualizare"));
                update.setText(frr.getProperty("schimba"));
                filtrare.setText(frr.getProperty("filtrare"));
                cautare.setText(frr.getProperty("cautare"));
                statistici.setText(frr.getProperty("statistici"));

                addProgram.setText(frr.getProperty("adaugap"));
                deleteProg.setText(frr.getProperty("stergep"));
                viewProg.setText(frr.getProperty("vizualizarep"));
                viewProgramari.setText(frr.getProperty("vizualizareprogramari"));

                luna.setText(frr.getProperty("luna"));
                zi.setText(frr.getProperty("zi"));
                ora.setText(frr.getProperty("orai"));
                orasf.setText(frr.getProperty("orasf"));
                minut.setText(frr.getProperty("minutsf"));

                luna2.setText(frr.getProperty("ssid"));
                zi2.setText(frr.getProperty("szi"));
                ora2.setText(frr.getProperty("sorai"));
                orasf2.setText(frr.getProperty("sorasf"));
                minut2.setText(frr.getProperty("sminutsf"));

            }
        });

    }

    public String[][] getData(ArrayList<Pacient> cont, String legit)
    {
        String [][] data=new String[cont.size()][7];

        int i=0;
        for (Pacient c:cont)
        {
            if(c.getNrLegitimatie().equals(legit)) {
                data[i][0] = c.getNume();
                data[i][1] = c.getPrenume();
                data[i][2] = c.getId();
                data[i][3] = c.getNrLegitimatie();
                data[i][4] = c.getSimptome();
                data[i][5] = c.getDiagnostic();
                data[i][6] = c.getTratament();
                i++;
            }
        }

        return data;
    }

    public void vizual(JButton view, String nrLeg, JPanel login, JTextField user3, JTextField parola3, JTextField rol3, JTextField nume2, JTextField prenume2, JTextField varsta2, JTextField nrLegitim2, PersistentaPacient pacienti){
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ArrayList<Pacient> list = pacienti.viewPacienti();
                String[][] data = (String[][]) getData(list,nrLeg);
                String[] columnNames = {"Nume","Prenume","Id","NrLegitim","Simptome","Diagnostic","Tratament"};
                JTable j = new JTable(data, columnNames);
                JScrollPane sp = new JScrollPane(j);
                sp.setBounds(10, 340, 450, 300);
                login.add(sp);
                j.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        user3.setText((String) j.getValueAt(j.getSelectedRow(),0));
                        parola3.setText((String) j.getValueAt(j.getSelectedRow(),1));
                        rol3.setText((String) j.getValueAt(j.getSelectedRow(),2));
                        nume2.setText((String) j.getValueAt(j.getSelectedRow(),3));
                        prenume2.setText((String) j.getValueAt(j.getSelectedRow(),4));
                        varsta2.setText((String) j.getValueAt(j.getSelectedRow(),5)); //id
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

    public void update1(JButton btn,String legit,JTextField simptome,JTextField diagnostic,JTextField tratament,JTextField nume3,JTextField prenume3,JTextField nrLegitimatie3,PersistentaPacient pacienti){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*ArrayList<Pacient> list = pacienti.viewPacienti();

                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getNrLegitimatie().equals(legit) && list.get(i).getNrLegitimatie().equals(nrLegitimatie3.getText()) && list.get(i).getNume().equals(nume3.getText()) && list.get(i).getPrenume().equals(prenume3.getText())) {
                        list.get(i).setDiagnostic(diagnostic.getText());
                        list.get(i).setSimptome(simptome.getText());
                        list.get(i).setTratament(tratament.getText());
                    }
                }*/
                pacienti.updatePacientDoc(nrLegitimatie3.getText(),diagnostic.getText(),simptome.getText(),tratament.getText());

            }
        });
    }

    public ArrayList<Pacient> filtrare(JButton btn, String legit, JPanel login, JTextField crit, JComboBox facenameCombo, PersistentaPacient pacienti){
        ArrayList<Pacient> res = new ArrayList<>();
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean ok = false;
                String[] columnNames = {"Nume","Prenume","Id","NrLegitim","Simptome","Diagnostic","Tratament"};
                JScrollPane sp = null;
                String selectedString = (String) facenameCombo.getSelectedItem();
                int i1=0;
                ArrayList<Pacient> list = pacienti.viewPacienti();
                int si = res.size();
                for(int i=si-1;i>=0;i--){
                    res.remove(i);
                }
                for(Pacient p:list){
                    if(selectedString.equals("Diagnostic") && p.getNrLegitimatie().equals(legit)){
                        if(p.getDiagnostic().equals(crit.getText())) {
                            ok = true;
                            res.add(p);
                        }
                    }
                    else if(selectedString.equals("Tratament") && p.getNrLegitimatie().equals(legit)){
                        if(p.getTratament().equals(crit.getText())) {
                            ok = true;
                            res.add(p);
                        }
                    }
                }
                if(ok == false){
                    JOptionPane.showMessageDialog(null,
                            "Nu sunt pacienti cu datele cerute",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
                else{
                    String [][] data=new String[res.size()][7];
                    for(Pacient p:res){

                        data[i1][0]=p.getNume();
                        data[i1][1]=p.getPrenume();
                        data[i1][2]=p.getId();
                        data[i1][3]=p.getNrLegitimatie();
                        data[i1][4]=p.getSimptome();
                        data[i1][5]=p.getDiagnostic();
                        data[i1][6]=p.getTratament();
                        i1++;
                    }
                    JTable j = new JTable(data, columnNames);
                    sp = new JScrollPane(j);
                    sp.setBounds(930, 340, 450, 300);
                    login.add(sp);

                }
            }

        });

        return res;
    }

    public void cauta(JButton btn,String legit,JPanel login,JTextField nume,JTextField prenume,PersistentaPacient pacienti){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] columnNames = {"Nume","Prenume","Varsta","NrLegitim","Simptome","Diagnostic","Tratament"};
                ArrayList<Pacient> list = pacienti.viewPacienti();
                boolean ok =false;
                JScrollPane sp = null;
                int i=0;
                String [][] data=new String[2][7];
                for (Pacient p:list) {
                    if (p.getNume().equals(nume.getText()) && p.getPrenume().equals(prenume.getText()) && p.getNrLegitimatie().equals(legit)) {
                        ok = true;
                        data[i][0]=p.getNume();
                        data[i][1]=p.getPrenume();
                        data[i][2]=p.getId();
                        data[i][3]=p.getNrLegitimatie();
                        data[i][4]=p.getSimptome();
                        data[i][5]=p.getDiagnostic();
                        data[i][6]=p.getTratament();
                        i++;
                    }
                }
                JTable j = new JTable(data, columnNames);
                sp = new JScrollPane(j);
                if(ok == true){
                    sp.setBounds(470, 340, 450, 300);
                    login.add(sp);

                }
                else{
                    JOptionPane.showMessageDialog(null,
                            "Pacientul cautat nu se afla in baza de date",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public void statistic(JButton btn,String legit,JComboBox facenameCombo,PersistentaPacient pacienti){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultPieDataset pieDataset = stat.creareStatistica(legit,facenameCombo,pacienti);
                JFreeChart chart = ChartFactory.createPieChart("Statistica diagnostic",pieDataset,true,true,true);
                ChartFrame frame = new ChartFrame("Statistica",chart);
                frame.setVisible(true);
                frame.setSize(450,500);

            }
        });
    }

    public String[][] getData1(ArrayList<Program> cont,String nrLegit)
    {
        String [][] data=new String[cont.size()][6];

        int i=0;
        for (Program c:cont)
        {
            if(c.getNrLegitimatie().equals(nrLegit)) {
                data[i][0] = String.valueOf(c.getData().getMonth());
                data[i][1] = String.valueOf(c.getData().getDay());
                data[i][2] = String.valueOf(c.getData().getHours());
                data[i][3] = String.valueOf(c.getData().getHours() + 1);
                data[i][4] = c.getNume();
                data[i][5] = c.getPrenume();
                i++;
            }
        }

        return data;
    }

    public void vizualProgramConsult(JButton view,String nrLegit,PersistentaProgram programari){
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame = new JFrame("Program consultatii");
                frame.setSize(600,300);
                ArrayList<Program> list = programari.viewProgramari();
                String[][] data = (String[][]) getData1(list,nrLegit);
                String[] columnNames = {"Luna","Zi","Ora inceput","Ora sfarsit","Nume Pacient","Prenume Pacient"};
                JTable j = new JTable(data, columnNames);
                JScrollPane sp = new JScrollPane(j);
                sp.setBounds(590, 190, 750, 110);
                frame.add(sp);
                frame.setVisible(true);

            }
        });

    }

    public void addProgramDoctor(JButton ad, JTextField luna, JTextField zi, JTextField ora, JTextField orasf, JTextField minutsf, String nrLegitimatie, PersistentaContUtilizator conturi,PersistentaProgramDoc doc){
        ad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean ok = true;
                boolean ok1 = true;

                for(ContUtilizator c:conturi.viewConturi())
                    if (conturi.getRol(c.getNrLegitimatie()).equals("medic") && c.getNrLegitimatie().equals(nrLegitimatie)) {
                        ok = false;
                        for (ProgramDoc p : doc.viewProgramDoc())
                            if (p.getData().getMonth() == Integer.parseInt(luna.getText()) && p.getData().getDate() == Integer.parseInt(zi.getText()) && p.getNrLegitimatie().equals(nrLegitimatie) ) {
                                JOptionPane.showMessageDialog(null,
                                        "Exista deja o planificare pentru ziua respectiva",
                                        "Error",
                                        JOptionPane.ERROR_MESSAGE);
                                ok1 = false;
                            }
                        if(ok1 == true){
                            Timestamp dat = new Timestamp(10);
                            dat.setYear(120);
                            dat.setMonth(Integer.parseInt(luna.getText()));
                            dat.setDate(Integer.parseInt(zi.getText()));
                            dat.setHours(Integer.parseInt(ora.getText()));
                            doc.addProgramDoc(new ProgramDoc(dat,(Integer.parseInt(orasf.getText())), Integer.parseInt(minutsf.getText()), nrLegitimatie));
                            break;
                        }
                    }

                if (ok == true) {
                    JOptionPane.showMessageDialog(null,
                            "Nu exista un medic cu nr de legitimatie dorit",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

            }
        });

    }

    public String[][] getData2(ArrayList<ProgramDoc> cont,String nrLegit)
    {
        String [][] data=new String[cont.size()][6];

        int i=0;
        for (ProgramDoc c:cont)
        {
            if(c.getNrLegitimatie().equals(nrLegit)) {
                data[i][0] = String.valueOf(c.getData().getMonth());
                data[i][1] = String.valueOf(c.getData().getDate());
                data[i][2] = String.valueOf(c.getData().getHours());
                data[i][3] = String.valueOf(c.getOraSfarist());
                data[i][4] = c.getNrLegitimatie();
                data[i][5] = String.valueOf(c.getId_prog());
                i++;
            }
        }

        return data;
    }

    public void vizualProgramDoctor(JButton view, String legit, JPanel login, JTextField user3, JTextField parola3, JTextField rol3, JTextField nume2, JTextField prenume2, String varsta2,PersistentaProgramDoc program){
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<ProgramDoc> list = program.viewProgramDoc();
                String[][] data = (String[][]) getData2(list,legit);
                String[] columnNames = {"Luna","Zi","Ora Inceput","Ora Sfarsit","NrLegit","IdProgram"};
                JTable j = new JTable(data, columnNames);
                JScrollPane sp = new JScrollPane(j);
                sp.setBounds(590, 190, 650, 110);
                login.add(sp);
                j.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        user3.setText((String) j.getValueAt(j.getSelectedRow(),5));
                        parola3.setText((String) j.getValueAt(j.getSelectedRow(),1));
                        rol3.setText((String) j.getValueAt(j.getSelectedRow(),2));
                        nume2.setText((String) j.getValueAt(j.getSelectedRow(),3));
                        prenume2.setText((String) j.getValueAt(j.getSelectedRow(),4));
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

    public void deleteProgramDoctor(JButton btn,JTextField nrLegitim3,JTextField nume3,JTextField ora3,PersistentaProgramDoc doc,JTextField id){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Timestamp dat = new Timestamp(10);
               // ArrayList<ProgramDoc> list = doc.viewProgramDoc();
                //for (int i = 0; i < list.size(); i++) {
                   // if (list.get(i).getData().getMonth() == Integer.parseInt(nrLegitim3.getText()) && list.get(i).getData().getDate() == Integer.parseInt(nume3.getText()))
                        doc.deleteProgramDoc(Integer.parseInt(nrLegitim3.getText()));
                //}

            }
        });
    }



}