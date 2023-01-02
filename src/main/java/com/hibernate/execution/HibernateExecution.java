package com.hibernate.execution;

import com.hibernate.model.Department;
import com.hibernate.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class HibernateExecution {
    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = configuration.buildSessionFactory();//It is required one time only

        addStudents(sessionFactory);//method calling
        addDepartment(sessionFactory);
    }

    public static void addStudents(SessionFactory sessionFactory) { //method creation
        Session session = sessionFactory.openSession();

        try {

            Student student = new Student("studem");
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.err.println("error message:" + e.getMessage());

        } finally {
            if (session != null) {
                session.close();

            }
        }
    }

    public static void addDepartment(SessionFactory sessionFactory) { //method creation
        Session session = sessionFactory.openSession();

        try {

            Department department = new Department("admin");
            session.beginTransaction();
            session.save(department);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.err.println("error message:" + e.getMessage());

        } finally {
            if (session != null) {
                session.close();

            }
        }
    }

}


