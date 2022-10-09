package ru.task.cache.db1.exeption_handling;

public class NoSuchInfoException extends RuntimeException{

    public NoSuchInfoException(String message) {
        super(message);
    }
}
