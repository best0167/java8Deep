package me.best0167.java8to11;

import java.util.function.*;

public class Foo {

    // 함수 밖의 있는 값을 참조하거나 변경하면 안된다. 오로지 함수 내부에서 쓰는 값. 전달받은 파라미터 값만 써야한다.
    public static void main(String[] args) {

        Foo foo = new Foo();
        foo.run();
    }

    private void run() {
        int baseNumber = 10; // effective final

/*        // 로컬 클래스
        class LocalClass {
            void printBaseNumber() {
                int baseNumber = 11;
                System.out.println(baseNumber);  // 11
            }
        }

        // 익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                int baseNumber = 12;
                System.out.println(baseNumber);
            }
        };*/

        // 람다. shadowing 이 일어나지 않는다.
        IntConsumer printInt = (i) -> { // 같은 scope(범위) 라서 baseNumber를 쓰지 못한다.
            System.out.println(i + baseNumber);
        };

        printInt.accept(10);
    }

    // BinaryOperator<Integer> sum = (a, b) -> a + b;

        /*// 입력하는 값과 리턴하는 값의 타입이 같으면 UnaryOperator 사용 가능
        UnaryOperator<Integer> plus10 = (i) -> i + 10;
        UnaryOperator<Integer> multiply2 = (i) -> i * 2;

        System.out.println((plus10.andThen(multiply2).apply((2))));*/

        /*// T 타입을 받아서 boolean 을 리턴
        Predicate<String> startsWithNika = (s) -> s.startsWith("Nika");
        Predicate<Integer> isEven = (i) -> i % 2 == 0;*/

        /*// 받아올 값을 정의
        Supplier<Integer> get10 = () -> 10;
        System.out.println(get10.get());*/

        /*Consumer<Integer> printT = (i) -> System.out.println(i);
        printT.accept(10);*/

        /*Function<Integer, Integer> plus10 = (i) -> i + 10;
        Function<Integer, Integer> multiply2 = (i) -> i * 2;

        System.out.println((plus10.andThen(multiply2).apply((2)))); // 먼저 + 10 후 * 2*/

        /*Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);// compose 는 입력값을 가지고 뒤에 오는 함수를 적용 +10.compose(*2). *2 한 값을 + 10
        System.out.println(multiply2AndPlus10.apply(2)); // 14*/

        /*Plus10 plus10 = new Plus10();*/
        /*System.out.println(plus10.apply(1));
        System.out.println(multiply2.apply(1));*/



        /*int baseNumber = 10;
        RunSomething runSomething = number -> number + baseNumber;
*/
        /*RunSomething runSomething = (number) -> number + 10;

        System.out.println(runSomething.doIt(1));
        System.out.println(runSomething.doIt(1));
        System.out.println(runSomething.doIt(1));

        System.out.println(runSomething.doIt(2));
        System.out.println(runSomething.doIt(2));
        System.out.println(runSomething.doIt(2));*/
    }
    /*    // 익명 내부 클래스
        RunSomething runSomething = () -> System.out.println("Hello");
        runSomething.doIt();
    }*/
//}
