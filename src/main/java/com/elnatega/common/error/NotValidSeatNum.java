package com.elnatega.common.error;

public final class NotValidSeatNum extends Error {
    public NotValidSeatNum() {
        super(404, "Not valid seat number!");
    }
}