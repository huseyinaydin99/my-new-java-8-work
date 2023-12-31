package tr.com.huseyinaydin.lambda.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * 
 @author Huseyin_Aydin
 @since 1994
 @category Java 8 New Features
 * 
 */

public class SupplierDemo {

	public static void main(String[] args) {


		List<String> list1 = Arrays.asList();

		System.out.println(list1.stream().findAny().orElseGet(() -> "Merhaba"));
	}
}
