package br.com.pdpano.designpatterns.shop.usecase;

public interface Command<T> {
    void execute(T input);
}
