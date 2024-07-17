package dev.anto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

public class ElementosComunesTest {

    @Test
    public void testEncontrarElementosComunes() {
        List<Integer> lista1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> lista2 = Arrays.asList(3, 4, 5, 6, 7);
        
        List<Integer> resultadoEsperado = Arrays.asList(3, 4, 5);
        List<Integer> resultadoObtenido = ElementosComunes.encontrarElementosComunes(lista1, lista2);
        
        assertEquals(resultadoEsperado, resultadoObtenido, "hay elementos comunes");
    }

    @Test
    public void testEncontrarElementosComunesSinElementosComunes() {
        List<Integer> lista1 = Arrays.asList(1, 2, 3);
        List<Integer> lista2 = Arrays.asList(4, 5, 6);
        
        List<Integer> resultadoEsperado = Arrays.asList();
        List<Integer> resultadoObtenido = ElementosComunes.encontrarElementosComunes(lista1, lista2);
        
        assertEquals(resultadoEsperado, resultadoObtenido, "No hay elementos comunes");
    }

 
}
