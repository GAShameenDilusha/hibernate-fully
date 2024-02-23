package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();

        Student s = session.get(Student.class,1);
        session.save(s);
        //session.detach(s);
        //session.merge(s);
        s.setTxtName("shameen");

        transaction.commit();
        session.close();
    }
}