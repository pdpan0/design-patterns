package br.com.pdpano.designpatterns.shop;

import br.com.pdpano.designpatterns.shop.domain.budget.Budget;
import br.com.pdpano.designpatterns.shop.domain.budget.BudgetItem;
import br.com.pdpano.designpatterns.shop.domain.discount.DiscountCalculator;

import java.math.BigDecimal;

public class DiscountTests {
    public static void main(String[] args) {
        Budget budget1 = new Budget();
        budget1.addItem(new BudgetItem(new BigDecimal("200")));
        Budget budget2 = new Budget();
        budget2.addItem(new BudgetItem(new BigDecimal("1000")));
        DiscountCalculator calculator = new DiscountCalculator();
        System.out.printf("Orçamento 1: %s%n", calculator.calculate(budget1));
        System.out.printf("Orçamento 2: %s%n", calculator.calculate(budget2));
    }
}
