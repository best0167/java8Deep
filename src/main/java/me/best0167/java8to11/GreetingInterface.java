package me.best0167.java8to11;

public interface GreetingInterface {

    void printName();

    default void printNameUpperCase() {
        System.out.println(getName().toUpperCase());
    }

    /*default String toString() {  //  Object 클래스의 메소드는 재정의할 수 없다.

    }*/

    String getName();

}
