package Ex;

import java.util.List;
import java.util.stream.LongStream;

public class Fifth {
    public static Long Factorial(Integer num){
        return LongStream.rangeClosed(1, num)
                .reduce(1, (long a, long b) -> a*b);
    }

}
