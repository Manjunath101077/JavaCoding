package StreamCoding;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static jdk.nashorn.internal.objects.NativeArray.forEach;

public class CodingQuestions {
    public static void Filter_And_Sort() {

        System.out.println("Filter_And_Sort");


        List<Integer> numbers =
                Arrays.asList(10, 5, 20, 15, 30, 25);

        numbers.stream().filter(a->a>15)
                .sorted(Comparator.reverseOrder())
                .forEach(n -> System.out.print(n + " "));
        System.out.println("");
        System.out.println("Filter_And_Sort end");
    }

    public static void MaxmimNumberInAList() {
        System.out.println("MaxmimNumberInAList");

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        numbers.stream().max(Integer::compareTo).ifPresent(System.out::print);
        numbers.stream().sorted(Comparator.reverseOrder()).findFirst().ifPresent(System.out::print);
        System.out.println("");
        System.out.println("MaxmimNumberInAList End");
    }

    public static void Odd_Even_Numbers() {
        System.out.println("Odd_Even_Numbers");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.stream().filter(number -> number % 2 == 0).forEach(n -> System.out.print(n + " "));;

        numbers.stream().filter(number -> number % 2 == 0).forEach(a -> System.out.print(a));

        Predicate<Integer> isEven = number -> number % 2 == 0;
        numbers.stream().filter(isEven) .forEach(n -> System.out.print(n + " "));

        Map<Boolean,List<Integer>> map = numbers.stream().collect(Collectors.partitioningBy(isEven));
        System.out.print(map.get(true).stream().collect(Collectors.summingInt(Integer::intValue)));
        System.out.println("");
        System.out.println("Odd_Even_Numbers End");
    }

    public static void Square_And_Sum() {
        System.out.println("Square_And_Sum");

        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5);

       int a1= numbers.stream().mapToInt(a->a*a).sum();
        System.out.println(""+a1);
        System.out.println("Square_And_Sum End");
    }
    public static void Names_Starting_with_A() {
//        System.out.println("Names_Starting_with_A");
        List<String> names =
                Arrays.asList("Alex", "John", "Andrew", "Bob", "Alice");
        System.out.println("Names_Starting_with_A");
        names.stream().filter(a->a.startsWith("A")).forEach(n -> System.out.print(n + " "));

        System.out.println("Names_Starting_with_A End");
        System.out.println("");
    }

    public static void Find_Duplicate_Elements() {
        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6);
        System.out.println("Find_Duplicate_Elements");
        numbers.stream().distinct().forEach(n -> System.out.print(n + " "));
        System.out.println("");
        System.out.println("Find_Duplicate_Elements End");
    }

    public  static void Second_Highest_Number() {
        System.out.println("Second_Highest_Number");
        List<Integer> numbers =
                Arrays.asList(10, 20, 30, 40, 50, 50, 40);
        numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::print);

        System.out.println("");
        System.out.println("Second_Highest_Number End");
    }
    public static void Employee_Filtering() {
        System.out.println("Employee_Filtering");
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Manjunath", "IT", 85000.0),
                new Employee(2, "Ravi", "IT", 75000.0),
                new Employee(3, "Amit", "HR", 60000.0),
                new Employee(4, "Priya", "Finance", 90000.0),
                new Employee(5, "Megha", "HR", 70000.0),
                new Employee(6, "Mahesh", "IT", 95000.0),
                new Employee(7, "Mohan", "Finance", 65000.0),
                new Employee(8, "Kiran", "Admin", 45000.0)
        );
        employees.stream().filter(employee -> employee.getSalary()>50000)
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .map(Employee::getName)
                .forEach(System.out::println);
        System.out.println("Employee_Filtering End");
        System.out.println("");
    }
    public static void Character_Frequency() {
        System.out.println("Character_Frequency");
        String input = "programming";
        input.chars().mapToObj(a->(char)a)
                .collect(Collectors.groupingBy(
                        a->a,Collectors.counting()
                )).entrySet().stream()
                .forEach(System.out::println);

    }

    public static void Group_Employees_by_Department() {
        System.out.println("Group_Employees_by_Department");
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Manjunath", "IT", 85000.0),
                new Employee(2, "Ravi", "IT", 75000.0),
                new Employee(3, "Amit", "HR", 60000.0),
                new Employee(4, "Priya", "Finance", 90000.0),
                new Employee(5, "Megha", "HR", 70000.0),
                new Employee(6, "Mahesh", "IT", 95000.0),
                new Employee(7, "Mohan", "Finance", 65000.0),
                new Employee(8, "Kiran", "Admin", 45000.0)
        );

//       Map<String,List<Employee>> employeesByDepartment =
        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment)).
                entrySet().stream().forEach(System.out::println);
    System.out.println("Group_Employees_by_Department End");
        System.out.println("");
    }

    public static void Highest_Paid_Employee_in_Each_Department(){
        System.out.println("Highest_Paid_Employee_in_Each_Department");
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Manjunath", "IT", 85000.0),
                new Employee(2, "Ravi", "IT", 75000.0),
                new Employee(3, "Amit", "HR", 60000.0),
                new Employee(4, "Priya", "Finance", 90000.0),
                new Employee(5, "Megha", "HR", 70000.0),
                new Employee(6, "Mahesh", "IT", 95000.0),
                new Employee(7, "Mohan", "Finance", 65000.0),
                new Employee(8, "Kiran", "Admin", 45000.0)
        );

        Map<String, String> result =employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment
                        ,Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                                employee -> employee.get().getName()
                        )
                ));
        System.out.println(result);
        System.out.println("Highest_Paid_Employee_in_Each_Department End");
    }

    public static void partitioningBy_even_odd(){
        System.out.println("partitioningBy_even_odd");
        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6);

        Map<Boolean,List<Integer>> odd_even=numbers.stream()
                .collect(Collectors.partitioningBy(number -> number % 2 == 0));
        System.out.println(odd_even);


    }
}
