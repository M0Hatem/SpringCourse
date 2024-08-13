package com.section6jpa.course.jdbc;

import com.section6jpa.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String INSERT_Query =
            """
                    insert into course(id,name,author)
                    values(?,?,?)
                    """;
    private static final String DELETE_Query = """
             delete from course where id=?
            """;
    private static final String SELECT_Query = """
            select * from course where id=?
            """;

    public void insert(Course course) {
        jdbcTemplate.update(INSERT_Query, course.getId(), course.getName(), course.getAuthor());
    }

    public void delete(long id) {
        jdbcTemplate.update(DELETE_Query, id);
    }

    public Course findById(long id) {
        return jdbcTemplate.queryForObject(SELECT_Query,new BeanPropertyRowMapper<>(Course.class), id);
    }
}
