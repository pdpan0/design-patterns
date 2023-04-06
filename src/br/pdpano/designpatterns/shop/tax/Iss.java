package br.pdpano.designpatterns.shop.tax;

import br.pdpano.designpatterns.shop.budget.Budget;
import br.pdpano.designpatterns.shop.budget.BudgetCalculator;

import java.math.BigDecimal;

public class Iss implements Tax {
    @Override
    public BigDecimal calculate(Budget budget) {
        return BudgetCalculator.multiply(budget, new BigDecimal("0.6"));
    }
}
