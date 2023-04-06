package br.pdpano.designpatterns.shop.budget.status;

import br.pdpano.designpatterns.shop.budget.Budget;

public class RefusedStatus extends Status {
    @Override
    public void finalize(Budget budget) {
        budget.setStatus(new FinalizedStatus());
    }
}
