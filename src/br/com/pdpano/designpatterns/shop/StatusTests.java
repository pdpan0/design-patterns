package br.com.pdpano.designpatterns.shop;

import br.com.pdpano.designpatterns.shop.domain.budget.Budget;
import br.com.pdpano.designpatterns.shop.domain.budget.BudgetItem;

import java.math.BigDecimal;

public class StatusTests {
    public static void main(String[] args) {
        final Budget budget = new Budget();
        budget.addItem(new BudgetItem(new BigDecimal("200")));
        budget.applyDiscount();
        System.out.printf("Discounted by in analysis: %s%n", budget);
        budget.approve();
        budget.applyDiscount();
        System.out.printf("Discounted by in approved: %s%n", budget);
        budget.finalize();
        System.out.printf("No discount in finalized: %s%n", budget);
        final Budget budget1 = new Budget();
        budget1.addItem(new BudgetItem(new BigDecimal("300")));
        budget1.refuse();
        System.out.printf("No discount in refused: %s%n", budget1);
    }
}
