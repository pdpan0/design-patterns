package br.com.pdpano.designpatterns.shop.usecase.actions;

import br.com.pdpano.designpatterns.shop.domain.order.Order;
import br.com.pdpano.designpatterns.shop.usecase.Command;

public class OrderLogger implements Command<Order> {
    @Override
    public void execute(Order input) {
        System.out.println("Order generated " + input.toString());
    }
}
