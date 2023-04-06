package br.pdpano.designpatterns.shop.discount;

import br.pdpano.designpatterns.shop.budget.Budget;
import br.pdpano.designpatterns.shop.budget.BudgetCalculator;

import java.math.BigDecimal;

public class DiscountForBudgetThatHasMoreThanFiveItems extends Discount {
    public DiscountForBudgetThatHasMoreThanFiveItems(Discount next) {
        super(next);
    }

    @Override
    protected BigDecimal apply(Budget budget) {
        return BudgetCalculator.multiply(budget, new BigDecimal("0.1"));
    }

    @Override
    protected Boolean validate(Budget budget) {
        return budget.getQuantityItems() > 5;
    }
}
