package com.s8restful.resftulwebservice.jpa;

import com.s8restful.resftulwebservice.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
