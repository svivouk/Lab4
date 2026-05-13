package Ex;

import java.util.List;
import java.util.OptionalDouble;

public class Second{
    public static OptionalDouble Averege(List<Integer> numbers){
        return numbers.stream()
                .mapToDouble(n-> n)
                .average();
    }
}
