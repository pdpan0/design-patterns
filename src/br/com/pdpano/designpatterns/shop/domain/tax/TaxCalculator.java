package br.com.pdpano.designpatterns.shop.domain.tax;

import br.com.pdpano.designpatterns.shop.domain.budget.Budget;

import java.math.BigDecimal;

/**
    Strategy Pattern
 */
public class TaxCalculator {
    public BigDecimal calculate(Budget budget, Tax tax) {
        return tax.calculate(budget);
    }
}
