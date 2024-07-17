package dev.anto;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ElementosComunes {
    
    public static List<Integer> encontrarElementosComunes(List<Integer> lista1, List<Integer> lista2) {
        Set<Integer> conjunto1 = new HashSet<>(lista1);
        Set<Integer> conjunto2 = new HashSet<>(lista2);

        conjunto1.retainAll(conjunto2);

        return new ArrayList<>(conjunto1);
    }
}
