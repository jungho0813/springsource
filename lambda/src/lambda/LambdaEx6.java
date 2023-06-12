package lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx6 {
	public static void main(String[] args) {
        // ���ڿ��� �����ϴ� ��� ����
        Supplier<String> s = () -> "Hello, World!";
        String result1 = s.get();
        System.out.println(result1);

        // ���ڿ��� �Է¹޾Ƽ� ���ڿ��� ���̰� 0���� �Ǵ��ϴ� ��� ����
        Predicate<String> p = str -> str.length() == 0;
        boolean result2 = p.test("Hello");
        System.out.println(result2);

        // ���ڿ��� �Է¹޾Ƽ� ����ϴ� ��� ����
        Consumer<String> c = str -> System.out.println(str);
        c.accept("Hello, World!");

        // ���ڿ��� �Է¹޾Ƽ� ������ �����ϴ� ��� ����
        Function<String, Integer> f = str -> Integer.parseInt(str);
        Integer result4 = f.apply("42");
        System.out.println(result4);
	}
}
