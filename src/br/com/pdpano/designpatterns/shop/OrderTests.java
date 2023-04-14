package br.com.pdpano.designpatterns.shop;

import br.com.pdpano.designpatterns.shop.usecase.actions.GenerateInvoiceAction;
import br.com.pdpano.designpatterns.shop.usecase.actions.OrderLogger;
import br.com.pdpano.designpatterns.shop.usecase.actions.SendEmailAction;
import br.com.pdpano.designpatterns.shop.domain.order.*;
import br.com.pdpano.designpatterns.shop.usecase.SendOrderHandler;

import java.math.BigDecimal;

public class OrderTests {
    public static void main(String[] args) {
        final String client = "Lucas";
        final BigDecimal budgetValue = new BigDecimal("600");

        SendOrder sendOrder = new SendOrder(client, budgetValue);
        SendOrderHandler sendOrderHandler = new SendOrderHandler(
                new SendEmailAction(),
                new GenerateInvoiceAction(),
                new OrderLogger()
        );

        sendOrderHandler.execute(sendOrder);
    }
}
