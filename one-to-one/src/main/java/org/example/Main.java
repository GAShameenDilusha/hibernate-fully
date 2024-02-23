package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.Laptop;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.setLid(13);
        laptop.setModel("acer");

        Student student = new Student();
        student.setId(3);
        student.setName("Ramal");
        student.setAddress("Panadura");
        student.setLaptop(laptop);



        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(laptop);
        session.save(student);
        transaction.commit();
        session.close();




    }
}