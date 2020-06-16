package projeto;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Teste {
	
	@Test
	public void testSomaComValoresPositivos() {
		Principal principal = new Principal();
		int valorSoma = principal.somar(5, 10);
		assertEquals(valorSoma, 15);		
	}
	
	@Test
	public void testSomaComValoresNegativos() {
		Principal principal = new Principal();
		int valorSoma = principal.somar(5, -10);
		assertEquals(valorSoma, -5);
	}
	
	@Test
	public void testSomaDoubleComValoresPositivos() {
		Principal principal = new Principal();
		double valorSoma = principal.somarDouble(5.0, 10.0);
		assertEquals(valorSoma, 15.0, 0.001);
	}
	
	@Test
	public void testSomaDoubleComValoresNegativos() {
		Principal principal = new Principal();
		double valorSoma = principal.somarDouble(5.0, -10.0);
		assertEquals(valorSoma, -5.0, 0.001);
	}
}
