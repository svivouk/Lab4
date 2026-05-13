package Ex;

import java.util.List;
import java.util.stream.LongStream;

public class Fifth {
    public static void Factorial(Integer num){
        Long factorial = LongStream.rangeClosed(1, num)
                .reduce(1, (long a, long b) -> a*b);
        System.out.println("Factorial " + num +": " + factorial);
    }

}
