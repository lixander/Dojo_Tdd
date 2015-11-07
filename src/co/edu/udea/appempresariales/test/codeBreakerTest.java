package co.edu.udea.appempresariales.test;

import static org.junit.Assert.*;

import org.junit.Test;

import co.edu.udea.appempresariales.examples.CodeBreaker;

public class codeBreakerTest {

	
	CodeBreaker codeBreaker;
	String numero;
	String resp;
	@Test
	public void adivina1_1() {
		codeBreaker = new CodeBreaker();
		 numero = "3184";
		 resp = codeBreaker.adivinarNumero(numero);
		assertEquals("xxxx",resp);
	}
	
	
	@Test
	public void adivina1_2() {
		codeBreaker = new CodeBreaker();
		 numero = "2756";
		 resp = codeBreaker.adivinarNumero(numero);
		assertEquals("",resp);
	}
	
	@Test
	public void adivina1_3() {
		codeBreaker = new CodeBreaker();
		 numero = "3148";
		 resp = codeBreaker.adivinarNumero(numero);
		assertEquals("xx__",resp);
	}

}
