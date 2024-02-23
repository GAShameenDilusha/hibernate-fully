package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.Laptop;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop();
        laptop1.setLid(1);
        laptop1.setModel("dell");

        Laptop laptop2 = new Laptop();
        laptop2.setLid(2);
        laptop2.setModel("hp");

        List<Laptop>laptopList = new ArrayList<>();
        laptopList.add(laptop1);
        laptopList.add(laptop2);



        Student student = new Student();
        student.setId(3);
        student.setName("Ramal");
        student.setAddress("Panadura");
        student.setLaptop(laptopList);

        laptop1.setStudent(student);
        laptop2.setStudent(student);



        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(laptop1);
        session.save(laptop2);
        session.save(student);


        transaction.commit();
        session.close();




    }
}