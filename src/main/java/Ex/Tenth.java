package Ex;

import java.util.List;
import java.util.Optional;

public class Tenth {
    public static Optional<String> IsNullIn(List<String> withNull){
        return withNull.stream()
                .filter(a -> a != null && !a.trim().isEmpty())
                .findFirst();

    }
}
