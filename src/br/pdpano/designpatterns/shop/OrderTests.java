package br.pdpano.designpatterns.shop;

import br.pdpano.designpatterns.shop.actions.GenerateInvoiceAction;
import br.pdpano.designpatterns.shop.actions.SendEmailAction;
import br.pdpano.designpatterns.shop.order.*;

import java.math.BigDecimal;

public class OrderTests {
    public static void main(String[] args) {
        final String client = "Lucas";
        final BigDecimal budgetValue = new BigDecimal("600");
        final Integer quantityItems = 4;

        SendOrder sendOrder = new SendOrder(client, budgetValue, quantityItems);
        SendOrderHandler sendOrderHandler = new SendOrderHandler(
                new SendEmailAction(), new GenerateInvoiceAction()
        );

        sendOrderHandler.execute(sendOrder);
    }
}
