package com.Kafka_Spark_Cassandra_Expense_Tracker.demo.controller;

import com.Kafka_Spark_Cassandra_Expense_Tracker.demo.dto.ExpenseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    @PostMapping
    public ResponseEntity<String> receiveExpense(@RequestBody ExpenseDto expenseDto) {
        // Gelen veriyi işleme (örneğin, bir veritabanına kaydetme veya loglama)
        System.out.println("Received Expense Data: " + expenseDto);

        // Yanıt döndür
        return ResponseEntity.ok("Expense data received successfully!");
    }
}