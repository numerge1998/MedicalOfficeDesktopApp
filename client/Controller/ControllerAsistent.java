package client;

import com.orsoncharts.util.json.JSONObject;
//import model.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import server.*;

import javax.swing.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Properties;

public class ControllerAsistent {

    public void limba(JLabel nume, JLabel prenume, JLabel id, JLabel nrLegitimatie, JLabel simptome, JLabel diagnostic, JLabel tratament, JLabel nume2, JLabel prenume2, JLabel varsta2, JLabel nrLegitimatie2, JLabel simptome2, JLabel diagnostic2, JLabel tratament2, JLabel id2, JButton add, JButton delete, JButton view, JButton update, JButton filtrare, JButton cautare, JButton salvare, JButton addProgram, JButton viewProg, JButton deleteProg, JLabel luna, JLabel zi, JLabel ora, JLabel nume4, JLabel prenume4, JLabel nrlegitim4, JLabel id1, JLabel luna7, JLabel zi7, JLabel ora7, JLabel nume7, JLabel prenume7, JLabel nrlegitim7, JLabel id7, Properties prop, Properties roo, Properties frr){
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
            id2.setText(roo.getProperty("sid"));

            add.setText(roo.getProperty("adauga"));
            delete.setText(roo.getProperty("sterge"));
            update.setText(roo.getProperty("schimba"));
            view.setText(roo.getProperty("vizualizare"));
            filtrare.setText(roo.getProperty("filtrare"));
            cautare.setText(roo.getProperty("cautare"));
            salvare.setText(roo.getProperty("salvare"));

            addProgram.setText(roo.getProperty("adaugap"));
            deleteProg.setText(roo.getProperty("stergep"));
            viewProg.setText(roo.getProperty("vizualizarep"));

            luna.setText(roo.getProperty("luna"));
            zi.setText(roo.getProperty("zi"));
            ora.setText(roo.getProperty("orai"));
            nume4.setText(roo.getProperty("numep"));
            prenume4.setText(roo.getProperty("prenumep"));
            nrlegitim4.setText(roo.getProperty("legitimatiep"));
            id1.setText(roo.getProperty("idp"));

            luna7.setText(roo.getProperty("sluna"));
            zi7.setText(roo.getProperty("szi"));
            ora7.setText(roo.getProperty("sorai"));
            nume7.setText(roo.getProperty("snumep"));
            prenume7.setText(roo.getProperty("sprenumep"));
            nrlegitim7.setText(roo.getProperty("slegitimatiep"));
            id7.setText(roo.getProperty("sidp"));

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
            id2.setText(prop.getProperty("sid"));

            add.setText(prop.getProperty("adauga"));
            delete.setText(prop.getProperty("sterge"));
            update.setText(prop.getProperty("schimba"));
            view.setText(prop.getProperty("vizualizare"));
            filtrare.setText(prop.getProperty("filtrare"));
            cautare.setText(prop.getProperty("cautare"));
            salvare.setText(prop.getProperty("salvare"));

            addProgram.setText(prop.getProperty("adaugap"));
            deleteProg.setText(prop.getProperty("stergep"));
            viewProg.setText(prop.getProperty("vizualizarep"));

            luna.setText(prop.getProperty("luna"));
            zi.setText(prop.getProperty("zi"));
            ora.setText(prop.getProperty("orai"));
            nume4.setText(prop.getProperty("numep"));
            prenume4.setText(prop.getProperty("prenumep"));
            nrlegitim4.setText(prop.getProperty("legitimatiep"));
            id1.setText(prop.getProperty("idp"));

            luna7.setText(prop.getProperty("sluna"));
            zi7.setText(prop.getProperty("szi"));
            ora7.setText(prop.getProperty("sorai"));
            nume7.setText(prop.getProperty("snumep"));
            prenume7.setText(prop.getProperty("sprenumep"));
            nrlegitim7.setText(prop.getProperty("slegitimatiep"));
            id7.setText(prop.getProperty("sidp"));

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
            id2.setText(frr.getProperty("sid"));

            add.setText(frr.getProperty("adauga"));
            delete.setText(frr.getProperty("sterge"));
            update.setText(frr.getProperty("schimba"));
            view.setText(frr.getProperty("vizualizare"));
            filtrare.setText(frr.getProperty("filtrare"));
            cautare.setText(frr.getProperty("cautare"));
            salvare.setText(frr.getProperty("salvare"));

            addProgram.setText(frr.getProperty("adaugap"));
            deleteProg.setText(frr.getProperty("stergep"));
            viewProg.setText(frr.getProperty("vizualizarep"));

            luna.setText(frr.getProperty("luna"));
            zi.setText(frr.getProperty("zi"));
            ora.setText(frr.getProperty("orai"));
            nume4.setText(frr.getProperty("numep"));
            prenume4.setText(frr.getProperty("prenumep"));
            nrlegitim4.setText(frr.getProperty("legitimatiep"));
            id1.setText(frr.getProperty("idp"));

            luna7.setText(frr.getProperty("sluna"));
            zi7.setText(frr.getProperty("szi"));
            ora7.setText(frr.getProperty("sorai"));
            nume7.setText(frr.getProperty("snumep"));
            prenume7.setText(frr.getProperty("sprenumep"));
            nrlegitim7.setText(frr.getProperty("slegitimatiep"));
            id7.setText(frr.getProperty("sidp"));

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
                id2.setText(roo.getProperty("sid"));

                add.setText(roo.getProperty("adauga"));
                delete.setText(roo.getProperty("sterge"));
                update.setText(roo.getProperty("schimba"));
                view.setText(roo.getProperty("vizualizare"));
                filtrare.setText(roo.getProperty("filtrare"));
                cautare.setText(roo.getProperty("cautare"));
                salvare.setText(roo.getProperty("salvare"));

                addProgram.setText(roo.getProperty("adaugap"));
                deleteProg.setText(roo.getProperty("stergep"));
                viewProg.setText(roo.getProperty("vizualizarep"));

                luna.setText(roo.getProperty("luna"));
                zi.setText(roo.getProperty("zi"));
                ora.setText(roo.getProperty("orai"));
                nume4.setText(roo.getProperty("numep"));
                prenume4.setText(roo.getProperty("prenumep"));
                nrlegitim4.setText(roo.getProperty("legitimatiep"));
                id1.setText(roo.getProperty("idp"));

                luna7.setText(roo.getProperty("sluna"));
                zi7.setText(roo.getProperty("szi"));
                ora7.setText(roo.getProperty("sorai"));
                nume7.setText(roo.getProperty("snumep"));
                prenume7.setText(roo.getProperty("sprenumep"));
                nrlegitim7.setText(roo.getProperty("slegitimatiep"));
                id7.setText(roo.getProperty("sidp"));

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
                id2.setText(prop.getProperty("sid"));

                add.setText(prop.getProperty("adauga"));
                delete.setText(prop.getProperty("sterge"));
                update.setText(prop.getProperty("schimba"));
                view.setText(prop.getProperty("vizualizare"));
                filtrare.setText(prop.getProperty("filtrare"));
                cautare.setText(prop.getProperty("cautare"));
                salvare.setText(prop.getProperty("salvare"));

                addProgram.setText(prop.getProperty("adaugap"));
                deleteProg.setText(prop.getProperty("stergep"));
                viewProg.setText(prop.getProperty("vizualizarep"));

                luna.setText(prop.getProperty("luna"));
                zi.setText(prop.getProperty("zi"));
                ora.setText(prop.getProperty("orai"));
                nume4.setText(prop.getProperty("numep"));
                prenume4.setText(prop.getProperty("prenumep"));
                nrlegitim4.setText(prop.getProperty("legitimatiep"));
                id1.setText(prop.getProperty("idp"));

                luna7.setText(prop.getProperty("sluna"));
                zi7.setText(prop.getProperty("szi"));
                ora7.setText(prop.getProperty("sorai"));
                nume7.setText(prop.getProperty("snumep"));
                prenume7.setText(prop.getProperty("sprenumep"));
                nrlegitim7.setText(prop.getProperty("slegitimatiep"));
                id7.setText(prop.getProperty("sidp"));

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
                id2.setText(frr.getProperty("sid"));

                add.setText(frr.getProperty("adauga"));
                delete.setText(frr.getProperty("sterge"));
                update.setText(frr.getProperty("schimba"));
                view.setText(frr.getProperty("vizualizare"));
                filtrare.setText(frr.getProperty("filtrare"));
                cautare.setText(frr.getProperty("cautare"));
                salvare.setText(frr.getProperty("salvare"));

                addProgram.setText(frr.getProperty("adaugap"));
                deleteProg.setText(frr.getProperty("stergep"));
                viewProg.setText(frr.getProperty("vizualizarep"));

                luna.setText(frr.getProperty("luna"));
                zi.setText(frr.getProperty("zi"));
                ora.setText(frr.getProperty("orai"));
                nume4.setText(frr.getProperty("numep"));
                prenume4.setText(frr.getProperty("prenumep"));
                nrlegitim4.setText(frr.getProperty("legitimatiep"));
                id1.setText(frr.getProperty("idp"));

                luna7.setText(frr.getProperty("sluna"));
                zi7.setText(frr.getProperty("szi"));
                ora7.setText(frr.getProperty("sorai"));
                nume7.setText(frr.getProperty("snumep"));
                prenume7.setText(frr.getProperty("sprenumep"));
                nrlegitim7.setText(frr.getProperty("slegitimatiep"));
                id7.setText(frr.getProperty("sidp"));

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
                id2.setText(roo.getProperty("sid"));

                add.setText(roo.getProperty("adauga"));
                delete.setText(roo.getProperty("sterge"));
                update.setText(roo.getProperty("schimba"));
                view.setText(roo.getProperty("vizualizare"));
                filtrare.setText(roo.getProperty("filtrare"));
                cautare.setText(roo.getProperty("cautare"));
                salvare.setText(roo.getProperty("salvare"));

                addProgram.setText(roo.getProperty("adaugap"));
                deleteProg.setText(roo.getProperty("stergep"));
                viewProg.setText(roo.getProperty("vizualizarep"));

                luna.setText(roo.getProperty("luna"));
                zi.setText(roo.getProperty("zi"));
                ora.setText(roo.getProperty("orai"));
                nume4.setText(roo.getProperty("numep"));
                prenume4.setText(roo.getProperty("prenumep"));
                nrlegitim4.setText(roo.getProperty("legitimatiep"));
                id1.setText(roo.getProperty("idp"));

                luna7.setText(roo.getProperty("sluna"));
                zi7.setText(roo.getProperty("szi"));
                ora7.setText(roo.getProperty("sorai"));
                nume7.setText(roo.getProperty("snumep"));
                prenume7.setText(roo.getProperty("sprenumep"));
                nrlegitim7.setText(roo.getProperty("slegitimatiep"));
                id7.setText(roo.getProperty("sidp"));

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
                id2.setText(prop.getProperty("sid"));

                add.setText(prop.getProperty("adauga"));
                delete.setText(prop.getProperty("sterge"));
                update.setText(prop.getProperty("schimba"));
                view.setText(prop.getProperty("vizualizare"));
                filtrare.setText(prop.getProperty("filtrare"));
                cautare.setText(prop.getProperty("cautare"));
                salvare.setText(prop.getProperty("salvare"));

                addProgram.setText(prop.getProperty("adaugap"));
                deleteProg.setText(prop.getProperty("stergep"));
                viewProg.setText(prop.getProperty("vizualizarep"));

                luna.setText(prop.getProperty("luna"));
                zi.setText(prop.getProperty("zi"));
                ora.setText(prop.getProperty("orai"));
                nume4.setText(prop.getProperty("numep"));
                prenume4.setText(prop.getProperty("prenumep"));
                nrlegitim4.setText(prop.getProperty("legitimatiep"));
                id1.setText(prop.getProperty("idp"));

                luna7.setText(prop.getProperty("sluna"));
                zi7.setText(prop.getProperty("szi"));
                ora7.setText(prop.getProperty("sorai"));
                nume7.setText(prop.getProperty("snumep"));
                prenume7.setText(prop.getProperty("sprenumep"));
                nrlegitim7.setText(prop.getProperty("slegitimatiep"));
                id7.setText(prop.getProperty("sidp"));

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
                id2.setText(frr.getProperty("sid"));

                add.setText(frr.getProperty("adauga"));
                delete.setText(frr.getProperty("sterge"));
                update.setText(frr.getProperty("schimba"));
                view.setText(frr.getProperty("vizualizare"));
                filtrare.setText(frr.getProperty("filtrare"));
                cautare.setText(frr.getProperty("cautare"));
                salvare.setText(frr.getProperty("salvare"));

                addProgram.setText(frr.getProperty("adaugap"));
                deleteProg.setText(frr.getProperty("stergep"));
                viewProg.setText(frr.getProperty("vizualizarep"));

                luna.setText(frr.getProperty("luna"));
                zi.setText(frr.getProperty("zi"));
                ora.setText(frr.getProperty("orai"));
                nume4.setText(frr.getProperty("numep"));
                prenume4.setText(frr.getProperty("prenumep"));
                nrlegitim4.setText(frr.getProperty("legitimatiep"));
                id1.setText(frr.getProperty("idp"));

                luna7.setText(frr.getProperty("sluna"));
                zi7.setText(frr.getProperty("szi"));
                ora7.setText(frr.getProperty("sorai"));
                nume7.setText(frr.getProperty("snumep"));
                prenume7.setText(frr.getProperty("sprenumep"));
                nrlegitim7.setText(frr.getProperty("slegitimatiep"));
                id7.setText(frr.getProperty("sidp"));

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
                id2.setText(roo.getProperty("sid"));

                add.setText(roo.getProperty("adauga"));
                delete.setText(roo.getProperty("sterge"));
                update.setText(roo.getProperty("schimba"));
                view.setText(roo.getProperty("vizualizare"));
                filtrare.setText(roo.getProperty("filtrare"));
                cautare.setText(roo.getProperty("cautare"));
                salvare.setText(roo.getProperty("salvare"));

                addProgram.setText(roo.getProperty("adaugap"));
                deleteProg.setText(roo.getProperty("stergep"));
                viewProg.setText(roo.getProperty("vizualizarep"));

                luna.setText(roo.getProperty("luna"));
                zi.setText(roo.getProperty("zi"));
                ora.setText(roo.getProperty("orai"));
                nume4.setText(roo.getProperty("numep"));
                prenume4.setText(roo.getProperty("prenumep"));
                nrlegitim4.setText(roo.getProperty("legitimatiep"));
                id1.setText(roo.getProperty("idp"));

                luna7.setText(roo.getProperty("sluna"));
                zi7.setText(roo.getProperty("szi"));
                ora7.setText(roo.getProperty("sorai"));
                nume7.setText(roo.getProperty("snumep"));
                prenume7.setText(roo.getProperty("sprenumep"));
                nrlegitim7.setText(roo.getProperty("slegitimatiep"));
                id7.setText(roo.getProperty("sidp"));

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
                id2.setText(prop.getProperty("sid"));

                add.setText(prop.getProperty("adauga"));
                delete.setText(prop.getProperty("sterge"));
                update.setText(prop.getProperty("schimba"));
                view.setText(prop.getProperty("vizualizare"));
                filtrare.setText(prop.getProperty("filtrare"));
                cautare.setText(prop.getProperty("cautare"));
                salvare.setText(prop.getProperty("salvare"));

                addProgram.setText(prop.getProperty("adaugap"));
                deleteProg.setText(prop.getProperty("stergep"));
                viewProg.setText(prop.getProperty("vizualizarep"));

                luna.setText(prop.getProperty("luna"));
                zi.setText(prop.getProperty("zi"));
                ora.setText(prop.getProperty("orai"));
                nume4.setText(prop.getProperty("numep"));
                prenume4.setText(prop.getProperty("prenumep"));
                nrlegitim4.setText(prop.getProperty("legitimatiep"));
                id1.setText(prop.getProperty("idp"));

                luna7.setText(prop.getProperty("sluna"));
                zi7.setText(prop.getProperty("szi"));
                ora7.setText(prop.getProperty("sorai"));
                nume7.setText(prop.getProperty("snumep"));
                prenume7.setText(prop.getProperty("sprenumep"));
                nrlegitim7.setText(prop.getProperty("slegitimatiep"));
                id7.setText(prop.getProperty("sidp"));

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
                id2.setText(frr.getProperty("sid"));

                add.setText(frr.getProperty("adauga"));
                delete.setText(frr.getProperty("sterge"));
                update.setText(frr.getProperty("schimba"));
                view.setText(frr.getProperty("vizualizare"));
                filtrare.setText(frr.getProperty("filtrare"));
                cautare.setText(frr.getProperty("cautare"));
                salvare.setText(frr.getProperty("salvare"));

                addProgram.setText(frr.getProperty("adaugap"));
                deleteProg.setText(frr.getProperty("stergep"));
                viewProg.setText(frr.getProperty("vizualizarep"));

                luna.setText(frr.getProperty("luna"));
                zi.setText(frr.getProperty("zi"));
                ora.setText(frr.getProperty("orai"));
                nume4.setText(frr.getProperty("numep"));
                prenume4.setText(frr.getProperty("prenumep"));
                nrlegitim4.setText(frr.getProperty("legitimatiep"));
                id1.setText(frr.getProperty("idp"));

                luna7.setText(frr.getProperty("sluna"));
                zi7.setText(frr.getProperty("szi"));
                ora7.setText(frr.getProperty("sorai"));
                nume7.setText(frr.getProperty("snumep"));
                prenume7.setText(frr.getProperty("sprenumep"));
                nrlegitim7.setText(frr.getProperty("slegitimatiep"));
                id7.setText(frr.getProperty("sidp"));

            }
        });
}

    public void add1(JButton ad, JTextField nume, JTextField prenume, JTextField varsta, JTextField nrLegitimatie, JTextField simptome, JTextField diagnostic, JTextField tratament, PersistentaPacient pacieti, PersistentaContUtilizator conturi){
        ad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean ok = true;
                int idBun = 0;

                for(int i = 1;i<=pacieti.viewPacienti().size()+1;i++) {
                    boolean ok2 = true;
                    for (Pacient p : pacieti.viewPacienti())
                        if(Integer.parseInt(p.getId()) == i)
                            ok2 = false;
                    if(ok2 == true){
                        idBun = i;
                        break;
                    }
                }

                for (ContUtilizator c : conturi.viewConturi())
                    if (conturi.getRol(c.getNrLegitimatie()).equals("medic") && c.getNrLegitimatie().equals(nrLegitimatie.getText())) {
                        pacieti.addPacient(new Pacient(String.valueOf(idBun), nume.getText(), prenume.getText(), simptome.getText(), diagnostic.getText(), tratament.getText(), nrLegitimatie.getText()));
                        ok = false;
                        break;
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

    public String[][] getData(ArrayList<Pacient> cont)
    {
        String [][] data=new String[cont.size()][7];

        int i=0;
        for (Pacient c:cont)
        {
            data[i][0]=c.getNume();
            data[i][1]=c.getPrenume();
            data[i][2]=c.getNrLegitimatie();
            data[i][3]=c.getSimptome();
            data[i][4]=c.getDiagnostic();
            data[i][5]=c.getTratament();
            data[i][6]=c.getId();
            i++;
        }

        return data;
    }

    public void vizual(JButton view, JPanel login,JTextField user3,JTextField parola3,JTextField rol3,JTextField nume2, JTextField prenume2, JTextField varsta2, JTextField nrLegitim2,JTextField id,PersistentaPacient pacienti){
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Pacient> list = pacienti.viewPacienti();
                String[][] data = (String[][]) getData(list);
                String[] columnNames = {"Nume","Prenume","NrLegitim","Simptome","Diagnostic","Tratament","Id"};
                JTable j = new JTable(data, columnNames);
                JScrollPane sp = new JScrollPane(j);
                sp.setBounds(10, 370, 480, 300);
                login.add(sp);
                j.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        user3.setText((String) j.getValueAt(j.getSelectedRow(),0));
                        parola3.setText((String) j.getValueAt(j.getSelectedRow(),1));
                        rol3.setText((String) j.getValueAt(j.getSelectedRow(),2));
                        nume2.setText((String) j.getValueAt(j.getSelectedRow(),2));
                        prenume2.setText((String) j.getValueAt(j.getSelectedRow(),3));
                        varsta2.setText((String) j.getValueAt(j.getSelectedRow(),4));
                        nrLegitim2.setText((String) j.getValueAt(j.getSelectedRow(),5));
                        id.setText((String) j.getValueAt(j.getSelectedRow(),6));
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

    public void delete1(JButton btn, JTextField id, PersistentaPacient pacienti, PersistentaProgram programari){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Pacient> list = pacienti.viewPacienti();
                ArrayList<Program> list2 = programari.viewProgramari();
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getId().equals(id.getText())) {
                        for (int j = list2.size() - 1; j >=0 ; j--) {
                            if (list2.get(j).getNrLegitimatie().equals(list.get(i).getNrLegitimatie()) && list2.get(j).getId().equals(list.get(i).getId()))
                                ;//remove programari j
                        }
                        pacienti.deletePacient(list.get(i).getId());
                    }
                }
            }
        });
    }


    public void update1(JButton btn,JTextField nume2,JTextField prenume2,JTextField nrLegitimatie2,JTextField id3,PersistentaPacient pacienti, PersistentaProgram programari, PersistentaContUtilizator conturi){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(conturi.getRol(nrLegitimatie2.getText()).equals("medic"))
                    pacienti.updatePacient(id3.getText(),nume2.getText(),prenume2.getText(),nrLegitimatie2.getText());
                    else{
                    JOptionPane.showMessageDialog(null,
                            "Nu exista doctor cu numarul de legitimatie dorit",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public void cauta(JButton btn,JPanel login,JTextField nume,JTextField prenume,PersistentaPacient pacienti){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] columnNames = {"Nume","Prenume","NrLegitim","Simptome","Diagnostic","Tratament","Id"};
                ArrayList<Pacient> list = pacienti.viewPacienti();
                boolean ok =false;
                JScrollPane sp = null;
                int i=0;
                String [][] data=new String[4][7];
                for (Pacient p:list) {
                    if (p.getNume().equals(nume.getText()) && p.getPrenume().equals(prenume.getText())) {
                        ok = true;

                        data[i][0]=p.getNume();
                        data[i][1]=p.getPrenume();
                        data[i][2]=p.getNrLegitimatie();
                        data[i][3]=p.getSimptome();
                        data[i][4]=p.getDiagnostic();
                        data[i][5]=p.getTratament();
                        data[i][6]=p.getId();
                        i++;
                    }
                }
                JTable j = new JTable(data, columnNames);
                sp = new JScrollPane(j);
                if(ok == true){
                    sp.setBounds(500, 370, 480, 300);
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

    public ArrayList<Pacient> filtrare(JButton btn,JPanel login,JTextField crit,JComboBox facenameCombo,PersistentaPacient pacienti){
        ArrayList<Pacient> res = new ArrayList<>();
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean ok = false;
                String[] columnNames = {"Nume","Prenume","NrLegitim","Simptome","Diagnostic","Tratament","Id"};
                JScrollPane sp = null;
                String selectedString = (String) facenameCombo.getSelectedItem();
                int i1=0;
                ArrayList<Pacient> list = pacienti.viewPacienti();
                int si = res.size();
                for(int i=si-1;i>=0;i--){
                    res.remove(i);
                }
                for(Pacient p:list){
                    if(selectedString.equals("Medic")){
                        if(p.getNrLegitimatie().equals(crit.getText())) {
                            res.add(p);
                            ok = true;
                        }
                    }
                    else if(selectedString.equals("Diagnostic")){
                        if(p.getDiagnostic().equals(crit.getText())) {
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
                        data[i1][2]=p.getNrLegitimatie();
                        data[i1][3]=p.getSimptome();
                        data[i1][4]=p.getDiagnostic();
                        data[i1][5]=p.getTratament();
                        data[i1][6]=p.getId();
                        i1++;
                    }
                    JTable j = new JTable(data, columnNames);
                    sp = new JScrollPane(j);
                    sp.setBounds(1000, 370, 480, 300);
                    login.add(sp);

                }
            }

        });

        return res;
    }

    public void salvare(JButton statistici,ArrayList<Pacient> list) {
        statistici.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newLine = "\n";
                String header = "Nume,Prenume,NrLegitim,Simptome,Diagnostic,Tratament,Id";
                try {
                    FileWriter fileWriter = new FileWriter("filtrati.csv");
                    FileWriter fileWriterJson = new FileWriter("filtrati.json");
                    fileWriter.append(header);
                    for (Pacient p : list) {
                        JSONObject j = new JSONObject();
                        j.put("Nume",p.getNume());
                        j.put("Prenume",p.getPrenume());
                        j.put("Nr Legitimatie",p.getNrLegitimatie());
                        j.put("Simptome",p.getSimptome());
                        j.put("Diagnostic",p.getDiagnostic());
                        j.put("Tratament",p.getTratament());
                        j.put("Id",p.getId());

                        fileWriterJson.append(j.toJSONString());
                        fileWriterJson.append("\n");

                        fileWriter.append("\n");
                        fileWriter.append(p.toString1());

                    }
                    fileWriter.flush();
                    fileWriterJson.flush();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                try {

                    DocumentBuilderFactory dFact = DocumentBuilderFactory.newInstance();
                    DocumentBuilder build = dFact.newDocumentBuilder();
                    Document doc = build.newDocument();

                    Element root = doc.createElement("Pacienti_Filtrati");
                    doc.appendChild(root);



                    int ind = 0;

                    for (Pacient dtl : list) {
                        ind++;
                        Element Details = doc.createElement("Pacient" + String.valueOf(ind));
                        root.appendChild(Details);

                        Element name = doc.createElement("Nume");
                        name.appendChild(doc.createTextNode(String.valueOf(dtl
                                .getNume())));
                        Details.appendChild(name);

                        Element prenume = doc.createElement("Prenume");
                        prenume.appendChild(doc.createTextNode(String.valueOf(dtl.getPrenume())));
                        Details.appendChild(prenume);

                        Element nrLegit = doc.createElement("Numar_Legitimatie");
                        nrLegit.appendChild(doc.createTextNode(String.valueOf(dtl.getNrLegitimatie())));
                        Details.appendChild(nrLegit);

                        Element simptome = doc.createElement("Simptome");
                        simptome.appendChild(doc.createTextNode(String.valueOf(dtl.getSimptome())));
                        Details.appendChild(simptome);

                        Element diagnostic = doc.createElement("Diagnostic");
                        diagnostic.appendChild(doc.createTextNode(String.valueOf(dtl.getDiagnostic())));
                        Details.appendChild(diagnostic);

                        Element tratament = doc.createElement("Tratament");
                        tratament.appendChild(doc.createTextNode(String.valueOf(dtl.getTratament())));
                        Details.appendChild(tratament);

                        Element id = doc.createElement("Id");
                        id.appendChild(doc.createTextNode(String.valueOf(dtl.getId())));
                        Details.appendChild(id);


                    }

                    // Save the document
                    TransformerFactory tranFactory = TransformerFactory.newInstance();
                    Transformer aTransformer = tranFactory.newTransformer();

                    // format the XML
                    aTransformer.setOutputProperty(OutputKeys.ENCODING, "ISO-8859-1");

                    aTransformer.setOutputProperty(
                            "{http://xml.apache.org/xslt}indent-amount", "4");
                    aTransformer.setOutputProperty(OutputKeys.INDENT, "yes");

                    DOMSource source = new DOMSource(doc);
                    try {
                        // location and name of XML file you can change as per need
                        FileWriter fos = new FileWriter("./filtrati.xml");
                        StreamResult result = new StreamResult(fos);
                        aTransformer.transform(source, result);

                    } catch (IOException es) {

                        es.printStackTrace();
                    }

                } catch (TransformerException ex) {
                    System.out.println("Error outputting document");

                } catch (ParserConfigurationException ex) {
                    System.out.println("Error building document");
                }
            }
        });
    }

    public void addProgram(JButton ad,JTextField luna,JTextField zi,JTextField ora,JTextField nrLegitimatie,JTextField id,PersistentaProgram programari, PersistentaPacient pacienti, PersistentaProgramDoc program, PersistentaContUtilizator conturi){
        ad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean ok = true;
                boolean ok1 = true;
                boolean ok2 = true;
                boolean ok3 = false;

                for(ContUtilizator c:conturi.viewConturi())
                    if (conturi.getRol(c.getNrLegitimatie()).equals("medic") && c.getNrLegitimatie().equals(nrLegitimatie.getText())) {
                        ok = false; // se gaseste medicul dorit
                        for (ProgramDoc p : program.viewProgramDoc())
                            if (p.getData().getMonth() == Integer.parseInt(luna.getText()) && p.getData().getDate() == Integer.parseInt(zi.getText()) && p.getData().getHours()<=Integer.parseInt(ora.getText()) && p.getOraSfarist() > Integer.parseInt(ora.getText())) {
                                for(Program s:programari.viewProgramari())
                                    if(s.getData().getMonth() == Integer.parseInt(luna.getText())&& s.getData().getDate() == Integer.parseInt(zi.getText()) && s.getData().getHours()==Integer.parseInt(ora.getText()) && s.getNrLegitimatie().equals(nrLegitimatie.getText())) {
                                        ok2 = false; //se gaseste o programare in aceeasi data pentru acelai medic
                                        JOptionPane.showMessageDialog(null,
                                                "Exista deja o programare pentru doctorul dorit la acea ora",
                                                "Error",
                                                JOptionPane.ERROR_MESSAGE);
                                    }
                                if(ok2 == true) {
                                    for(Pacient x:pacienti.viewPacienti())
                                        if(x.getId().equals(id.getText()) && x.getNrLegitimatie().equals(nrLegitimatie.getText())) {
                                            Timestamp dat = new Timestamp(10);
                                            dat.setYear(120);
                                            dat.setMonth(Integer.parseInt(luna.getText()));
                                            dat.setHours(Integer.parseInt(ora.getText()));
                                            dat.setDate(Integer.parseInt(zi.getText()));
                                            programari.addProgramare(new Program(dat, x.getNume(), x.getPrenume(), nrLegitimatie.getText(), id.getText()));
                                            ok3 = true; //este id
                                            ok1 = false;//medic
                                            break;
                                        }

                                    break;
                                }
                            }
                    }
                if (ok3 == false) {
                    JOptionPane.showMessageDialog(null,
                            "Nu exista un pacient cu id-ul dorit si numarul de legitimatie dorit",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

                if (ok == true) {
                    JOptionPane.showMessageDialog(null,
                            "Nu exista un medic cu nr de legitimatie dorit",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

                if (ok1 == true && ok2==true && ok3 == true) {
                    JOptionPane.showMessageDialog(null,
                            "Medicul nu va fi la cabinet",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

            }
        });

    }

    public void deleteProgram(JButton btn,JTextField nrLegitim3,JTextField id,PersistentaProgram programare){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ArrayList<Program> list = programare.viewProgramari();
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getNrLegitimatie().equals(nrLegitim3.getText()) && list.get(i).getId().equals(id.getText()))
                        programare.deleteProgramare(id.getText());
                }

            }
        });
    }


    public String[][] getData1(ArrayList<Program> cont)
    {
        String [][] data=new String[cont.size()][7];

        int i=0;
        for (Program c:cont)
        {
            data[i][0]= String.valueOf(c.getData().getMonth());
            data[i][1]= String.valueOf(c.getData().getDate());
            data[i][2]= String.valueOf(c.getData().getHours());
            data[i][3]=c.getNume();
            data[i][4]=c.getPrenume();
            data[i][5]=c.getNrLegitimatie();
            data[i][6]=c.getId();
            i++;
        }

        return data;
    }

    public void vizualProgram(JButton view, JPanel login,JTextField user3,JTextField parola3,JTextField rol3,JTextField nume2, JTextField prenume2, JTextField varsta2,JTextField id,PersistentaProgram programari){
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Program> list = programari.viewProgramari();
                String[][] data = (String[][]) getData1(list);
                String[] columnNames = {"Luna","Zi","Ora","Nume","Prenume","NrLegit","Id"};
                JTable j = new JTable(data, columnNames);
                JScrollPane sp = new JScrollPane(j);
                sp.setBounds(590, 220, 650, 110);
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
                        id.setText((String) j.getValueAt(j.getSelectedRow(),6));
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

}
