package Ex;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Twelfth {
    public static void SecondBiggestNum(List<Integer>numbers){
        Optional<Integer> secondBiggest = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(secondBiggest);
    }
}
