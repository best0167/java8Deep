package me.best0167.java8to11;

public interface GreetingInterface {

    void printName();

    default void printNameUpperCase() {
        System.out.println(getName().toUpperCase());
    }

    String getName();

}
