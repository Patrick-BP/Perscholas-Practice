import com.perscholas.control.DepartmentController;
import com.perscholas.control.TeacherController;
import com.perscholas.control.TeacherToDepartmentController;
import com.perscholas.model.Department;
import com.perscholas.model.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        Teacher tone = new Teacher();
        Department done = new Department();
        t.commit();
        System.out.println("successfully created Teacher and Department table");



        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Manage Teachers");
            System.out.println("2. Manage Departments");
            System.out.println("3. Assign Teacher to Department");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    TeacherController tc = new TeacherController();
                    tc.manageTeachers(session);
                    break;
                case 2:
                    DepartmentController dc = new DepartmentController();
                    dc.manageDepartments(session);
                    break;
                case 3:
                    TeacherToDepartmentController ttdc = new TeacherToDepartmentController();
                    ttdc.addTeachersToDepartment(session);
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }







    }
}

