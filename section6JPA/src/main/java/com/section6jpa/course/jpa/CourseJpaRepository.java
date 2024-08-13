package com.section6jpa.course.jpa;

import com.section6jpa.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course);
    }
    public Course findById(long Id){
        return entityManager.find(Course.class,Id);
    }
     public void deleteById(long Id){
         Course course = entityManager.find(Course.class, Id);
         entityManager.remove(course);
    }

}
