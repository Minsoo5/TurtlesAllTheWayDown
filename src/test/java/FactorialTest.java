
import org.junit.Assert;
import org.junit.Test;


public class FactorialTest {

    @Test
    public void factorialTest1() {
        //Given

        //When
        long expected = Factorial.factorial(5);
        long actual = 120;

        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void factorialTest2() {
        //Given

        //When
        long expected = Factorial.factorial(4);
        long actual = 24;

        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void factorialTest() {
        //Given

        //When
        long expected = Factorial.factorial(1);
        long actual = 1;

        //Then
        Assert.assertEquals(expected, actual);
    }


}