package br.pdpano.designpatterns.shop.budget.status;

public class InvalidStatusException extends RuntimeException {
    public InvalidStatusException(String message) {
        super(message);
    }
}
