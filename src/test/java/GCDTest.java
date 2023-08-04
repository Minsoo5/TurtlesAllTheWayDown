import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GCDTest {

    @Test
    public void findGCDTest1() {
        //Given
        int x = 3;
        int y = 12;

        //When
        int expected = 3;
        int actual = GCD.findGCD(x, y);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findGCDTest2() {
        //Given
        int x = 28483847;
        int y = 7;

        //When
        int expected = 7;
        int actual = GCD.findGCD(x, y);

        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void findGCDTest3() {
        //Given
        int x = 5555;
        int y = 10;

        //When
        int expected = 5;
        int actual = GCD.findGCD(x, y);

        //Then
        Assert.assertEquals(expected, actual);
    }


}