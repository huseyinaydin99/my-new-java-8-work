package tr.com.huseyinaydin.lambda.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import tr.com.huseyinaydin.lambda.example.Employee;

/**
 * 
 @author Huseyin_Aydin
 @since 1994
 @category Java 8 New Features
 * 
 */

public class SortMapDemo {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("eight", 8);
		map.put("four", 4);
		map.put("ten", 10);
		map.put("two", 2);

		Map<Employee, Integer> employeeMap = new TreeMap<>((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));
		employeeMap.put(new Employee(176, "Hüseyin", "IT", 600000), 60);
		employeeMap.put(new Employee(388, "Bilal", "CIVIL", 900000), 90);
		employeeMap.put(new Employee(470, "Mehmet", "DEFENCE", 500000), 50);
		employeeMap.put(new Employee(624, "Fevzi", "CORE", 400000), 40);
		employeeMap.put(new Employee(284, "Samet", "SOCIAL", 1200000), 120);

		System.out.println(employeeMap);

		List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
		Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

		/*
		 * for (Entry<String, Integer> entry : entries) {
		 * System.out.println(entry.getKey() + "   " + entry.getValue()); }
		 */

		// map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("****************************");
		// map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

		employeeMap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept).reversed()))
				.forEach(System.out::println);

	}
}
