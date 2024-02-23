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



        Student student1 = new Student();
        student1.setId(3);
        student1.setName("Ramal");
        student1.setAddress("Panadura");


        Student student2 = new Student();
        student2.setId(3);
        student2.setName("Ramal");
        student2.setAddress("Panadura");

        List<Student>studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);

        student1.setLaptop(laptopList);
        student2.setLaptop(laptopList);


       laptop1.setStudent(studentList);
       laptop2.setStudent(studentList);



        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(student1);
        session.save(student2);
        session.save(laptop1);
        session.save(laptop2);



        transaction.commit();
        session.close();




    }
}