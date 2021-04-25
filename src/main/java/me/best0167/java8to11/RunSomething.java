package me.best0167.java8to11;

@FunctionalInterface
public interface RunSomething {

    int doIt(int number);

    //void doIt(); // abstract 생략. 추상메소드가 functional method

    // void doAgain(); // compile 오류난다.

    /*static void printName() {
        System.out.println("Nika");
    }

    default void printAge() {
        System.out.println("29");
    }*/

}
