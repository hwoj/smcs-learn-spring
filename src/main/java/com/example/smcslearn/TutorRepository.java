package com.example.smcslearn;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TutorRepository extends CrudRepository<Tutor, Long> {

    List<Tutor> findByLastName(String lastName);

    Tutor findById(long id);
}
