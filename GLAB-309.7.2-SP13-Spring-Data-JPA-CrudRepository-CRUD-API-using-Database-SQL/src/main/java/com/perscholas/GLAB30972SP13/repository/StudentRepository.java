package com.perscholas.GLAB30972SP13.repository;

import com.perscholas.GLAB30972SP13.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface  StudentRepository extends CrudRepository<Student, Long> {
    // following are custom methods
    Student findByAccountNo (Long accountNo) ;
    List<Student> findByNameContaining(String name);
}
