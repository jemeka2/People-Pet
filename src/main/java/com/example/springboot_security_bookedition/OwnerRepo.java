package com.example.springboot_security_bookedition;

import org.springframework.data.repository.CrudRepository;

public interface OwnerRepo extends CrudRepository<Owner, Long> {
}
