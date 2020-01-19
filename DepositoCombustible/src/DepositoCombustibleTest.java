import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest  {

	/* Verificar que se obtiene correctamente el valor actual del depósito. 
	   que funciona el método para obtener el nivel actual de depósito.*/
	@Test
	public void testGetDepositoNivel() {
		DepositoCombustible tank = new DepositoCombustible(40.0,25.0);
		assertEquals(25,tank.getDepositoNivel(),0);
	}

}
