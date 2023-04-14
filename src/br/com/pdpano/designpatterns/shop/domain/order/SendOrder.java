package br.com.pdpano.designpatterns.shop.domain.order;

import java.math.BigDecimal;

/**
 * Facade Pattern
 */
public record SendOrder(String client, BigDecimal budgetValue) {}
