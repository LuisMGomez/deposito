import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest  {

	/* Verificar que se obtiene correctamente el valor actual del dep�sito. 
	   que funciona el m�todo para obtener el nivel actual de dep�sito.*/
	@Test
	public void testGetDepositoNivel() {
		DepositoCombustible tank = new DepositoCombustible(40.0,25.0);
		assertEquals(25,tank.getDepositoNivel(),0);
	}

}
