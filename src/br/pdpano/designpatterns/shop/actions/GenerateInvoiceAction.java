package br.pdpano.designpatterns.shop.actions;

import br.pdpano.designpatterns.shop.order.Execute;
import br.pdpano.designpatterns.shop.order.Order;

public class GenerateInvoiceAction implements Execute<Order> {
    @Override
    public void execute(Order input) {
        System.out.println("Generating invoice");
    }
}
