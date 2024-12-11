package com.Kafka_Spark_Cassandra_Expense_Tracker.demo.services;

import com.Kafka_Spark_Cassandra_Expense_Tracker.demo.Repository.ExpenseRepository;
import com.Kafka_Spark_Cassandra_Expense_Tracker.demo.model.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public Map<Integer, Double> getTotalPaymentsByUserId() {
        List<Expense> expenses = expenseRepository.findAll();
        return expenses.stream()
                .collect(Collectors.groupingBy(
                        Expense::getUserId,
                        Collectors.summingDouble(Expense::getPayment)
                ));
    }
}
