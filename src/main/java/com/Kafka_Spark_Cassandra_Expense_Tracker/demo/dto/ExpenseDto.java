package com.Kafka_Spark_Cassandra_Expense_Tracker.demo.dto;

public class ExpenseDto {
    private int user_id;
    private double total_payment;

    // Getters and Setters
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public double getTotal_payment() {
        return total_payment;
    }

    public void setTotal_payment(double total_payment) {
        this.total_payment = total_payment;
    }

    @Override
    public String toString() {
        return "ExpenseDto{" +
                "user_id=" + user_id +
                ", total_payment=" + total_payment +
                '}';
    }
}