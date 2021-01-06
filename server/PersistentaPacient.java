package server;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersistentaPacient extends Persistenta implements Serializable{

    public PersistentaPacient() {

    }

    public boolean addPacient(Pacient pacient)
    {
        boolean added = false;
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Pacient.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            session.save(pacient);
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

    public ArrayList<Pacient> viewPacienti()
    {
        ArrayList<Pacient> pacienti = null;
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Pacient.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            pacienti = (ArrayList<Pacient>) session.createQuery("FROM Pacient").list();
            for(Pacient p:pacienti)
                System.out.println(p.toString1());
            session.getTransaction().commit();
        } catch(Exception e)
        {
            System.out.println(e.getMessage());
        } finally {
            session.close();
            factory.close();

        }
        return pacienti;
    }

    public boolean updatePacient(String id,String nume,String prenume, String nrLegitim)
    {
        boolean added = false;
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Pacient.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            Pacient myp = session.get(Pacient.class,id);
            myp.setNume(nume);
            myp.setPrenume(prenume);
            myp.setNrLegitimatie(nrLegitim);
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

    public boolean updatePacientDoc(String id,String simptome,String diagnostic,String tratament)
    {
        boolean added = false;
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Pacient.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            Pacient myp = session.get(Pacient.class,id);
            myp.setSimptome(simptome);
            myp.setDiagnostic(diagnostic);
            myp.setTratament(tratament);
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

    public boolean deletePacient(String id)
    {
        boolean added = false;
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Pacient.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            Pacient myp = session.get(Pacient.class,id);
            session.delete(myp);
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
        PersistentaPacient p = new PersistentaPacient();
        //boolean s=p.addPacient(new Pacient("2","nume2","prenum2","da","da","da","1"));
        //System.out.println(s);
        p.viewPacienti();
        //p.deletePacient("2");
        //p.viewPacienti();
    }
}
