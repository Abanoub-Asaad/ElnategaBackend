package com.elnatega.api;

import com.elnatega.api.service.InquiryService;
import com.elnatega.common.error.NotValidSeatNum;
import com.elnatega.data.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InquiryController {

    private final InquiryService inquiryService;

    public InquiryController(InquiryService inquiryService) {
        this.inquiryService = inquiryService;
    }

    @GetMapping("/inquiry")
    public Student inquiry(@RequestParam Integer seatNum) throws NotValidSeatNum {
        //return new Student(1, "hi", 1.5, "s", 1.5);
        return inquiryService.inquiry(seatNum);
    }
}