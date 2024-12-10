package com.Kafka_Spark_Cassandra_Expense_Tracker.demo.controller;

import com.Kafka_Spark_Cassandra_Expense_Tracker.demo.model.Dept;
import com.Kafka_Spark_Cassandra_Expense_Tracker.demo.services.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping
    public List<Dept> getAllDepartments() {
        return deptService.getAllDepartments();
    }
}