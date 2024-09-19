package com.s8restful.resftulwebservice.jpa;

import com.s8restful.resftulwebservice.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
