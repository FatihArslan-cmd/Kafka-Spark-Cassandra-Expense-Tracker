package com.Kafka_Spark_Cassandra_Expense_Tracker.demo.services;

import com.Kafka_Spark_Cassandra_Expense_Tracker.demo.Repository.DeptRepository;
import com.Kafka_Spark_Cassandra_Expense_Tracker.demo.model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {

    @Autowired
    private DeptRepository deptRepository;

    public List<Dept> getAllDepartments() {
        return deptRepository.findAll();
    }
}