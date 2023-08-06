package com.elnatega.api.response;

public record InquiryResponse(
        Integer seatNum,
        String name,
        Double totalResult,
        String status,
        Double percentage
) {
    public InquiryResponse(Integer seatNum, String name, Double totalResult, String status, Double percentage) {
        this.seatNum = seatNum;
        this.name = name;
        this.totalResult = totalResult;
        this.status = status;
        this.percentage = percentage;
    }
}
