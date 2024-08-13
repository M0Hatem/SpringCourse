package com.section6jpa.course.springDataJPA;

import com.section6jpa.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course,Long> {

    List<Course> findCourseByAuthor(String author);

}
