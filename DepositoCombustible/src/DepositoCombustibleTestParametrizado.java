import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/* Prueba parametrizada para comprobar que al consumir cantidades de combustible 
 * (grandes, pequeñas, negativas... ) del depósito, 
 * el contenido restante es el esperado. Utiliza valores como parámetros de método
*/
@RunWith(Parameterized.class)
public class DepositoCombustibleTestParametrizado  {
	private double amount;
	private double tankLevel;
	private double resultado;
	
	
	public DepositoCombustibleTestParametrizado(double tLevel, double am, double res ) {
	       this.tankLevel = tLevel;
	       this.amount = am;
	       this.resultado = res;
	    }
	@Parameters
	public static Collection<Object[]> consumos(){
		return Arrays.asList(new Object[][] {
			{25,10,15},{12,-4,16},{40,5,35},{35,4,31},
			{41,-10,51},{40,40,0},{4,1.5,2.5},{5,4,1}
			
		});
		
	}
	
	@Test
	public void testConsumos() {
		DepositoCombustible tank = new DepositoCombustible(50.0,tankLevel);
		tank.consumir(amount);
		assertEquals(resultado,tank.getDepositoNivel(),0);
	}

}
