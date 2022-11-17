package com.entity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
public class AppMain {
	 public static void main(String[] args) {
		 Configuration cfg=new Configuration().addAnnotatedClass(com.entity.Employee.class).configure("hibernateConfiguration.xml");
		        
		        StandardServiceRegistryBuilder sb= new StandardServiceRegistryBuilder();
		        sb.applySettings(cfg.getProperties());
		        StandardServiceRegistry registry=sb.build();
		        SessionFactory factory=cfg.buildSessionFactory(registry);
		        
		        Session session=factory.openSession();
		        Transaction t=session.beginTransaction();
		        
		        
		        Employee e=new Employee();
		        e.setId(12);
		        e.setEname("gayathri");
		        e.setContactno(9047740149l);
		        session.save(e);
		        
		        t.commit();
		        session.close();
		   System.out.println("inserted");


		    }
}
