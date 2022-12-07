package StreamOperations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,6,5,4,8,9,56,4,7,88);
        Stream<Integer>stream=list.stream();
      //  System.out.println(stream.count());
       //here we can collect only even number using filter method..........
       // System.out.println(stream.filter(i->i%2==0).collect(Collectors.toList()));
       // list.stream().anyMatch(s->s.compareTo(1);
    }
}
