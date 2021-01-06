package server;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTestFields {

    private int varsta;

    public ParameterizedTestFields(int varsta) {
        this.varsta = varsta;
    }

    // creates the test data
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{{22}, {23}, {24}, {15}, {16}, {17}};
        return Arrays.asList(data);
    }

    @Test
    public void testAgeException() {
        AllTests tester = new AllTests();
        assertEquals("Result", 1, tester.sansaImbolnavireDupaVarsta(varsta));
    }

}
