package com.example.springboot_security_bookedition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class CommandLineRunnerBean implements CommandLineRunner {

    @Autowired
    UserRepo userRepo;

    @Autowired
    RoleRepo roleRepo;

    @Autowired
    OwnerRepo ownerRepo;

    public void run(String...args){
        User user = new User("bart", "bart@domain.com", "bart", "Bart","Simpson", true);
        Role userRole = new Role("bart", "ROLE_USER");
        userRepo.save(user);
        roleRepo.save(userRole);

        User admin = new User("super", "super@domain.com", "super", "Super", "Hero", true);
        Role adminRole1 = new Role("super", "ROLE_ADMIN");
        Role adminRole2 = new Role("super", "ROLE_USER");

        userRepo.save(admin);
        roleRepo.save(adminRole1);
        roleRepo.save(adminRole2);

        Owner owner = new Owner("Jabir Emeka", 18);
        Pet pet = new Pet("Cacao", "Pitbull", 9, owner);

        Set<Pet> pets = new HashSet<>();
        pets.add(pet);

        owner.setPets(pets);

        ownerRepo.save(owner);
    }

}
