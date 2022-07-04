package com.savload.thread;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * @author shili
 * @Classname Test_1
 * @Date 2021/7/30 15:22
 * @Description
 */
public class Test_1 {
    public static void main(String[] args) {
        var request = HttpRequest.newBuilder()
                .uri(URI.create("https://winterbe.com"))
                .GET()
                .build();
        var client = HttpClient.newHttpClient();
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(response.body());
    }
}
