package com.example.jenkinslab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();

        users.add(new User("1", "Alice", List.of(new Pet("1", "Buddy", "Dog"))));
        users.add(new User("2", "Bob", List.of(new Pet("2", "Mittens", "Cat"))));

        return users;
    }
}