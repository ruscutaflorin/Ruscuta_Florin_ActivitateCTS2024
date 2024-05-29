package JUnit.Suite;

import JUnit.PachetTuristicTest;
import JUnit.PersoanaTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({PachetTuristicTest.class, PersoanaTest.class})
public class SuitaCompleta {
}
