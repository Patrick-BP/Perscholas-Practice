package sba.sms.services;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import sba.sms.dao.CourseI;
import sba.sms.models.Course;
import sba.sms.models.Student;
import sba.sms.utils.HibernateUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * CourseService is a concrete class. This class implements the
 * CourseI interface, overrides all abstract service methods and
 * provides implementation for each method.
 */
public class CourseService implements CourseI{
    Session session = HibernateUtil.getSessionFactory().openSession();
    @Override
    public void createCourse(Course course) {
        Transaction transaction = session.beginTransaction();
        session.persist(course);
        transaction.commit();
        System.out.println("successfully saved");

    }

    @Override
    public Course getCourseById(int courseId) {
        Course c = session.get(Course.class, courseId);
        return c;
    }

    @Override
    public List<Course> getAllCourses() {
        String hql = "SELECT DISTINCT c FROM Course c";

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Course> query = session.createQuery(hql, Course.class);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            // Handle exceptions appropriately
            return Collections.emptyList();
        }

    }
}
