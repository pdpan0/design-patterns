package br.com.pdpano.designpatterns.shop.usecase;

import br.com.pdpano.designpatterns.shop.domain.budget.Budget;
import br.com.pdpano.designpatterns.shop.domain.budget.BudgetItem;
import br.com.pdpano.designpatterns.shop.domain.order.Order;
import br.com.pdpano.designpatterns.shop.domain.order.SendOrder;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

/**
 * Command Pattern
 */
public class SendOrderHandler implements Command<SendOrder> {
    /* Observer Pattern */
    private final List<Command<Order>> actions;

    @SafeVarargs
    public SendOrderHandler(Command<Order>... actions) {
        this.actions = Arrays.stream(actions).toList();
    }

    @Override
    public void execute(SendOrder input) {
        final Budget budget = new Budget();
        budget.addItem(new BudgetItem(input.budgetValue()));
        final Order order = new Order(input.client(), LocalDateTime.now(), budget);
        actions.forEach(action -> action.execute(order));
    }

}
