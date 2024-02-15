package com.perscholas.control;

import com.perscholas.model.Department;
import com.perscholas.model.Teacher;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class TeacherToDepartmentController {
    private static final Scanner scanner = new Scanner(System.in);
    public  void addTeachersToDepartment(Session session) {
        // Implement logic to fetch existing departments and teachers
        // Display a menu for user to select department and teacher to associate
        Transaction tx = session.beginTransaction();

        Query<Department> departmentQuery = session.createQuery("FROM Department", Department.class);
        List<Department> departments = departmentQuery.list();

        System.out.println("\n \n ########## Select a Department ################# ");
        for (Department dept : departments){
            System.out.println(dept.getDid() + ": "+ dept.getDname());
        }

        System.out.println(" ##########  ################# ");

        int departmentId = scanner.nextInt();

       System.out.println("Select a Teacher to add to the Department:");
        Query<Teacher> teacherQuery = session.createQuery("FROM Teacher", Teacher.class);
        List<Teacher> teacherList = teacherQuery.list();

        System.out.println("\n \n ########## Select a Teacher ################# ");
        for (Teacher tch : teacherList){
            System.out.println(tch.getTit() + ": "+ tch.getTeachername());
        }
        System.out.println(" ##########  ################# \n");
        int teacherId = scanner.nextInt();

        transaction.commit();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();

            // Load the Department and Teacher entities
            Teacher teacher = session.load(Teacher.class, teacherId);
            Department department = session.load(Department.class, departmentId);
            // Update the association

            teacher.setDep(department);

            // Save the changes

            session.update(teacher);

            transaction.commit();
            System.out.println("Teacher has been added to the department successfully.");
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            System.out.println("Error adding teacher to the department.");
        } finally {
            // Close the session if necessary
        }


    }
}
