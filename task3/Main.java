import java.util.*;
//import java.util.stream.Stream;

import static java.util.Locale.filter;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        // Отфильтровываем положительные числа
        List<Integer> positiveNumbers = new ArrayList<>();
        for (Integer num : intList) {
            if (num > 0) {
                positiveNumbers.add(num);
            }
        }

        // Находим среди положительных чисел четные
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer num : positiveNumbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }

        // Сортируем четные числа в порядке возрастания
        Collections.sort(evenNumbers);

        // Выводим результат на экран
        for (Integer num : evenNumbers) {
            System.out.print(num + " ");
        }



    }
}
