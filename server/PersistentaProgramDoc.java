package server;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.criteria.CriteriaBuilder;
import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class PersistentaProgramDoc extends Persistenta implements Serializable {

    public PersistentaProgramDoc() {

    }

    public boolean addProgramDoc(ProgramDoc prog)
    {
        boolean added = false;
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(ProgramDoc.class)
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

    public ArrayList<ProgramDoc> viewProgramDoc()
    {
        ArrayList<ProgramDoc> programDoc = null;
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(ProgramDoc.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            programDoc = (ArrayList<ProgramDoc>) session.createQuery("FROM ProgramDoc").list();
            //for(ProgramDoc p:programDoc)
                //System.out.println(p.toString());
            session.getTransaction().commit();
        } catch(Exception e)
        {
            System.out.println(e.getMessage());
        } finally {
            session.close();
            factory.close();

        }
        return programDoc;
    }

    public boolean deleteProgramDoc(Integer id)
    {
        boolean added = false;
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(ProgramDoc.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();

            //String sqlQuery = "Delete  FROM program_doc where id_program = :id";
            //SQLQuery query = session.createSQLQuery(sqlQuery);
            //query.setParameter("id_program", id);
            //int a =  query.executeUpdate();
            ProgramDoc myAcc = session.get(ProgramDoc.class,id);
            session.delete(myAcc);
            //System.out.println(dat.getHours() + " luna " + dat.getMonth() + " ziua " +dat.getDate() +"\n");
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

        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
        //Timestamp t = new Timestamp(System.currentTimeMillis());
        PersistentaProgramDoc p = new PersistentaProgramDoc();
        //boolean s=p.addProgramDoc(new ProgramDoc(new Timestamp(1567296000000L),10,50,"3"));
        //System.out.println(s);
        //p.viewProgramDoc();
        //p.deleteProgramDoc(1);
        //p.viewConturi();

    }
}
