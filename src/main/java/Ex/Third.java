package Ex;

import java.util.Collections;
import java.util.List;

public class Third{
    public static void AplhOrder(List<String> words){
        Collections.sort(words, String::compareTo);
        System.out.println(words);
    }
}
