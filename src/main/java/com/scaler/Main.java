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
     * java -jar build/libs/java-scaler-01-1.0-SNAPSHOT.jar
     *
     * Picked up JAVA_TOOL_OPTIONS: -Dlog4j2.formatMsgNoLookups=true
     * Good Evening
     * Hello world!
     */

    /**
     * Fat Jar Issue:
     *
     * java -jar build/libs/java-scaler-01-1.0-SNAPSHOT.jar
     *
     * Picked up JAVA_TOOL_OPTIONS: -Dlog4j2.formatMsgNoLookups=true
     * Good Night
     * Hello world!
     * Exception in thread "main" java.lang.NoClassDefFoundError: okhttp3/OkHttpClient
     * 	at com.scaler.Client.<init>(Client.java:12)
     * 	at com.scaler.Main.main(Main.java:12)
     * Caused by: java.lang.ClassNotFoundException: okhttp3.OkHttpClient
     * 	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:606)
     * 	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:168)
     * 	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:522)
     * 	... 2 more
     */
}