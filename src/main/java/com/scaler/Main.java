package com.scaler;

import com.scaler.greetings.Greeting;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        System.out.println(greeting.greet());
        System.out.println("Hello world!");
    }
    /**
     * (base) 88665a0eac26:java-scaler-01 ritanshk$ java -jar build/libs/java-scaler-01-1.0-SNAPSHOT.jar
     * Picked up JAVA_TOOL_OPTIONS: -Dlog4j2.formatMsgNoLookups=true
     * Good Evening
     * Hello world!
     */
}