import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GCD2Test {

    @Test
    public void GCD2Test1() {
        //Given
        int x = 72;
        int y = 16;

        //When
        int actual = GCD2.findGCD2(x, y);
        int expected = 8;

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void GCD2Test2() {
        //Given
        int x = 9182634;
        int y = 98;

        //When
        int actual = GCD2.findGCD2(x, y);
        int expected = 2;

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void GCD2Test3() {
        //Given
        int x = 180;
        int y = 378;

        //When
        int actual = GCD2.findGCD2(x, y);
        int expected = 18;

        //Then
        Assert.assertEquals(expected, actual);
    }

}