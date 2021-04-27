package me.best0167.java8to11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {

    public static void main(String[] args) {

        DefaultGreeting defaultGreeting = new DefaultGreeting("nika");
        defaultGreeting.printName();
        defaultGreeting.printNameUpperCase();

/*        // 임의 객체의 인스턴스 메소드 참조
        String[] names = {"Nika", "kani", "eric"};
        Arrays.sort(names, String::compareTo); // 자기 자신의 문자열과 파라미터로 받은 문자열을 비교하여 인트값을 넘겨준다.
        System.out.println(Arrays.toString(names));*/
                            //(o1, o2) -> 0);
                            /*new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return 0;
                    }
                });*/

                // 특정 객체의 인스턴스 메소드 참조
/*        Function<String, Greeting> NikaGreeting = Greeting::new;
        Greeting nika = NikaGreeting.apply("nika");
        System.out.println(nika.getName());

        Supplier<Greeting> newGreeting = Greeting::new;*/

        /*Supplier<Greeting> newGreeting = Greeting::new;
        Greeting greeting = newGreeting.get();*/

        /*Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello;
        System.out.println(hello.apply(" nika"));*/

                // 스태틱 메소드 참조
        /*UnaryOperator<String> hi = Greeting::hi;
        // UnaryOperator<String> hi = (s) -> "hi " + s;*/
    }
}
