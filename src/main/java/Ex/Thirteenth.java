package Ex;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Thirteenth {
    public static Optional<Integer> maxEven(List<Integer> numbers){
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .max(Comparator.naturalOrder());
    }
}
