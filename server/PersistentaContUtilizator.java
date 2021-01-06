package server;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersistentaContUtilizator extends Persistenta implements Serializable{
    public PersistentaContUtilizator() {

    }

    public boolean addCont(ContUtilizator cont)
    {
        boolean added = false;
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(ContUtilizator.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            session.save(cont);
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

    public boolean addUtilizator(Utilizator cont)
    {
        boolean added = false;
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Utilizator.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            session.save(cont);
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

    public ArrayList<ContUtilizator> viewConturi()
    {
        ArrayList<ContUtilizator> conturi = null;
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(ContUtilizator.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            conturi = (ArrayList<ContUtilizator>) session.createQuery("FROM ContUtilizator").list();
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

    public String getRol(String cod)
    {
        List<String> conturi = null;
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(ContUtilizator.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            String sqlQuery = "SELECT u.rol FROM cont_utilizator c JOIN utilizator u on c.nr_legitimatie = u.nr_legitimatie WHERE c.nr_legitimatie = :cod ";
            //String sqlQuery = "SELECT p.type, p.id, p.name, p.age, p.code, p.role, a.username, a.password FROM Person p JOIN User_Account a ON p.code = a.user_code  WHERE p.role = :role ";
            SQLQuery query = session.createSQLQuery(sqlQuery);
            query.setParameter("cod", cod);

            /*for(Object[] object : results2) {
                for (Object field:object)
                    System.out.println(field.toString());
            */
            conturi = query.list();
            //System.out.println(conturi.get(0).toString() + "\n");
            session.getTransaction().commit();

        } catch(Exception e)
        {
            System.out.println(e.getMessage());
        } finally {
            session.close();
            factory.close();

        }
        return conturi.get(0).toString();
    }

    public ArrayList<Object[]> getAll()
    {
        ArrayList<Object[]> conturi = null;
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(ContUtilizator.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            String sqlQuery = "SELECT c.user,c.parola,u.rol,u.nume,u.prenume,u.varsta,c.nr_legitimatie FROM cont_utilizator c JOIN utilizator u on c.nr_legitimatie = u.nr_legitimatie";
            //String sqlQuery = "SELECT p.type, p.id, p.name, p.age, p.code, p.role, a.username, a.password FROM Person p JOIN User_Account a ON p.code = a.user_code  WHERE p.role = :role ";
            SQLQuery query = session.createSQLQuery(sqlQuery);

            /*for(Object[] object : results2) {
                for (Object field:object)
                    System.out.println(field.toString());
            */
            conturi = (ArrayList<Object[]>) query.list();
//            for(Object[] object : conturi) {
//                for (Object field : object)
//                    System.out.println(field.toString());
//            }
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

    public boolean updateCont(String nrLegitimatie,String user,String parola)
    {
        boolean added = false;
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(ContUtilizator.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            ContUtilizator myAcc = session.get(ContUtilizator.class,nrLegitimatie);
            myAcc.setUser(user);
            myAcc.setParola(parola);
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

    public boolean deleteCont(String id)
    {
        boolean added = false;
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(ContUtilizator.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            ContUtilizator myAcc = session.get(ContUtilizator.class,id);
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
        PersistentaContUtilizator p = new PersistentaContUtilizator();
        //String s = p.getRol("1");
        //System.out.println(s.toString() + "\n");
        //boolean s=p.addCont(new ContUtilizator("medic1","1234","3"));
        //System.out.println(s);
        p.getAll();
        //p.deleteCont("3");
        //p.viewConturi();

    }
}