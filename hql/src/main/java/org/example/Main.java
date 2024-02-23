package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {

      /*  Laptop laptop1 = new Laptop();
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
        laptop2.setStudent(student);*/



        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


        /*Query query = session.createQuery("INSERT INTO Student ()"+);
        List<Student>studentList=query.list();
        for (Student student:studentList){
            System.out.println(student.getName());
        }*/
        /*Query query =session.createQuery("from Student WHERE name=?1");
        query.setParameter(1,"dasd");
        Student student=(Student) query.uniqueResult();
        System.out.println(student.getName());*/

        /*Query query=session.createQuery("select id,name from Student WHERE id=?1");
        query.setParameter(1,1);
        Object[]objects= (Object[])  query.uniqueResult();
        System.out.println(objects[0]);*/


        Query query=session.createQuery("select id,name from Student");
        List<Object[]>list = query.list();






        /*session.save(laptop1);
        session.save(laptop2);
        session.save(student);*/


        transaction.commit();
        session.close();




    }
}