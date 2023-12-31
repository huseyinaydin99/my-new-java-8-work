package tr.com.huseyinaydin.lambda.Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * 
 @author Huseyin_Aydin
 @since 1994
 @category Java 8 New Features
 * 
 */

public class OptionalDemo {



    public static Customer getCustomerByEmailId(String email) throws Exception {
        List<Customer> customers = EkartDataBase.getAll();
       return customers.stream()
                .filter(customer -> customer.getEmail().equals(email))
                .findAny().orElseThrow(()->new Exception("Böyle bir e posta adresi yok."));

    }

    public static void main(String[] args) throws Exception {

        Customer customer=new Customer(101, "hüseyin", "test@gmail.com", Arrays.asList("397937955", "21654725"));

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        //Optional<String> emailOptional = Optional.of(customer.getEmail());
        //System.out.println(emailOptional);

        Optional<Optional<String>> emailOptional2 = Optional.ofNullable(customer.getEmail());
       /* if(emailOptional2.isPresent()){
            System.out.println(emailOptional2.get());
        }*/
       // System.out.println(emailOptional2.orElse("default@email.com"));

       // System.out.println(emailOptional2.orElseThrow(()->new IllegalArgumentException("e-posta mevcut değil")));


        System.out.println(emailOptional2.get().map(String::toUpperCase).orElseGet(()->"varsayılan email..."));

        getCustomerByEmailId("pqr");
    }
}
