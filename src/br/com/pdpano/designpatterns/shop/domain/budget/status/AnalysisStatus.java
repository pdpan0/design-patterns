package br.com.pdpano.designpatterns.shop.domain.budget.status;

import br.com.pdpano.designpatterns.shop.domain.budget.Budget;
import br.com.pdpano.designpatterns.shop.domain.budget.BudgetCalculator;

import java.math.BigDecimal;


public class AnalysisStatus extends Status {
    @Override
    public BigDecimal calculateDiscount(Budget budget) {
        return BudgetCalculator.multiply(budget, new BigDecimal("0.05"));
    }

    @Override
    public void approve(Budget budget) {
        budget.setStatus(new ApprovedStatus());
    }

    @Override
    public void refuse(Budget budget) {
        budget.setStatus(new RefusedStatus());
    }
}
