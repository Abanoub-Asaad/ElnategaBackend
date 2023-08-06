package com.elnatega.data;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface StudentRepository extends CrudRepository<Student, Integer> {

    public Optional<Student> findBySeatNum(Integer seatNum);
}