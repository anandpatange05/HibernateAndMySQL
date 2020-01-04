package com.anand.DemoHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
       Alien anand = new Alien();
       anand.setAid(101);
       anand.setAname("Navin");
       anand.setColour("green");
   
    
    Configuration con= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alien.class);
    
    
    ServiceRegistry reg =new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    SessionFactory sf = con.buildSessionFactory(reg);
   
    Session session =sf.openSession();
    
    Transaction tx = session.beginTransaction();
    session.save(anand);
    tx.commit();
    }
}
