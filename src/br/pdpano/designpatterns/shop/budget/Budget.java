package br.pdpano.designpatterns.shop.budget;

import br.pdpano.designpatterns.shop.budget.status.AnalysisStatus;
import br.pdpano.designpatterns.shop.budget.status.Status;

import java.math.BigDecimal;

public class Budget {
    private BigDecimal value;
    private Integer quantityItems;
    private Status status;

    public Budget(BigDecimal value, Integer quantityItems) {
        this.value = value;
        this.quantityItems = quantityItems;
        this.status = new AnalysisStatus();
    }

    public BigDecimal getValue() {
        return value;
    }

    public Integer getQuantityItems() {
        return quantityItems;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void applyDiscount() {
        BigDecimal discount = this.status.calculateDiscount(this);
        this.value = this.value.subtract(discount);
    }

    public void approve() {
        this.status.approve(this);
    }

    public void refuse() {
        this.status.refuse(this);
    }

    public void finalize() {
        this.status.finalize(this);
    }

    @Override
    public String toString() {
        return "Budget{" +
                "value=" + value +
                ", quantityItems=" + quantityItems +
                ", status=" + status +
                '}';
    }
}
