import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest2  {

	
	/*
	 * Prueba que compruebe que, utilizando el método correspondiente,
	 * se obtiene el valor límite de máxima capacidad del depósito
	 */
	@Test
	public void testGetDepositoMax() {
		DepositoCombustible tank = new DepositoCombustible(45.0,20.0);
		assertEquals(45, tank.getDepositoMax(),0);
	}

}
