package Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {
public static void main(String[] args) {
     List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 4, 3);

     numeros.stream()
               .filter(n -> n > 10)
               .findAny()  
               .ifPresentOrElse(
                   n -> numeros.stream().filter(x -> x > 10).forEach(System.out::println), 
                   () -> System.out.println("Não tem número maior que 10")
               );
     
}
}
