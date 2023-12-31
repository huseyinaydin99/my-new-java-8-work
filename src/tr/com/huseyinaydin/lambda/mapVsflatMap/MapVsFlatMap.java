package tr.com.huseyinaydin.lambda.mapVsflatMap;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 @author Huseyin_Aydin
 @since 1994
 @category Java 8 New Features
 * 
 */

public class MapVsFlatMap {
    public static void main(String[] args) {

        List<Customer> customers = EkartDataBase.getAll();

        //List<Customer>  convert List<String> -> Veri dönüşümü müşteri listesinden String listesine
        //mapping : customer -> customer.getEmail()
        //customer -> customer.getEmail()  one to one mapping(bire bir eşleme)
        List<String> emails = customers.stream()
                .map(customer -> customer.getEmail())
                .collect(Collectors.toList());
        System.out.println(emails);

//customer -> customer.getPhoneNumbers()  ->> one to many mapping(bire çok eşleme)
        //customer -> customer.getPhoneNumbers()  ->> one to many mapping(bire çok eşleme)
        List<List<String>> phoneNumbers = customers.
                stream().map(customer -> customer.getPhoneNumbers())
                .collect(Collectors.toList());
        System.out.println(phoneNumbers);

        //List<Customer>  convert List<String> -> Veri dönüşümü müşteri listesinden String listesine
        //mapping : customer -> phone Numbers
        //customer -> customer.getPhoneNumbers()  ->> one to many mapping(bire çok eşleme)
        List<String> phones = customers.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println(phones);
    }
}
