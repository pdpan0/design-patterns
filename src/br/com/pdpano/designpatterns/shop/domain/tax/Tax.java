package br.com.pdpano.designpatterns.shop.domain.tax;

import br.com.pdpano.designpatterns.shop.domain.budget.Budget;

import java.math.BigDecimal;

/*
    Decorators Pattern
 */
public abstract class Tax {
    private final Tax otherTax;

    public Tax(Tax otherTax) {
        this.otherTax = otherTax;
    }

    protected abstract BigDecimal calculation(Budget budget);

    public BigDecimal calculate(Budget budget) {
        final BigDecimal value = calculation(budget);
        final BigDecimal otherTaxValue = otherTax != null ?
                otherTax.calculate(budget) :
                BigDecimal.ZERO;
        return value.add(otherTaxValue);
    };
}
