package com.Kafka_Spark_Cassandra_Expense_Tracker.demo.Repository;

import com.Kafka_Spark_Cassandra_Expense_Tracker.demo.model.Expense;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ExpenseRepository extends CassandraRepository<Expense, UUID> {
    // Ek sorgular için metotlar yazabilirsiniz
}
