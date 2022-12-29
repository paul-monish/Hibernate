package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Student st=new Student("monish",72);
      System.out.println(st);
      SessionFactory sf=new Configuration().configure().buildSessionFactory();
      Session s=sf.openSession();
      s.beginTransaction();
      s.persist(st);
      s.getTransaction().commit();
      s.close();
      sf.close();


    }
}
