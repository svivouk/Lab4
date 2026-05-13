package Ex;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Thirteenth {
    public static void maxEven(List<Integer> numbers){
        Optional<Integer> maxEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .max(Comparator.naturalOrder());
        System.out.println(maxEven);
    }
}
