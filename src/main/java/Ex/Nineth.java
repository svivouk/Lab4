package Ex;

import java.util.Arrays;

public class Nineth {
    public static void SpacesInString(String s){
        long spaces = Arrays.stream(s.split("\\s+"))
                .filter(word -> !word.isEmpty())
                .count();
        System.out.println("Spaces in sentence: " + spaces);
    }
}
