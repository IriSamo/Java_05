import org.testng.Assert;
import org.testng.annotations.Test;

public class PeakElementTest {

    /**
     * Test Data:
     * {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
     */

    //1. Positive testing Happy path
    //array.length != 0; return int[];

    //array - positive numbers
    @Test
    public void testPositiveNumbers_HappyPath() {
        //AAA
        //arrange
        int[] array = {1, 10};
        int[] expectedResult = {10};

        //act
        int[] actualResult = new PeakElement().peakElement(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //array - negative numbers
    @Test
    public void testNegativeNumbers_HappyPath() {
        //AAA
        //arrange
        int[] array = {-3, -3, -8, -8, -8, -1};
        int[] expectedResult = {-1};

        //act
        int[] actualResult = new PeakElement().peakElement(array);

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
        int[] expectedResult = {};

        //act
        int[] actualResult = new PeakElement().peakElement(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
