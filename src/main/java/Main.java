import Ex.*;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        
        List<String> words = Arrays.asList( "One", "Two", "Three", "Four", "five", "Six", "Seven", "Am");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        String s = "Really cool sentence yay";
        List<String> withNull = Arrays.asList(" ",null, "awdskla", "dksal" );
        Integer num = 10;

//1 Використовуючи лямбда-вираз, відфільтрувати непарні числа зі списку цілих чисел
        System.out.println(First.oddNums(numbers));
//2 Використовуючи лямбда-вираз, знайти середнє зі списку дійсних значень
        System.out.println(Second.Averege(numbers));
//3 Використовуючи лямбда-вираз для сортування списку рядків в алфавітному порядку
        Third.AplhOrder(words);
//4 Використовуючи лямбда-вираз для обчислення суми всіх парних чисел
       System.out.println(Fourth.SumOfEven(numbers));
//5 Використовуючи лямбда-вираз, обчислити факторіал заданого числа
        System.out.println(Fifth.Factorial(num));
//6 За допомогою лямбда-виразу розрахуйте множення та підсумовування всіх елементів у
//списку цілих чисел
        System.out.println("Sum: " + Sixth.sum(numbers));
        System.out.println("Multiply: " + Sixth.mult(numbers));
//7 За допомогою лямбда-виразу, розрахуйте квадрат кожного числа у списку цілих чисел
        System.out.println(Seventh.Square(numbers));
//8 Використовуючи лямбда-вираз для сортування рядків на основі їх довжини в порядку
//зростання
        System.out.println(Eighth.OrderByLength(words));
//9 За допомогою лямбда-виразу підрахуйте кількість слів у реченні (слова розділені
//пробілами)
       System.out.println(Nineth.SpacesInString(s));
//10. Використовуючи лямбда-вираз, знайти перший непорожній рядок у списку рядків
        Tenth.IsNullIn(withNull).ifPresentOrElse(
                line -> System.out.println("not null String: " + line),
                () -> System.out.println("can't find not null")
        );
//11. За допомогою лямбда-виразу перевірити, чи всі рядки у списку починаються з великої
//літери
        if(Eleventh.isBigLetters(words)){
            System.out.println("All words start with big letter");
        }
        else {
            System.out.println("All words do not start with big letter");
        }
//12. Використовуючи лямбда-вираз, знайти друге за величиною число в списку цілих чисел
        System.out.println(Twelfth.SecondBiggestNum(numbers));

//13. Використовуючи лямбда-вираз, знайти найбільше парне число в списку цілих чисел
        System.out.println(Thirteenth.maxEven(numbers));
    }
}