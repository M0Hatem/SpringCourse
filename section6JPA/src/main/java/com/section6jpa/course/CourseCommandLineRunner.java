package com.section6jpa.course;

import com.section6jpa.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJpaRepository courseJdbcRepository;

    @Override
    public void run(String... args) throws Exception {
        courseJdbcRepository.insert(new Course(1, "springBoot", "m16"));
        courseJdbcRepository.insert(new Course(2, "sprin", "m16"));
        courseJdbcRepository.deleteById(2);
        System.out.println(courseJdbcRepository.findById(1));
    }
}
