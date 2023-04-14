package br.com.pdpano.designpatterns.shop.domain.discount;

import br.com.pdpano.designpatterns.shop.domain.budget.Budget;

import java.math.BigDecimal;

public class NoDiscount extends Discount {
    public NoDiscount() {
        super(null);
    }

    @Override
    protected BigDecimal apply(Budget budget) {
        return BigDecimal.ZERO;
    }

    @Override
    protected Boolean validate(Budget budget) {
        return true;
    }
}
