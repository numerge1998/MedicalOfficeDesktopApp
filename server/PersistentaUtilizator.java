package server;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.Serializable;
import java.util.ArrayList;

public class PersistentaUtilizator implements Serializable {

    public ArrayList<Utilizator> viewUtilizatori()
    {
        ArrayList<Utilizator> conturi = null;
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Utilizator.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            conturi = (ArrayList<Utilizator>) session.createQuery("FROM Utilizator").list();
            //for(ContUtilizator p:conturi)
            //System.out.println(p.toString());
            session.getTransaction().commit();
        } catch(Exception e)
        {
            System.out.println(e.getMessage());
        } finally {
            session.close();
            factory.close();

        }
        return conturi;
    }

    public boolean updateUtilizator(String nrLegitimatie,String nume,String prenume,String varsta,String rol)
    {
        boolean added = false;
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Utilizator.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            Utilizator myAcc = session.get(Utilizator.class,nrLegitimatie);
            myAcc.setNume(nume);
            myAcc.setPrenume(prenume);
            myAcc.setRol(rol);
            myAcc.setVarsta(varsta);
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
}
