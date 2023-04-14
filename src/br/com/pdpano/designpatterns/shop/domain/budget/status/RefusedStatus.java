package br.com.pdpano.designpatterns.shop.domain.budget.status;

import br.com.pdpano.designpatterns.shop.domain.budget.Budget;

public class RefusedStatus extends Status {
    @Override
    public void finalize(Budget budget) {
        budget.setStatus(new FinalizedStatus());
    }
}
