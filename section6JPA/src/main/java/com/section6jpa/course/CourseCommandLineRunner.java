package com.section6jpa.course;

import com.section6jpa.course.jpa.CourseJpaRepository;
import com.section6jpa.course.springDataJPA.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseSpringDataJpaRepository courseJdbcRepository;

    @Override
    public void run(String... args) throws Exception {
        courseJdbcRepository.save(new Course(1, "springBoot", "m16"));
        courseJdbcRepository.save(new Course(2, "sprin", "m16"));
//        courseJdbcRepository.deleteById(2L);
        System.out.println(courseJdbcRepository.findById(1L));

        System.out.println(courseJdbcRepository.findCourseByAuthor("m16"));
    }
}
