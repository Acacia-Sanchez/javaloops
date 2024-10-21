package org.factoriaf5.javaloops;

//import org.assertj.core.internal.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class javaLoopsApplicationTests {

		// la siguientes 5 líneas instancia una sola vez para todos los test que se hagan después
	private javaLoopsApplication javaLoops;
	@BeforeEach
    public void init() {
        this.javaLoops = new javaLoopsApplication(); 
    }
		// aquí termina la instanciación de una sola vez


	@Test
	public void testTablaMultiplicarDel5() {
		int num = 5;
		List<Integer> resultList = javaLoops.tablaMultiplicar(num);
		List<Integer> tablaList = Arrays.asList(5, 10, 15, 20, 25, 30, 35, 40, 45, 50);
		assertEquals(tablaList, resultList);

	}

}

/*
 * Crea un programa que dado un número entero, n, imprima su tabla de
 * multiplicar (del 1 al 10). (No es necesaria la salida por terminal)
 * Cada múltiplo n * i (donde 1 <= i => 10) debe imprimirse en una nueva línea
 * en la forma: n x i = resultado. ( tabla de multiplicación)
 * 
 * Ejemplo: dado n = 5
 * 
 * Output:
 * 5 x 1 = 5
 * 5 x 2 = 10
 * 5 x 3 = 15
 * 5 x 4 = 20
 * 5 x 5 = 25
 * 5 x 6 = 30
 * 5 x 7 = 35
 * 5 x 8 = 40
 * 5 x 9 = 45
 * 5 x 10 = 50
 */