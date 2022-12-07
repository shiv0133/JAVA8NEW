package StreamOperations;

import java.util.Arrays;
import java.util.List;

public class Intermediate_Terminal {
    public static void main(String[] args) {

        List<String>list =Arrays.asList("Ram","raja","sara","rahul");
        long count=list.stream().distinct().distinct().count();
        System.out.println(count);
    }
}
