package br.com.pdpano.designpatterns.shop.domain.budget;

import java.math.BigDecimal;

public class BudgetItem implements Budgetable {
    private final BigDecimal value;

    public BudgetItem(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }
}
