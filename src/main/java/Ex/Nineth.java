package Ex;

import java.util.Arrays;

public class Nineth {
    public static long SpacesInString(String s){
        return Arrays.stream(s.split("\\s+"))
                .filter(word -> !word.isEmpty())
                .count();
    }
}
