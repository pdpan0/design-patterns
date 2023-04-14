package br.com.pdpano.designpatterns.shop.domain.discount;

import br.com.pdpano.designpatterns.shop.domain.budget.Budget;

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
