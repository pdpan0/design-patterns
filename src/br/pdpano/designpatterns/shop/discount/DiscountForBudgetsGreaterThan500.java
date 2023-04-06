package br.pdpano.designpatterns.shop.discount;

import br.pdpano.designpatterns.shop.budget.Budget;
import br.pdpano.designpatterns.shop.budget.BudgetCalculator;

import java.math.BigDecimal;

public class DiscountForBudgetsGreaterThan500 extends Discount {
    public DiscountForBudgetsGreaterThan500(Discount next) {
        super(next);
    }

    @Override
    protected BigDecimal apply(Budget budget) {
        return BudgetCalculator.multiply(budget, new BigDecimal("0.1"));
    }

    @Override
    protected Boolean validate(Budget budget) {
        return budget.getValue().compareTo(new BigDecimal("500")) > 0;
    }
}
