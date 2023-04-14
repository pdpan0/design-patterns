package br.com.pdpano.designpatterns.shop.domain.budget.status;

import br.com.pdpano.designpatterns.shop.domain.budget.Budget;
import br.com.pdpano.designpatterns.shop.domain.exceptions.InvalidStatusException;

import java.math.BigDecimal;

/**
    State Pattern
 */
public abstract class Status {
    public BigDecimal calculateDiscount(Budget budget) {
        return BigDecimal.ZERO;
    }

    public void approve(Budget budget) {
        throw new InvalidStatusException("Budget doesn't be approved");
    };

    public  void refuse(Budget budget) {
        throw new InvalidStatusException("Budget doesn't be refused");
    }

    public  void finalize(Budget budget) {
        throw new InvalidStatusException("Budget doesn't be finalized");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
