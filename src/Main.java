import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//        numbers.stream().
//        List<Integer> numbers = Arrays.asList(10, 100, 20, 12, 50);
//        numbers.stream()
//                .filter(a->a%2==0)
//                .forEach(System.out::println);
//        int maximumElement = numbers.stream()
//                .max(Integer::compareTo)
//                .orElse(0);
//        System.out.println(maximumElement);
//        numbers.stream()
//                .sorted(Comparator.reverseOrder())
//                .forEach(System.out::println);
//        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie");
//        names.stream().filter(a->a.startsWith("A")).count();
//        String input = "swiss";
//        input.chars().map(a->(char) a)
//                .filter(a->input.indexOf(a)==input.lastIndexOf(a))
//                .forEach(System.out::println);
//        List<String> names = Arrays.asList("java", "stream", "api");
//        names.stream().map(a -> a.toUpperCase()).forEach(System.out::println);
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        int nums=numbers.stream().reduce(0, (a,b)->a+b);
//        System.out.println(nums);
//        List<String> strings = Arrays.asList("Java", "Stream API", "Lambda");
//        boolean result = strings.stream().anyMatch(s -> s.contains("API"));
////        System.out.println(result);
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 1);
//        numbers.stream()
//                .collect(Collectors.groupingBy(a->a, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(e -> e.getValue() == 2)
//                .forEach(System.out::println);
//        List<String> words = Arrays.asList("Java", "Stream", "API", "Development");
//        words.stream().reduce((words1, words2) -> words1 + " " +words2).ifPresent(System.out::println);
//        words.stream().reduce((word1, word2) -> word1.length() > word2.length() ?word1:word2).ifPresent(System.out::println);
//        String input = "success";
//        input.chars()
//                .mapToObj(c->(char) c)
//                .collect(Collectors.groupingBy(a -> a, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .forEach(System.out::println);




    }
}