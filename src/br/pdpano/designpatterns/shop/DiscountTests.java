package br.pdpano.designpatterns.shop;

import br.pdpano.designpatterns.shop.budget.Budget;
import br.pdpano.designpatterns.shop.discount.DiscountCalculator;
import br.pdpano.designpatterns.shop.tax.Icms;
import br.pdpano.designpatterns.shop.tax.Iss;
import br.pdpano.designpatterns.shop.tax.TaxCalculator;

import java.math.BigDecimal;

public class DiscountTests {
    public static void main(String[] args) {
        Budget budget1 = new Budget(new BigDecimal("200"), 6);
        Budget budget2 = new Budget(new BigDecimal("1000"), 1);
        DiscountCalculator calculator = new DiscountCalculator();
        System.out.printf("Orçamento 1: %s%n", calculator.calculate(budget1));
        System.out.printf("Orçamento 2: %s%n", calculator.calculate(budget2));
    }
}
