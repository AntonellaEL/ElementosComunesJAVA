package dev.anto;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> lista1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> lista2 = Arrays.asList(4, 5, 6, 7, 8);

        List<Integer> elementosComunes = ElementosComunes.encontrarElementosComunes(lista1, lista2);

        System.out.println("Elementos duplicados: " + elementosComunes);
    }
}
