package stream;

import java.util.Arrays;
import java.util.List;

public class StreamEx3 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("���","����","�ٳ���","���","��","����");
		
		list.stream().skip(2).limit(3).forEach(System.out::println);
		
		
		
	}
}
