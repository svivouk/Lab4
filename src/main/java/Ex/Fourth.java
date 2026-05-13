package Ex;

import java.util.List;

public class Fourth{
    public static void SumOfEven(List<Integer> numbers){
        Integer EvenSum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n->n)
                .sum();
        System.out.println("Sum of even nums: " + EvenSum);
    }
}
