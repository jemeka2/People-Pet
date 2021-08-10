package com.example.springboot_security_bookedition;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Pet {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long id;

   private String petName;
   private String breed;
   private int petAge;

   @ManyToOne(fetch = FetchType.EAGER)
   @JoinColumn(name = "owner_id")
   private Owner owner;


    public Pet() {
    }

    public Pet(String petName, String breed, int petAge, Owner owner) {
        this.petName = petName;
        this.breed = breed;
        this.petAge = petAge;
        this.owner = owner;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getPetName() {
        return petName;
    }
    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getPetAge() {
        return petAge;
    }
    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public Owner getOwner() {
        return owner;
    }
    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
