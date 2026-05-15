import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Main {
    public static List<String> OrderByLength(List<String> words){
        return words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

    }
    public static Integer sum(List<Integer> numbers){
        return numbers.stream()
                .reduce(0 ,Integer::sum);
    }
    public static Integer mult(List<Integer> numbers){
        return numbers.stream()
                .reduce(1, (a, b) -> a * b);
    }
    public static OptionalDouble Averege(List<Integer> numbers){
        return numbers.stream()
                .mapToDouble(n-> n)
                .average();
    }
    public static Optional<String> IsNullIn(List<String> withNull){
        return withNull.stream()
                .filter(a -> a != null && !a.trim().isEmpty())
                .findFirst();

    }
    public static long SpacesInString(String s){
        return Arrays.stream(s.split("\\s+"))
                .filter(word -> !word.isEmpty())
                .count();
    }

    public static boolean isBigLetters(List<String> words){
        return words.stream()
                .allMatch(w -> w != null && !w.isEmpty() && Character.isUpperCase(w.charAt(0)));
    }

    public static Long Factorial(Integer num){
        return LongStream.rangeClosed(1, num)
                .reduce(1, (long a, long b) -> a*b);
    }

    public static List<Integer> oddNums(List<Integer> numbers){
        return numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
    }

    public static Integer SumOfEven(List<Integer> numbers){
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n->n)
                .sum();
    }

    public static List<Integer> Square(List<Integer>numbers){
        return numbers.stream()
                .map(n -> n*n)
                .collect(Collectors.toList());
    }

    public static void AlphOrder(List<String> words){
        Collections.sort(words, String::compareTo);
        System.out.println(words);
    }

    public static Optional<Integer> maxEven(List<Integer> numbers){
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .max(Comparator.naturalOrder());
    }

    public static Optional<Integer> SecondBiggestNum(List<Integer>numbers){
        return numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
    }
    public static void main(String[] args) {
        
        List<String> words = Arrays.asList( "One", "Two", "Three", "Four", "five", "Six", "Seven", "Am");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        String s = "Really cool sentence yay";
        List<String> withNull = Arrays.asList(" ",null, "awdskla", "dksal" );
        Integer num = 10;

//1 Використовуючи лямбда-вираз, відфільтрувати непарні числа зі списку цілих чисел
        System.out.println(oddNums(numbers));
//2 Використовуючи лямбда-вираз, знайти середнє зі списку дійсних значень
        System.out.println(Averege(numbers));
//3 Використовуючи лямбда-вираз для сортування списку рядків в алфавітному порядку
        AlphOrder(words);
//4 Використовуючи лямбда-вираз для обчислення суми всіх парних чисел
       System.out.println(SumOfEven(numbers));
//5 Використовуючи лямбда-вираз, обчислити факторіал заданого числа
        System.out.println(Factorial(num));
//6 За допомогою лямбда-виразу розрахуйте множення та підсумовування всіх елементів у
//списку цілих чисел
        System.out.println("Sum: " + sum(numbers));
        System.out.println("Multiply: " + mult(numbers));
//7 За допомогою лямбда-виразу, розрахуйте квадрат кожного числа у списку цілих чисел
        System.out.println(Square(numbers));
//8 Використовуючи лямбда-вираз для сортування рядків на основі їх довжини в порядку
//зростання
        System.out.println(OrderByLength(words));
//9 За допомогою лямбда-виразу підрахуйте кількість слів у реченні (слова розділені
//пробілами)
       System.out.println(SpacesInString(s));
//10. Використовуючи лямбда-вираз, знайти перший непорожній рядок у списку рядків
        IsNullIn(withNull).ifPresentOrElse(
                line -> System.out.println("not null String: " + line),
                () -> System.out.println("can't find not null")
        );
//11. За допомогою лямбда-виразу перевірити, чи всі рядки у списку починаються з великої
//літери
        if(isBigLetters(words)){
            System.out.println("All words start with big letter");
        }
        else {
            System.out.println("All words do not start with big letter");
        }
//12. Використовуючи лямбда-вираз, знайти друге за величиною число в списку цілих чисел
        System.out.println(SecondBiggestNum(numbers));

//13. Використовуючи лямбда-вираз, знайти найбільше парне число в списку цілих чисел
        System.out.println(maxEven(numbers));
    }
}