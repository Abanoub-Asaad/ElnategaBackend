package com.elnatega.common.error;

public sealed class Error extends Exception permits NotValidSeatNum {
    public final Integer code;
    public final String description;

    public Error(Integer code, String description) {
        this.code = code;
        this.description = description;
    }
    @Override
    public String toString() {
        return "Error{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}