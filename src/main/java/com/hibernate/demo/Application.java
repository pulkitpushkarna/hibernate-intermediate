package com.hibernate.demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Application {
    public static void main(String[] args) {
        SessionFactory sessionFactory =new Configuration()
                .configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Employee employee=new Employee();
        employee.setId(12);
        employee.setName("John");
        session.save(employee);
        session.getTransaction().commit();
        session.close();

    }
}
