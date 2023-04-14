package br.com.pdpano.designpatterns.shop.usecase.actions;

import br.com.pdpano.designpatterns.shop.usecase.Command;
import br.com.pdpano.designpatterns.shop.domain.order.Order;

public class SendEmailAction implements Command<Order> {
    @Override
    public void execute(Order input) {
        System.out.println("Sending email");
    }
}
