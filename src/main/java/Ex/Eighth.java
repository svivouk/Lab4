package Ex;

import java.util.List;
import java.util.stream.Collectors;

public class Eighth {
    public static void OrderByLength(List<String> words){
        List<String> inLengthASC = words.stream()
                .sorted((a, b) -> Integer.compare(a.length(), b.length()))
                .collect(Collectors.toList());
        System.out.println(inLengthASC);
    }
}
