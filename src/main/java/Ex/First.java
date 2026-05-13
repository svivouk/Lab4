package Ex;

import java.util.List;
import java.util.stream.Collectors;

public class First {
    public static List<Integer> oddNums(List<Integer> numbers){
        return numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
    }
}
