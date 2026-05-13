package Ex;

import java.util.List;

public class Sixth {
    public static void sum(List<Integer> numbers){
        int sum = numbers.stream()
                .reduce(0 ,(a, b)-> a+b);
        System.out.println("Sum: " + sum);
    }
    public static void mult(List<Integer> numbers){
        int mult = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("Mult: " + mult);
    }
}
