import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest  {

	/*
	 * Prueba para saber si el depósito está lleno a la mitad de su capacidad.
	 */
	@Test
	public void testEstaMedioLleno() {
		DepositoCombustible tank = new DepositoCombustible(40.0,20.0);
		DepositoCombustible tank2 = new DepositoCombustible(40.0,12.0);
		
		assertEquals(tank.getDepositoNivel(), tank.getDepositoMax()/2,0);
		assertFalse(tank2.getDepositoNivel()==tank2.getDepositoMax()/2);
		
	}

}
