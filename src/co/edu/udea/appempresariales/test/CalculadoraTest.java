package co.edu.udea.appempresariales.test;
import co.edu.udea.appempresariales.examples.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {
	Calculadora calculadora;//Refactor: extraer esta linea de código repetida en los test 1 y 2 y escribirla para el general junto con c y r
	int r;
	@Test
	public void add_1_1() {
		calculadora = new Calculadora(); //Arrange : qué debe tener la prueba
		r = calculadora.add(1,1);				//Act: Qué hará la prueba (el core)
		assertEquals(2,r);							//Assert: Resultado esperado vs. obtenido
	}
	
	@Test
	public void add_2_2() {
		calculadora = new Calculadora(); //Arrange : qué debe tener la prueba
		r = calculadora.add(2,2);				//Act: Qué hará la prueba (el core)
		assertEquals(4,r);							//Assert: Resultado esperado vs. obtenido
	}

}
