package com.s8restful.resftulwebservice.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int userCount = 0;

    static {
        users.add(new User(++userCount, "John Doe", LocalDate.of(1990, 1, 1)));
        users.add(new User(++userCount, "Jane Doe", LocalDate.of(1992, 2, 2)));
        users.add(new User(++userCount, "Jim Beam", LocalDate.of(1985, 3, 3)));
    }

    public List<User> findAll() {
        return users;
    }

    public User findById(int id) {
        Predicate<? super User> predicate = user -> user.getId() == id;
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public void deleteById(int id) {
        Predicate<? super User> predicate = user -> user.getId() == id;
        users.removeIf(predicate);
    }

    public User save(User user) {
        user.setId(++userCount);
        users.add(user);
        return user;
    }
}
