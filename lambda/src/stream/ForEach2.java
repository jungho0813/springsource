package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEach2 {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("A","B","C","D","E");
		
		// list.stream().forEach(null);
		list.forEach(item -> System.out.println(item));
		list.forEach(System.out::println);
		
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student("È«",99));
		stuList.add(new Student("±è",99));
		stuList.add(new Student("ÀÌ",79));
		stuList.add(new Student("¹Ú",69));
		
		stuList.forEach(student -> System.out.println(student.getName()+" : "+student.getJumsu()));
		
//		for (Student student2 : stuList) {
//			System.out.println(student2.getName()+" : "+student2.getJumsu());
//		}
		
		// Map
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 30);
		map.put("D", 40);
		map.put("E", 50);
		map.put("F", 60);
		map.put("G", 70);
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Item : " + entry.getKey()+", Count : "+entry.getValue());
		}
		
		
	}
}
