package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio14 {
public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    Optional<Integer> maiorNumeroPrimo = numeros.stream()
    .filter(Desafio14::isPrime)
    .max(Integer::compareTo);

    System.out.println(maiorNumeroPrimo);

    
}

public static boolean isPrime(int number) {
    if (number <= 1) return false;
    if (number == 2) return true;  
    if (number % 2 == 0) return false;  
    int sqrt = (int) Math.sqrt(number);
    for (int i = 3; i <= sqrt; i += 2) { 
        if (number % i == 0) return false;
    }
    return true;
}
}
