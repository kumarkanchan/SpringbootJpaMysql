package com.springbootjpa.service;

public class UserDataAccessException extends Throwable {
    public UserDataAccessException(String errorMessage) {
        super(errorMessage);
    }
}
