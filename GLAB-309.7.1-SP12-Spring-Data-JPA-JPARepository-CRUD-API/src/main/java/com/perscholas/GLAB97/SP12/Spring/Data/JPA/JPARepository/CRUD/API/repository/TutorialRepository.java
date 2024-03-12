package com.perscholas.GLAB97.SP12.Spring.Data.JPA.JPARepository.CRUD.API.repository;

import com.perscholas.GLAB97.SP12.Spring.Data.JPA.JPARepository.CRUD.API.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(boolean published);
}
