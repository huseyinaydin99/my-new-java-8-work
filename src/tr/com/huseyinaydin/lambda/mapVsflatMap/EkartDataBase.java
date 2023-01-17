package tr.com.huseyinaydin.lambda.mapVsflatMap;

import java.util.Arrays;
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

public class EkartDataBase {


    public static List<Customer> getAll() {
        return Stream.of(
                new Customer(101, "hüseyin", "huso@gmail.com", Arrays.asList("397937955", "21654725")),
                new Customer(102, "ahmet", "ahmet@gmail.com", Arrays.asList("89563865", "2487238947")),
                new Customer(103, "ayturan", "ayturan@gmail.com", Arrays.asList("38946328654", "3286487236")),
                new Customer(104, "ömer", "omer@gmail.com", Arrays.asList("389246829364", "948609467"))
        ).collect(Collectors.toList());
    }


}
