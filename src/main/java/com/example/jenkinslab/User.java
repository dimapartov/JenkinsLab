package com.example.jenkinslab;


import java.util.List;


public class User {

    private String id;
    private String name;
    private List<Pet> pets;

    public User(String id, String name, List<Pet> pets) {
        this.id = id;
        this.name = name;
        this.pets = pets;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Pet> getPets() {
        return pets;
    }

}