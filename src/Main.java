
import java.util.Map;
import java.util.HashMap;

/*
1. Напишите программу, используя HashMap, чтобы подсчитать частоту каждого символа в строке.
Метод получает строку в качестве аргумента и возвращает HashMap где в качестве ключа символ, а в качестве значения - кол-во повторений.

2. Создайте класс CachingSqrt. Этот класс имеет статический метод sqrt, который получает в качестве аргумента число и возвращает квадрат этого числа.
Помимо этого должно быть статическое свойство cache, которое хранит все значения, с которыми был вызван sqrt и все результаты.

3. Добавьте к классу CachingSqrt метод cacheSqrt который при вызове проверяет, есть ли в кеше соответствующее значение,
если есть, то не высчитывает квадрат, а возвращает результат из кеша.
 */


public class Main {
    public static void main(String[] args) {
        //FrequencyCounter
        String inputString = "programmer";
        HashMap<Character, Integer> frequencyMap = FrequencyCounter.countFrequency(inputString);
        System.out.println("Frequency of each character in '" + inputString + "': " + frequencyMap);

        // CachingSqrt
        double number1 = 16.0;
        double number2 = 25.0;

        CachingSqrt.cacheSqrt(number1);
        CachingSqrt.cacheSqrt(number2);
        CachingSqrt.cacheSqrt(number1); // Значение уже в кеше
    }
}