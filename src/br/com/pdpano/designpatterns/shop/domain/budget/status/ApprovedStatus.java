package br.com.pdpano.designpatterns.shop.domain.budget.status;

import br.com.pdpano.designpatterns.shop.domain.budget.Budget;
import br.com.pdpano.designpatterns.shop.domain.budget.BudgetCalculator;

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
