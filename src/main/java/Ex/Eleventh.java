package Ex;

import java.util.List;

public class Eleventh {
    public static void isBigLetters(List<String> words){
        boolean BigLetter = words.stream()
                .allMatch(w -> w != null && !w.isEmpty() && Character.isUpperCase(w.charAt(0)));
        if(BigLetter){
            System.out.println("All words start with big letter");
        }
        else {
            System.out.println("All words do not start with big letter");
        }
    }

}
