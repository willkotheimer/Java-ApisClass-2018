package com.cooksys.ftd.sprintboot.controller.advice;

import com.cooksys.ftd.sprintboot.exceptions.QuizNotFound;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(QuizNotFound.class)
    public ResponseMessage QuizNotFound(QuizNotFound e) {
        return new ResponseMessage(e.getMessage());
    }

}
