package br.com.pdpano.designpatterns.shop;

import br.com.pdpano.designpatterns.shop.domain.budget.Budget;
import br.com.pdpano.designpatterns.shop.domain.budget.BudgetItem;
import br.com.pdpano.designpatterns.shop.domain.budget.BudgetProxy;

import java.math.BigDecimal;

public class BudgetTests {
    public static void main(String[] args) {
        Budget oldBudget = new Budget();
        oldBudget.addItem(new BudgetItem(new BigDecimal("200")));

        Budget newBudget = new Budget();
        newBudget.addItem(new BudgetItem(new BigDecimal("500")));
        newBudget.addItem(oldBudget);

        BudgetProxy proxy = new BudgetProxy(newBudget);

        System.out.println(proxy.getValue());
        System.out.println(proxy.getValue());
    }
}
