package com.elnatega.api.service;

import com.elnatega.common.error.NotValidSeatNum;
import com.elnatega.data.Student;
import com.elnatega.data.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InquiryService {
    private final StudentRepository studentRepository;

    public InquiryService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student inquiry(Integer seatNum) throws NotValidSeatNum {
        Optional<Student> studentOptional = studentRepository.findBySeatNum(seatNum);
        if(studentOptional.isEmpty()) {
            throw new NotValidSeatNum();
        } else {
            return studentOptional.get();
        }
    }
}