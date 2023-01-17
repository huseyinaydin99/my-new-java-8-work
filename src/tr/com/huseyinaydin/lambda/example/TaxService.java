package tr.com.huseyinaydin.lambda.example;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 @author Huseyin_Aydin
 @since 1994
 @category Java 8 New Features
 * 
 */

public class TaxService {

	public static List<Employee> evaluateTaxUsers(String input) {
		return (input.equalsIgnoreCase("tax"))
				? DataBase.getEmployees().stream().filter(emp -> emp.getSalary() > 500000).collect(Collectors.toList())
				: DataBase.getEmployees().stream().filter(emp -> emp.getSalary() <= 500000)
						.collect(Collectors.toList());

	}

	public static void main(String[] args) {
		System.out.println(evaluateTaxUsers("tax"));
	}
}
