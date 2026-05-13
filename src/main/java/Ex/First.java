package Ex;

import java.util.List;
import java.util.stream.Collectors;

public class First {
    public static void oddNums(List<Integer> numbers){
        List<Integer> oddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("Odd numbers: " + oddNumbers);
    }
}
