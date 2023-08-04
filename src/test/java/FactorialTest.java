
import org.junit.Assert;
import org.junit.Test;


public class FactorialTest {

    @Test
    public void factorialTest() {
        //Given

        //When
        long expected = Factorial.factorial(5);
        long actual = 120;

        //Then
        Assert.assertEquals(expected, actual);
    }




}