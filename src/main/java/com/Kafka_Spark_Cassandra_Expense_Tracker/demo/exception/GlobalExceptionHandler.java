package com.Kafka_Spark_Cassandra_Expense_Tracker.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.MethodArgumentNotValidException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> handleInvalidRequestBody(Exception ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Geçersiz istek verisi: " + ex.getMessage());
    }
}
