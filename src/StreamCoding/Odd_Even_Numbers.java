package StreamCoding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Odd_Even_Numbers {

    public static void Odd_Even_Numbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);

        numbers.stream().filter(number -> number % 2 == 0).forEach(a -> System.out.println(a));

        Predicate<Integer> isEven = number -> number % 2 == 0;
        numbers.stream().filter(isEven).forEach(System.out::println);

        Map<Boolean,List<Integer>> map = numbers.stream().collect(Collectors.partitioningBy(isEven));
        System.out.println(map.get(true).stream().collect(Collectors.summingInt(Integer::intValue)));

    }

}
