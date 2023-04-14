package br.com.pdpano.designpatterns.shop.domain.order;

import br.com.pdpano.designpatterns.shop.domain.budget.Budget;

import java.time.LocalDateTime;

public class Order {
    private String client;
    private LocalDateTime createdAt;
    private Budget budget;

    public Order(String client, LocalDateTime createdAt, Budget budget) {
        this.client = client;
        this.createdAt = createdAt;
        this.budget = budget;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }
}
