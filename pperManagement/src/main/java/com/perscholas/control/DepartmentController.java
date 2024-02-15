package com.perscholas.control;

import com.perscholas.model.Department;
import com.perscholas.model.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class DepartmentController {

    private static final Scanner scanner = new Scanner(System.in);
    public void manageDepartments(Session session) {
        System.out.println("1. Add Department");
        System.out.println("2. Delete Department");
        System.out.println("3. Modify Department");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Transaction t = session.beginTransaction();
                Scanner sc = new Scanner(System.in);
                System.out.println("Department Name: ");
                String name = sc.next();

                Department d1 = new Department();
                d1.setDname(name);
                session.persist(d1);
                t.commit();
                break;
            case 2:
                // Implement logic to delete a department
                break;
            case 3:
                // Implement logic to modify a department
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }
    }
}
