package ru.skillbox.socialnetwork.services.exceptions;

public class PersonNotFoundException extends RuntimeException {
    public PersonNotFoundException(long id) {
        super("invalid profile ID: " + id);
    }
}