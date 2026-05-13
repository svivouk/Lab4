package Ex;

import java.util.List;
import java.util.stream.Collectors;

public class Eighth {
    public static List<String> OrderByLength(List<String> words){
        return words.stream()
                .sorted((a, b) -> Integer.compare(a.length(), b.length()))
                .collect(Collectors.toList());

    }
}
