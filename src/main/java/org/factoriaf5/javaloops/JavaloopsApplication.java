package org.factoriaf5.javaloops;

import java.util.ArrayList;
import java.util.List;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaLoopsApplication {

	public List<Integer> tablaMultiplicar(int num) {
		List<Integer> resultList = new ArrayList<>();
		System.out.println("\n Tabla de multiplicar del " + num);
		for (int i = 1; i <= 10; i++) {
			int result = num * i;
			resultList.add(result);
			System.out.println();
			System.out.println("    " + num + " * " + i + " = " + result);
			System.out.println();
		}
		return resultList;
	}
}