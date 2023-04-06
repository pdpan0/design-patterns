package br.pdpano.designpatterns.shop;

import br.pdpano.designpatterns.shop.budget.Budget;

import java.math.BigDecimal;

public class StatusTests {
    public static void main(String[] args) {
        final Budget budget = new Budget(new BigDecimal("500"), 1);
        budget.applyDiscount();
        System.out.printf("Discounted by in analysis: %s%n", budget);
        budget.approve();
        budget.applyDiscount();
        System.out.printf("Discounted by in approved: %s%n", budget);
        budget.finalize();
        System.out.printf("No discount in finalized: %s%n", budget);
        final Budget budget1 = new Budget(new BigDecimal("200"), 2);
        budget1.refuse();
        System.out.printf("No discount in refused: %s%n", budget1);
    }
}
