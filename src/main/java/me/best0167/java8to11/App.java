package me.best0167.java8to11;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2, "spring data jpa", true));
        springClasses.add(new OnlineClass(3, "spring mvc", false));
        springClasses.add(new OnlineClass(4, "spring core", false));
        springClasses.add(new OnlineClass(5, "rest spi development", false));

        System.out.println("spring 으로 시작하는 수업");
        // TODO
        springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .forEach(oc -> System.out.println(oc.getId()));


        System.out.println("close 되지 않은 수업");
        // TODO

        System.out.println("수업 이름만 모아서 스트림 만들기");
        // TODO

        List<OnlineClass> javaClasses = new ArrayList<>();
        javaClasses.add(new OnlineClass(6, "The Java, Test", true));
        javaClasses.add(new OnlineClass(7, "The Java, Code manipulation", true));
        javaClasses.add(new OnlineClass(8, "The Java, 8 to 11", false));

        List<List<OnlineClass>> nikaEvents = new ArrayList<>();
        nikaEvents.add(springClasses);
        nikaEvents.add(javaClasses);

        System.out.println("spring 으로 시작하는 수업");
        // TODO

        System.out.println("close 되지 않은 수업");
        // TODO

        System.out.println("수업 이름만 모아서 스트림 만들기");
        // TODO

        System.out.println("두 수업 목록에 들어있는 모든 수업 아이디 출력");
        // TODO

        System.out.println("10부터 1씩 증가하는 무제한 스트림 중에서 앞에 10개 빼고 최대 10개 까지만");
        // TODO

        System.out.println("자바 수업 중에 Test가 들어있는 수업이 있는지 확인");
        // TODO

        System.out.println("스프링 수업 중에 제목에 spring이 들어간 것만 모아서 List로 만들기");
        // TODO

        /*List<String> names = new ArrayList<>();
        names.add("nika");
        names.add("kani");
        names.add("eric");
        names.add("foo");*/

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
