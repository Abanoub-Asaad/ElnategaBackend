package com.elnatega.data;

import org.springframework.data.relational.core.mapping.Table;

@Table("STUDENT")
public record Student(
        Integer seatNum,
        String name,
        Double totalResult,
        String status,
        Double percentage
) {
}