package com.Kafka_Spark_Cassandra_Expense_Tracker.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table("expenses")
public class Expense {
    @PrimaryKey
    private UUID uuid;
    private double date_time;
    private String description;
    private double payment;
    private int user_id;

    // Getters and Setters
    public UUID getUuid() { return uuid; }
    public void setUuid(UUID uuid) { this.uuid = uuid; }

    public double getDateTime() { return date_time; }
    public void setDateTime(double date_time) { this.date_time = date_time; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getPayment() { return payment; }
    public void setPayment(double payment) { this.payment = payment; }

    public int getUserId() { return user_id; }
    public void setUserId(int user_id) { this.user_id = user_id; }
}
