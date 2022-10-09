package ru.task.cache.db1.exeption_handling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class InfoGlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<InfoIncorrectData> handleException(
            NoSuchInfoException exception){

        InfoIncorrectData data = new InfoIncorrectData();
        data.setInfo(exception.getMessage());
        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<InfoIncorrectData>handleException(Exception exception){

        InfoIncorrectData data = new InfoIncorrectData();
        data.setInfo(exception.getMessage());

        return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
    }

}
