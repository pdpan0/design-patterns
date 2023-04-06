package br.pdpano.designpatterns.shop.order;

import br.pdpano.designpatterns.shop.budget.Budget;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

/**
 * Command Pattern
 */
public class SendOrderHandler implements Execute<SendOrder> {
    /* Observer Pattern */
    private final List<Execute<Order>> actions;

    @SafeVarargs
    public SendOrderHandler(Execute<Order>... actions) {
        this.actions = Arrays.stream(actions).toList();
    }

    @Override
    public void execute(SendOrder input) {
        final Budget budget = new Budget(input.budgetValue(), input.quantityItems());
        final Order order = new Order(input.client(), LocalDateTime.now(), budget);
        actions.forEach(action -> action.execute(order));
    }

}
