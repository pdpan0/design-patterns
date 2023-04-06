package br.pdpano.designpatterns.shop.discount;

import br.pdpano.designpatterns.shop.budget.Budget;

import java.math.BigDecimal;

/**
    Chain of Responsibility Pattern
 */
public class DiscountCalculator {
    public BigDecimal calculate(Budget budget) {
        final Discount discount = new DiscountForBudgetThatHasMoreThanFiveItems(
                new DiscountForBudgetsGreaterThan500(
                        new NoDiscount()
                )
        );

        return discount.calculate(budget);
    }
}
