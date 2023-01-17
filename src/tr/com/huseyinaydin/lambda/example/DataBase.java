package tr.com.huseyinaydin.lambda.example;

import java.util.ArrayList;
import java.util.List;
//DAO layer

/**
 * 
 @author Huseyin_Aydin
 @since 1994
 @category Java 8 New Features
 * 
 */

public class DataBase {

	public static List<Employee> getEmployees() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(176, "Hüseyin", "IT", 600000));
		list.add(new Employee(388, "Hasan", "CIVIL", 900000));
		list.add(new Employee(470, "Ahmet", "DEFENCE", 500000));
		list.add(new Employee(624, "Nurettin", "CORE", 400000));
		list.add(new Employee(176, "Osman", "SOCIAL", 1200000));
		return list;
	}

}
