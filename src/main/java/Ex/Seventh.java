package Ex;

import java.util.List;
import java.util.stream.Collectors;

public class Seventh {
    public static List<Integer> Square(List<Integer>numbers){
         return numbers.stream()
                .map(n -> n*n)
                .collect(Collectors.toList());
    }
}
