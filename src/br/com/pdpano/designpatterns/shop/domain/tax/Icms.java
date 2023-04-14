package br.com.pdpano.designpatterns.shop.domain.tax;

import br.com.pdpano.designpatterns.shop.domain.budget.Budget;
import br.com.pdpano.designpatterns.shop.domain.budget.BudgetCalculator;

import java.math.BigDecimal;

public class Icms extends Tax {
    public Icms(Tax otherTax) {
        super(otherTax);
    }

    @Override
    protected BigDecimal calculation(Budget budget) {
        return BudgetCalculator.multiply(budget, new BigDecimal("0.1"));
    }
}
