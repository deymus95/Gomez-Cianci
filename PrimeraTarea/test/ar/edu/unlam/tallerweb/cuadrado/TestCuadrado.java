package ar.edu.unlam.tallerweb.cuadrado;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCuadrado {

	@Test
	public void testPerimetro() {
		
		Cuadrado cua = new Cuadrado();
		
		assertEquals(20, cua.perimetro(5),0.01);
		
	}

}
