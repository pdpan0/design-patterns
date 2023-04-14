package br.com.pdpano.designpatterns.shop;

import br.com.pdpano.designpatterns.shop.domain.budget.Budget;
import br.com.pdpano.designpatterns.shop.domain.budget.BudgetItem;
import br.com.pdpano.designpatterns.shop.domain.tax.Icms;
import br.com.pdpano.designpatterns.shop.domain.tax.Iss;
import br.com.pdpano.designpatterns.shop.domain.tax.TaxCalculator;

import java.math.BigDecimal;

public class TaxTests {
    public static void main(String[] args) {
        Budget budget = new Budget();
        budget.addItem(new BudgetItem(new BigDecimal("100")));
        TaxCalculator calculator = new TaxCalculator();
        System.out.printf("ICMS: %s%n", calculator.calculate(budget, new Icms(null)));
        System.out.printf("ISS: %s%n", calculator.calculate(budget, new Iss(new Icms(null))));
    }
}
