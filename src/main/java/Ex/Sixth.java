package Ex;

import java.util.List;

public class Sixth {
    public static Integer sum(List<Integer> numbers){
        return numbers.stream()
                .reduce(0 ,Integer::sum);
    }
    public static Integer mult(List<Integer> numbers){
        return numbers.stream()
                .reduce(1, (a, b) -> a * b);
    }
}
