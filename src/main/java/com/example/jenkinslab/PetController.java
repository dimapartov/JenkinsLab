package com.example.jenkinslab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
public class PetController {

    private List<User> users = new ArrayList<>();

    public PetController() {
        users.add(new User("1", "Alice", List.of(new Pet("1", "Buddy", "Dog"))));
        users.add(new User("2", "Bob", List.of(new Pet("2", "Mittens", "Cat"))));
    }

    @GetMapping("/users/{userId}/pets")
    public List<Pet> getPetsByUserId(@PathVariable String userId) {
        Optional<User> userOpt = users.stream()
                .filter(u -> u.getId().equals(userId))
                .findFirst();

        return userOpt.map(User::getPets).orElse(new ArrayList<>());
    }

}