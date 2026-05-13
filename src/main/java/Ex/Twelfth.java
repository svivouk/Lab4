package Ex;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Twelfth {
    public static Optional<Integer> SecondBiggestNum(List<Integer>numbers){
         return numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
    }
}
