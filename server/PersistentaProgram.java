package server;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import java.io.*;
import java.sql.Timestamp;
import java.util.ArrayList;

public class PersistentaProgram extends Persistenta implements Serializable{
    public PersistentaProgram() {

    }

    public boolean addProgramare(Program prog)
    {
        boolean added = false;
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Program.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            session.save(prog);
            session.getTransaction().commit();
            added = true;
        } catch(Exception e)
        {
            System.out.println(e.getMessage());
            added = false;
        } finally {
            session.close();
            factory.close();

        }
        return added;
    }

    public ArrayList<Program> viewProgramari()
    {
        ArrayList<Program> programari = null;
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Program.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            programari = (ArrayList<Program>) session.createQuery("FROM Program").list();
            for(Program p:programari)
                System.out.println(p.toString());
            session.getTransaction().commit();
        } catch(Exception e)
        {
            System.out.println(e.getMessage());
        } finally {
            session.close();
            factory.close();

        }
        return programari;
    }

    public boolean updateProgramare(String id, String nume, String prenume, Timestamp data, String nrLegitimatie)
    {
        boolean added = false;
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Program.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            Program myProg = session.get(Program.class,id);
            myProg.setNume(nume);
            myProg.setPrenume(prenume);
            myProg.setData(data);
            myProg.setNrLegitimatie(nrLegitimatie);
            session.getTransaction().commit();
            added = true;
        } catch(Exception e)
        {
            System.out.println(e.getMessage());
            added = false;
        } finally {
            session.close();
            factory.close();

        }
        return added;
    }

    public boolean deleteProgramare(String id)
    {
        boolean added = false;
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Program.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            Program myAcc = session.get(Program.class,id);
            session.delete(myAcc);
            session.getTransaction().commit();
            added = true;
        } catch(Exception e)
        {
            System.out.println(e.getMessage());
            added = false;
        } finally {
            session.close();
            factory.close();

        }
        return added;
    }



    public static void main(String[] args){
        PersistentaProgram p = new PersistentaProgram();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
        //boolean s=p.addProgramare(new Program(new Timestamp(1567296000000L),"1234","3","1","1"));
        //System.out.println(s);
        //p.deleteProgramare("1");
        //p.viewProgramari();

    }
}
