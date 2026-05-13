package Ex;

import java.util.List;

public class Fourth{
    public static Integer SumOfEven(List<Integer> numbers){
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n->n)
                .sum();
    }
}
