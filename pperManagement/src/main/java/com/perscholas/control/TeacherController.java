package com.perscholas.control;

import com.perscholas.model.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class TeacherController {

    private static final Scanner scanner = new Scanner(System.in);
    public void manageTeachers(Session session) {
        System.out.println("1. Add Teacher");
        System.out.println("2. Delete Teacher");
        System.out.println("3. Modify Teacher");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:

                Transaction t = session.beginTransaction();
                Scanner sc = new Scanner(System.in);
                System.out.println("Teacher Name: ");
                String name = sc.next();
                System.out.println("Salary: ");
                String salary = sc.next();
                Teacher t1 = new Teacher();
                t1.setSalary(salary);
                t1.setTeachername(name);
                session.persist(t1);
                t.commit();
                break;
            case 2:

                Transaction tx = session.beginTransaction();
                Scanner titsc = new Scanner(System.in);
                System.out.println("Teacher tit: ");
                int tit = titsc.nextInt();
                Teacher tdelete = new Teacher();
                tdelete.setTit(tit);
                session.remove(tdelete);
                tx.commit();

                break;
            case 3:
                Transaction txx = session.beginTransaction();
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Teacher tit: ");
                int ttit = sc2.nextInt();
                System.out.println("Teacher Name: ");
                String tname = sc2.next();
                System.out.println("Teacher salary: ");
                String tsalary = sc2.next();
                Teacher u = new Teacher();
                u.setTit(ttit);
                u.setTeachername(tname);
                u.setSalary(tsalary);
                session.merge(u);
                session.getTransaction().commit();

                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }
    }


}
