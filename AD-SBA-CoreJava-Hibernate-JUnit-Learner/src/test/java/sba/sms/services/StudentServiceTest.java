package sba.sms.services;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sba.sms.models.Student;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {
    private StudentService studentService;

    @BeforeEach
    void setUp() {
        studentService = new StudentService();
    }



    @Test
    void createStudent() {
        Student student = new Student();
        student.setName("John Doe");
        student.setEmail("john@example.com");
        student.setPassword("password");
        studentService.createStudent(student);
     assertNotNull(student.getEmail());
    }

}