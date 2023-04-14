package br.com.pdpano.designpatterns.shop.domain.budget;

import br.com.pdpano.designpatterns.shop.domain.budget.status.AnalysisStatus;
import br.com.pdpano.designpatterns.shop.domain.budget.status.FinalizedStatus;
import br.com.pdpano.designpatterns.shop.domain.budget.status.Status;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Composite Pattern
 */
public class Budget implements Budgetable {
    private BigDecimal value;
    private Status status;
    private final List<Budgetable> items;

    public Budget() {
        this.value = BigDecimal.ZERO;
        this.status = new AnalysisStatus();
        this.items = new ArrayList<>();
    }

    public BigDecimal getValue() {
        try {
            Thread.sleep(2000L);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return value;
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

    public boolean isFinished() {
        return this.status instanceof FinalizedStatus;
    }

    public Integer getItemsQuantity() {
        return items.size();
    }

    public void addItem(Budgetable item) {
        this.value = value.add(item.getValue());
        this.items.add(item);
    }

    @Override
    public String toString() {
        return "Budget{" +
                "value=" + value +
                ", status=" + status +
                ", items=" + items +
                '}';
    }
}
