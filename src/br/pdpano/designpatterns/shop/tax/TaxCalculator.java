package br.pdpano.designpatterns.shop.tax;

import br.pdpano.designpatterns.shop.budget.Budget;

import java.math.BigDecimal;

/**
    Strategy Pattern
 */
public class TaxCalculator {
    public BigDecimal calculate(Budget budget, Tax tax) {
        return tax.calculate(budget);
    }
}
