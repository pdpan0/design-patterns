package br.com.pdpano.designpatterns.shop;

import br.com.pdpano.designpatterns.shop.domain.budget.Budget;
import br.com.pdpano.designpatterns.shop.domain.budget.BudgetRegister;
import br.com.pdpano.designpatterns.shop.domain.budget.BudgetItem;
import br.com.pdpano.designpatterns.shop.infra.http.HttpClient;

import java.math.BigDecimal;

public class AdapterTests {
    public static void main(String[] args) {
        final Budget budget = new Budget();
        budget.addItem(new BudgetItem(BigDecimal.TEN));
        budget.approve();
        budget.finalize();

        final BudgetRegister register = new BudgetRegister(new HttpClient());
        register.register(budget);
    }
}
