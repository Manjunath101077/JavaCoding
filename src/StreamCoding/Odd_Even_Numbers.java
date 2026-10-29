package StreamCoding;

import java.util.Arrays;
import java.util.List;

public class Odd_Even_Numbers {

    public static void Odd_Even_Numbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
    }

}
