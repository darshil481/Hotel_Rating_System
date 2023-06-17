package com.userService.exceptions;

import com.userService.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handlerResourseNotFoundException(ResourceNotFoundException resourceNotFoundException){

        String message=resourceNotFoundException.getMessage();
        ApiResponse response = ApiResponse.builder().msg(message).succes(true).httpStatus(HttpStatus.NOT_FOUND).build();
        return  new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
    }
}
