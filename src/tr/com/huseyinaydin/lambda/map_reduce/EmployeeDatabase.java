package tr.com.huseyinaydin.lambda.map_reduce;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 @author Huseyin_Aydin
 @since 1994
 @category Java 8 New Features
 * 
 */

public class EmployeeDatabase {


    public static List<Employee> getEmployees(){
      return  Stream.of(new Employee(101,"hüseyin","A",60000),
              new Employee(109,"ozan","B",30000),
              new Employee(102,"harun","A",80000),
              new Employee(103,"tolga","A",90000),
              new Employee(104,"yahya","C",15000))
              .collect(Collectors.toList());
    }
}
