import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DepositoCombustibleTest.class, DepositoCombustibleTest2.class, DepositoCombustibleTest3.class,
		DepositoCombustibleTest4.class, DepositoCombustibleTestParametrizado.class,
		DepositoCombustibleTestParametrizado2.class })
public class AllTests {

}
