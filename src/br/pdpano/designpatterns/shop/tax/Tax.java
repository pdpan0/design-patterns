package br.pdpano.designpatterns.shop.tax;

import br.pdpano.designpatterns.shop.budget.Budget;

import java.math.BigDecimal;

public interface Tax {
    BigDecimal calculate(Budget budget);
}
