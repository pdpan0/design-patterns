package br.pdpano.designpatterns.shop.budget;

import java.math.BigDecimal;

public class BudgetCalculator {
    public static BigDecimal multiply(Budget budget, BigDecimal rate) {
        return budget.getValue().multiply(rate);
    }
}
