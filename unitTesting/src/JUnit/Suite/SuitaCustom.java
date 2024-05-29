package JUnit.Suite;

import JUnit.Categorii.TesteEroare;
import JUnit.Categorii.TesteRange;
import JUnit.PachetTuristicTest;
import JUnit.PersoanaTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({PachetTuristicTest.class, PersoanaTest.class})
@Categories.IncludeCategory(TesteEroare.class)
@Categories.ExcludeCategory(TesteRange.class)

public class SuitaCustom {
}
