package OPTIONAL;

import Map_FlateMap.customer;

import java.util.Arrays;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        // our old method by which we handle our null exceptions.......
        String str = null;
        if (str == null) {
            System.out.println("This is our our null....");
        } else {
            System.out.println(str.length());
        }

        // new method using optional...........
        String str2 = "shivendra";
        Optional<String> optional = Optional.ofNullable(str2);
        System.out.println(optional.isPresent());

        //  System.out.println(optional.get().length());
        System.out.println(optional.orElse("No value is present....."));
        System.out.println(optional.isEmpty());

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        customer customer=new customer(101, "john", "test@gmail.com", Arrays.asList("397937955", "21654725"));

        Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());
    }
}
