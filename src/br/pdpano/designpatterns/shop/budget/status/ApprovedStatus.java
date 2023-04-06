package br.pdpano.designpatterns.shop.budget.status;

import br.pdpano.designpatterns.shop.budget.Budget;
import br.pdpano.designpatterns.shop.budget.BudgetCalculator;

import java.math.BigDecimal;

public class ApprovedStatus extends Status {
    @Override
    public BigDecimal calculateDiscount(Budget budget) {
        return BudgetCalculator.multiply(budget, new BigDecimal("0.02"));
    }

    @Override
    public void finalize(Budget budget) {
        budget.setStatus(new FinalizedStatus());
    }
}
