package server;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AllTests.class,
        ParameterizedTestFields.class,
        TheoryTests.class,})
public class AllTests1 {

}
