package com.Kafka_Spark_Cassandra_Expense_Tracker.demo.Repository;

import com.Kafka_Spark_Cassandra_Expense_Tracker.demo.model.Emp;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmpRepository extends JpaRepository<Emp, Integer> {

    @EntityGraph(attributePaths = {"dept"})
    List<Emp> findAll();
}