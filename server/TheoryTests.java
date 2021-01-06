package server;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TheoryTests {

    @DataPoints
    public static int[] integers() {
        return new int[]{
                10, 22, 55, 34, 39, 77};
    }

    @DataPoints
    public static String[] genders() {
            return new String[]{
                    "male", "female", "somethingelse"
    };
    }

    @Theory
    public void teoria1(int a, String b) {
        Assume.assumeTrue(a > 14 && a < 69);
        Assume.assumeTrue( b.equals("male") || b.equals("female"));
        double x = new AllTests().sansaImbolnavireDupaVarstaSiGen(a,b);
        Assert.assertTrue(x > 0 || x < 10);
    }

}
