package Ex;

import java.util.List;

public class Eleventh {
    public static boolean isBigLetters(List<String> words){
        return words.stream()
                .allMatch(w -> w != null && !w.isEmpty() && Character.isUpperCase(w.charAt(0)));
    }

}
