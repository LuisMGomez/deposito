import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/* Similar al anterior test, comprueba que al utilizar el método de llenar 
 * se obtienen resultados correctos. Utiliza valores como parámetros de método.
*/
@RunWith(Parameterized.class)
public class DepositoCombustibleTestParametrizado2  {
	private double amount;
	private double tankLevel;
	private double resultado;
	

	public DepositoCombustibleTestParametrizado2(double tLevel, double am, double res ) {
	       this.tankLevel = tLevel;
	       this.amount = am;
	       this.resultado = res;
	    }
	@Parameters
	public static Collection<Object[]> llenados(){
		return Arrays.asList(new Object[][] {
			{25,10,35},{12,-4,8},{40,5,45},{35,4,39},
			{41,-10,31},{40,40,80},{4,1.5,5.5},{5,4,9}
			
		});
		
	}
	
	@Test
	public void testLlenados() {
		DepositoCombustible tank = new DepositoCombustible(50.0,tankLevel);
		tank.fill(amount);
		assertEquals(resultado,tank.getDepositoNivel(),0);
	}


}
