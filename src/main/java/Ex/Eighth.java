package Ex;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Eighth {
    public static List<String> OrderByLength(List<String> words){
        return words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

    }
}
