import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {

    /**
     * Test Data:
     * 89, 89
     * Expected result: 0
     * -89, 89
     * Expected result: -1
     * 89, -89
     * Expected result: 1
     */

    //1. Positive testing Happy path
    //return int;

    //Equal positive numbers
    @Test
    public void testEqualPositiveNumbers_HappyPath() {
        //AAA
        //arrange
        int a = 89;
        int b = 89;
        int expectedResult = 0;

        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //First is negative number and other is positive
    @Test
    public void testFirstNegativeOtherPositive_HappyPath() {
        //AAA
        //arrange
        int a = -89;
        int b = 89;
        int expectedResult = -1;

        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //First is positive number and other is negative
    @Test
    public void testFirstPositiveOtherNegative_HappyPath() {
        //AAA
        //arrange
        int a = 89;
        int b = -89;
        int expectedResult = 1;

        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }


}
