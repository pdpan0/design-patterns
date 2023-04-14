package br.com.pdpano.designpatterns.shop.domain.budget;

import java.math.BigDecimal;

/**
 * Proxy Pattern
 */
public class BudgetProxy extends Budget {
    private BigDecimal value;
    private final Budget budget;

    public BudgetProxy(Budget budget) {
        this.budget = budget;
    }

    @Override
    public BigDecimal getValue() {
        return value == null ? this.value = budget.getValue() : this.value;
    }
}
