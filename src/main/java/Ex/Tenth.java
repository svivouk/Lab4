package Ex;

import java.util.List;
import java.util.Optional;

public class Tenth {
    public static void IsNullIn(List<String> withNull){
        Optional<String> firstLine = withNull.stream()
                .filter(a -> a != null && !a.trim().isEmpty())
                .findFirst();
        firstLine.ifPresentOrElse(
                line -> System.out.println("not null String: " + line),
                () -> System.out.println("can't find not null")
        );
    }
}
