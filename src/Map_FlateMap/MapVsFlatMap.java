package Map_FlateMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {

        List<customer> customers = EkartDataBases.getAll();

        //List<Customer>  convert List<String> -> Data Transformation
        //mapping : customer -> customer.getEmail()
        //customer -> customer.getEmail()  one to one mapping
               List<String> emails  =customers.stream()
                       .map(customer -> customer.getEmail())
                       .collect(Collectors.toList());
        System.out.println(emails);

//customer -> customer.getPhoneNumbers()  ->> one to many mapping
        //customer -> customer.getPhoneNumbers()  ->> one to many mapping
      List<List<String>> phone_numbers=customers.stream()
              .map(customer -> customer.getPhoneNumbers())
              .collect(Collectors.toList());
        System.out.println(phone_numbers);

        //List<Customer>  convert List<String> -> Data Transformation
        //mapping : customer -> phone Numbers
        //customer -> customer.getPhoneNumbers()  ->> one to many mapping
        List<String> phones = customers.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println(phones);

        // bhaiya ki class ke codes....
        List<String> list=customers.stream()
                .map(customer -> customer.getName())
                .collect(Collectors.toList());
           System.out.println(list);

    }
}
