package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Desafio17 {
public static void main(String[] args) {
     List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 4, 3);

    List<Integer> numerosPrimos = numeros.stream()
    .filter(Desafio17::isPrime)
    .collect(Collectors.toList());
    System.out.println(numerosPrimos);

}

  private static boolean isPrime(int number) {
        if (number < 2) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(n -> number % n == 0);
    }
}
