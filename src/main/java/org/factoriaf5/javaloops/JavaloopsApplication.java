package org.factoriaf5.javaloops;

import java.util.ArrayList;
import java.util.List;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class javaLoopsApplication {

	public List<Integer> tablaMultiplicar(int num) {
		List<Integer> resultList = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			int result = num * i;
			resultList.add(result);
		}
		return resultList;
	}
}
