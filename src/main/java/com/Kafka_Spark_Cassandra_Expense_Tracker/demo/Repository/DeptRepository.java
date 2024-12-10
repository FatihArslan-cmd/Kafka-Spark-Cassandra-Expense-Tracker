package com.Kafka_Spark_Cassandra_Expense_Tracker.demo.Repository;

import com.Kafka_Spark_Cassandra_Expense_Tracker.demo.model.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptRepository extends JpaRepository<Dept, Integer> {
}