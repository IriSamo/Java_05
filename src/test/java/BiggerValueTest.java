import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {

    /**
     * Test Data:
     * 3333, 9999
     * Expected Result = 9999
     */

    //1. Positive testing Happy path
    //return int;

    //Positive numbers
    @Test
    public void testPositiveNumbers_HappyPath() {
        //AAA
        //arrange
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        //act
        int actualResult = new BiggerValue().biggerValue(a, b);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Negative numbers
    @Test
    public void testNegativeNumbers_HappyPath() {
        //AAA
        //arrange
        int a = -3333;
        int b = -9999;
        int expectedResult = -3333;

        //act
        int actualResult = new BiggerValue().biggerValue(a, b);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //One positive number, one negative number
    @Test
    public void testPositiveNegativeNumbers_HappyPath() {
        //AAA
        //arrange
        int a = 3;
        int b = -9;
        int expectedResult = 3;

        //act
        int actualResult = new BiggerValue().biggerValue(a, b);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. Negative testing Negative path
    //Numbers are zero
    //int;

    //One number equal other number
    @Test
    public void testEqualNumbers_NegativePath() {
        //AAA
        //arrange
        int a = 0;
        int b = 0;
        int expectedResult = -2147483648;

        //act
        int actualResult = new BiggerValue().biggerValue(a, b);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
