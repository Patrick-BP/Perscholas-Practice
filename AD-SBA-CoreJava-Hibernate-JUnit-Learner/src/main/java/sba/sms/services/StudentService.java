package sba.sms.services;

import lombok.extern.java.Log;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import sba.sms.dao.StudentI;
import sba.sms.models.Course;
import sba.sms.models.Student;
import sba.sms.utils.HibernateUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;




/**
 * StudentService is a concrete class. This class implements the
 * StudentI interface, overrides all abstract service methods and
 * provides implementation for each method. Lombok @Log used to
 * generate a logger file.
 */

public class StudentService implements StudentI {
    final Session session = HibernateUtil.getSessionFactory().openSession();
    @Override
    public List<Student> getAllStudents() {
        String hql = "SELECT s FROM Student s ";

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Student> query = session.createQuery(hql, Student.class);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            // Handle exceptions appropriately
            return Collections.emptyList();
        }
    }

    @Override
    public void createStudent(Student student) {
        Transaction transaction = session.beginTransaction();
        session.persist(student);
        transaction.commit();

    }

    @Override
    public Student getStudentByEmail(String email) {
        Student s = session.get(Student.class, email);
        return s;
    }

    @Override
    public boolean validateStudent(String email, String password) {
        Student s = session.get(Student.class, email);
        if(s.getEmail().equals(email) && s.getPassword().equals(password)){
                return true;
        }

        return false;
    }

    @Override
    public void registerStudentToCourse(String email, int courseId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Student student = session.get(Student.class, email);
            Course course = session.get(Course.class, courseId);
            student.getCourses().add(course);
            session.update(student);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public List<Course> getStudentCourses(String email) {
        String hql = "SELECT c FROM Course c JOIN c.students s WHERE s.email = :email";

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Course> query = session.createQuery(hql, Course.class);
            query.setParameter("email", email);

            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            // Handle exceptions appropriately
            return Collections.emptyList();
        }

    }
}
