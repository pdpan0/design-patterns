package br.pdpano.designpatterns.shop.order;

import java.math.BigDecimal;

public record SendOrder(String client, BigDecimal budgetValue, Integer quantityItems) {}
