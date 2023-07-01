package com.scaler;

import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.IOException;

public class Client {
    private OkHttpClient client;

    public Client() {
        client = new OkHttpClient();
    }

    public String getData(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        return client.newCall(request).execute().body().string();
    }
}
