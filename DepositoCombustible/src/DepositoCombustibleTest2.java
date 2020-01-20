import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest2  {

	
	/*
	 * Prueba que compruebe que, utilizando el m�todo correspondiente,
	 * se obtiene el valor l�mite de m�xima capacidad del dep�sito
	 */
	@Test
	public void testGetDepositoMax() {
		DepositoCombustible tank = new DepositoCombustible(45.0,20.0);
		assertEquals(45, tank.getDepositoMax(),0);
	}

}
