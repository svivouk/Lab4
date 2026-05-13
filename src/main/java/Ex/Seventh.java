package Ex;

import java.util.List;
import java.util.stream.Collectors;

public class Seventh {
    public static void Square(List<Integer>numbers){
        List<Integer> square = numbers.stream()
                .map(n -> n*n)
                .collect(Collectors.toList());
        System.out.println(square);
    }
}
