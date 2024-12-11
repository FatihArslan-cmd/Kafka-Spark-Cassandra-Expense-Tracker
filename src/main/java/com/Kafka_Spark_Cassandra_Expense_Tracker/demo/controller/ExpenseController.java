package com.Kafka_Spark_Cassandra_Expense_Tracker.demo.controller;

import com.Kafka_Spark_Cassandra_Expense_Tracker.demo.services.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @GetMapping("/expenses/total-payments")
    public Map<Integer, Double> getTotalPayments() {
        return expenseService.getTotalPaymentsByUserId();
    }
}