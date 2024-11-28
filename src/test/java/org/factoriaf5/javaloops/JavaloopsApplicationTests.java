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
class JavaLoopsApplicationTests {

		// la siguientes 5 líneas instancia una sola vez para todos los test que se hagan después
	private JavaLoopsApplication javaLoops;
	@BeforeEach
    public void init() {
        this.javaLoops = new JavaLoopsApplication(); 
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
