package com.example.springboot_security_bookedition;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private int age;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Pet> pets;

    public Owner() {
    }

    public Owner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Set<Pet> getPets() {
        return pets;
    }
    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
