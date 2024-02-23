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
        Laptop laptop1 =new Laptop();
        laptop1.setLid("l1");
        laptop1.setModel("HP");
        Laptop laptop2 = new Laptop();
        laptop2.setLid("l2");
        laptop2.setModel("DELL");

        List<Laptop> laptopList=new ArrayList<>();
        laptopList.add(laptop1);
        laptopList.add(laptop2);

        Student student = new Student();
        student.setId(001);
        student.setName("Kamal");
        student.setAge(21);
        student.setLaptop(laptopList);

        laptop1.setStudents(student);
        laptop2.setStudents(student);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Student student1 = session.get(Student.class,001);

        List<Laptop>laptoplist=student.getLaptop();
        for (Laptop laptop:laptoplist){
            System.out.println(laptop.getModel());
        }






        transaction.commit();
        session.close();
    }



}