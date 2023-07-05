import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {

    /**
     * Test Data:
     * {0, 1, 2, 3, 4, 5} → 15
     * {-7, -3} → -10
     */

    //1. Positive testing Happy path
    //array.length != 0; return int;

    //array - positive numbers
    @Test
    public void testPositiveNumbers_HappyPath() {
        //AAA
        //arrange
        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        //act
        int actualResult = new SumArray().sumArray(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //array - negative numbers
    @Test
    public void testNegativeNumbers_HappyPath() {
        //AAA
        //arrange
        int[] array = {-7, -3};
        int expectedResult = -10;

        //act
        int actualResult = new SumArray().sumArray(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. Negative testing Negative path
    //array.length == 0;
    //return int;

    @Test
    public void testEmptyArray_NegativePath() {
        //AAA
        //arrange
        int[] array = {};
        int expectedResult = 0;

        //act
        int actualResult = new SumArray().sumArray(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
