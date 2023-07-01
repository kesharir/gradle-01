package com.scaler;

import com.scaler.greetings.Greeting;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Greeting greeting = new Greeting();
        System.out.println(greeting.greet());
        System.out.println("Hello world!");
        Client client = new Client();
        String data = client.getData("https://square.github.io/okhttp/");
        System.out.println("Data : " + data);
    }
    /**
     * (base) 88665a0eac26:java-scaler-01 ritanshk$ java -jar build/libs/java-scaler-01-1.0-SNAPSHOT.jar
     * Picked up JAVA_TOOL_OPTIONS: -Dlog4j2.formatMsgNoLookups=true
     * Good Evening
     * Hello world!
     */
}