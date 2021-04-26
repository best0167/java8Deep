package me.best0167.java8to11;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class App {

    public static void main(String[] args) {
        Greeting greeting = new Greeting();

        UnaryOperator<String> hi = Greeting::hi;
    }
}
