package me.best0167.java8to11;

public class DefaultGreeting implements GreetingInterface, Bar {

    String name;

    public DefaultGreeting(String name) {
        this.name = name;
    }

/*    @Override
    public void printNameUpperCase() {
        System.out.println(this.name.toUpperCase());
    }*/

    // @implSpec. 이 구현체는 getName() 으로 가져온 문자열을 대문자로 바꿔 출력한다.
    @Override
    public void printName() {
        /*System.out.println("DefaultFoo");*/
        System.out.println(this.name);
    }

    @Override
    public void printNameUpperCase() {
        GreetingInterface.super.printNameUpperCase();
    }

    static void printAnything() {
        System.out.println("DefaultGreeting");
    }

    @Override
    public String getName() {
        return this.name;
    }


}
