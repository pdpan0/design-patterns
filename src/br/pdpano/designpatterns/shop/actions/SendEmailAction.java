package br.pdpano.designpatterns.shop.actions;

import br.pdpano.designpatterns.shop.order.Execute;
import br.pdpano.designpatterns.shop.order.Order;

public class SendEmailAction implements Execute<Order> {
    @Override
    public void execute(Order input) {
        System.out.println("Sending email");
    }
}
