import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeOnTheRightTest {

    /**
     *  Test Data:
     * {4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}
     */

    //1. Positive testing Happy path
    //return int[]; array.length != 0;

    //Array - positives end negatives numbers
    @Test
    public void testPositivesNegativesNumbers_HappyPath() {
        //AAA
        //arrange
        int[] array = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        int[] expectedResult = {4, 7, 5, 9, 4, 12, -3, -12, -2};

        //act
        int[] actualResult = new NegativeOnTheRight().negativeOnTheRight(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Array - positives numbers
    @Test
    public void testPositivesNumbers_HappyPath() {
        //AAA
        //arrange
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {4, 3, 7, 12, 5, 2, 9, 4, 12};

        //act
        int[] actualResult = new NegativeOnTheRight().negativeOnTheRight(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Array - negatives numbers
    @Test
    public void testNegativesNumbers_HappyPath() {
        //AAA
        //arrange
        int[] array = {-4, -3, -7, -12, -5, -2, -9, -4, -12};
        int[] expectedResult = {-4, -3, -7, -12, -5, -2, -9, -4, -12};

        //act
        int[] actualResult = new NegativeOnTheRight().negativeOnTheRight(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. Negative testing Negative path
    //return int[];

    //Empty arrays
    @Test
    public void testEmptyArrays_NegativePath() {
        //AAA
        //arrange
        int[] array = {};
        int[] expectedResult = {};

        //act
        int[] actualResult = new NegativeOnTheRight().negativeOnTheRight(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
