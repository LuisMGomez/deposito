import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest  {

	/* Prueba para comprobar que funciona el método para saber
	 * si el depósito está vacío.*/	
	@Test
	public void testEstaVacio() {
		DepositoCombustible tank  = new DepositoCombustible(40.0,0.0);
		DepositoCombustible tank2 = new DepositoCombustible(40.0,15.0);
		assertTrue(tank.estaVacio());
		assertFalse(tank2.estaVacio());
		
	}

}
