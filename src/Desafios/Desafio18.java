package Desafios;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import java.util.stream.Collectors;

public class Desafio18 {
public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 4, 3);

      List<Integer> duplicados = numeros.stream()
                .filter(n -> Collections.frequency(numeros, n) > 1)
                .distinct()  
                .collect(Collectors.toList());
                System.out.println(duplicados);
}
        
}
