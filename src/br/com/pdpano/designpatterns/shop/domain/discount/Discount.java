package br.com.pdpano.designpatterns.shop.domain.discount;

import br.com.pdpano.designpatterns.shop.domain.budget.Budget;

import java.math.BigDecimal;

public abstract class Discount {
    protected Discount next;

    public Discount(Discount next) {
        this.next = next;
    }

    public BigDecimal calculate(Budget budget) {
        return validate(budget) ? apply(budget) : next.calculate(budget);
    }

    protected abstract BigDecimal apply(Budget budget);
    protected abstract Boolean validate(Budget budget);


}
