package br.pdpano.designpatterns.shop;

import br.pdpano.designpatterns.shop.budget.Budget;
import br.pdpano.designpatterns.shop.tax.Icms;
import br.pdpano.designpatterns.shop.tax.Iss;
import br.pdpano.designpatterns.shop.tax.TaxCalculator;

import java.math.BigDecimal;

public class TaxTests {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"), 1);
        TaxCalculator calculator = new TaxCalculator();
        System.out.printf("ICMS: %s%n", calculator.calculate(budget, new Icms()));
        System.out.printf("ISS: %s%n", calculator.calculate(budget, new Iss()));
    }
}
