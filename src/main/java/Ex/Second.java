package Ex;

import java.util.List;

public class Second{
    public static void Averege(List<Integer> numbers){
        java.util.OptionalDouble avg = numbers.stream()
                .mapToDouble(n-> n)
                .average();
        System.out.println("Avg: " + avg);
    }
}
