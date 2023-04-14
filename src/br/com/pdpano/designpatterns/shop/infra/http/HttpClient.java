package br.com.pdpano.designpatterns.shop.infra.http;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class HttpClient implements HttpAdapter {
    @Override
    public void send(String url, Map<String, Object> params) {
        try {
            final URL submissionUrl = new URL(url);
            final URLConnection connection = submissionUrl.openConnection();
            connection.connect();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
