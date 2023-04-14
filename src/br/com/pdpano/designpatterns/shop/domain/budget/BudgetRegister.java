package br.com.pdpano.designpatterns.shop.domain.budget;

import br.com.pdpano.designpatterns.shop.domain.exceptions.FlowException;
import br.com.pdpano.designpatterns.shop.infra.http.HttpAdapter;

import java.util.Map;

public class BudgetRegister {
    private final HttpAdapter http;

    public BudgetRegister(HttpAdapter http) {
        this.http = http;
    }

    public void register(Budget budget) {
        if (!budget.isFinished()) {
           throw new FlowException("Budget should be finished");
        }

        final String url = "http://to-do/budget";
        final Map<String, Object> params = Map.of();

        http.send(url, params);
    }
}
