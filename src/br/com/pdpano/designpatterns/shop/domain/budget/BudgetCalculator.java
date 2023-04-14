package br.com.pdpano.designpatterns.shop.domain.budget;

import java.math.BigDecimal;

public class BudgetCalculator {
    public static BigDecimal multiply(Budget budget, BigDecimal rate) {
        return budget.getValue().multiply(rate);
    }
}
