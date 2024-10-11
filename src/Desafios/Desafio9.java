package Desafios;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Set<Integer> numerosVistos = new HashSet<>();

        boolean temRepetidos = numeros.stream()
        .anyMatch(n->!numerosVistos.add(n));
        
        System.out.println(temRepetidos ? "Existem números repetidos na lista." : "Não há números repetidos na lista.");

    }
}
