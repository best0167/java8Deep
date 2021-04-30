package me.best0167.java8to11;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("nika");
        names.add("kani");
        names.add("eric");
        names.add("foo");

/*        List<String> collect = names.stream().map((s) -> {
            System.out.println(s + " " + Thread.currentThread().getName());
            return s.toUpperCase();
        }).collect(Collectors.toList());
        collect.forEach(System.out::println);

        *//*List<String> collect = names.parallelStream().map((s) -> {
            System.out.println(s + " " + Thread.currentThread().getName());
            return s.toUpperCase();
        }).collect(Collectors.toList());
        collect.forEach(System.out::println);*//*

        // parallelStream() 을 쓰면 JVM 이 알아서 spliterator 로 병렬적으로 처리해준다.
        // 데이터가 정말 방대할 경우엔 유용.
*//*        List<String> collect = names.parallelStream().map(String::toUpperCase)
                .collect(Collectors.toList());*//*

        collect.forEach(System.out::println);*/

/*        // Stream<String> stringStream = names.stream().map(String::toUpperCase);

        List<String> collect = names.stream().map((s) -> {
            System.out.println(s);
            return s.toUpperCase();
        }).collect(Collectors.toList());
        collect.forEach(System.out::println);

        System.out.println("===============");

        names.forEach(System.out::println);*/

/*        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        names.sort(compareToIgnoreCase.reversed());

        *//*names.sort(String::compareToIgnoreCase);*//*

        names.forEach(System.out::println);*/

        /*names.removeIf(s -> s.startsWith("k"));

        names.forEach(System.out::println);
        *//*nika
        eric
        foo*/

        /*Set<String> k = names.stream().map(String::toUpperCase)
                .filter(s -> s.startsWith("K")) // K 로 시작하는것만 남겨서
                .collect(Collectors.toSet());*/ // KANI

        /*long k = names.stream().map(String::toUpperCase)
                .filter(s -> s.startsWith("K")) // K 로 시작하는것만 남겨서
                .count();*/  // 1

        /*System.out.println(k);*/


/*        Spliterator<String> spliterator = names.spliterator();
        Spliterator<String> spliterator1 = spliterator.trySplit();
        while (spliterator.tryAdvance(System.out::println));
        System.out.println("==================");
        while (spliterator1.tryAdvance(System.out::println));*/

        /*   names.forEach(System.out::println);*/

        /*name.forEach(s -> {
                    System.out.println(s);
                };*/

    /*  for (String n: names) {
            System.out.println(n);
        }*/

        /*DefaultGreeting defaultGreeting = new DefaultGreeting("nika");
        defaultGreeting.printName();
        defaultGreeting.printNameUpperCase();

        DefaultGreeting.printAnything();*/

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
