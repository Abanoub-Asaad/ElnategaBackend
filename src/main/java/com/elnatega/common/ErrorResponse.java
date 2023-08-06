package com.elnatega.common;

public record ErrorResponse(
    Integer code,
    String description
) {
    public static ErrorResponse fail(Integer code, String description) {
        return new ErrorResponse(code, description);
    }
}