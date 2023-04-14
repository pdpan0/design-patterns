package br.com.pdpano.designpatterns.shop.infra.http;

import java.util.Map;

/*
    Adapters Pattern
 */
public interface HttpAdapter {
    void send(String url, Map<String, Object> params);
}
