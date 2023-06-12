package lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx6 {
	public static void main(String[] args) {
        // 문자열을 리턴하는 기능 구현
        Supplier<String> s = () -> "Hello, World!";
        String result1 = s.get();
        System.out.println(result1);

        // 문자열을 입력받아서 문자열의 길이가 0인지 판단하는 기능 구현
        Predicate<String> p = str -> str.length() == 0;
        boolean result2 = p.test("Hello");
        System.out.println(result2);

        // 문자열을 입력받아서 출력하는 기능 구현
        Consumer<String> c = str -> System.out.println(str);
        c.accept("Hello, World!");

        // 문자열을 입력받아서 정수로 리턴하는 기능 구현
        Function<String, Integer> f = str -> Integer.parseInt(str);
        Integer result4 = f.apply("42");
        System.out.println(result4);
	}
}
