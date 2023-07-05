import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseArrayTest {

    /**
     * Test Data:
     * {2, 7, 3, 10} → {10, 3, 7, 2}
     */

    //1. Positive testing Happy path
    //return int[];

    //array.length != 0;
    @Test
    public void testFilledArray_HappyPath() {
        //AAA
        //arrange
        int[] array = {2, 7, 3, 10};
        int[] expectedResult = {10, 3, 7, 2};

        //act
        int[] actualResult = new ReverseArray().reverseArray(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. Negative testing Negative path
    //return int[];

    //array.length == 0;
    @Test
    public void testEmptyArray_NegativePath() {
        //AAA
        //arrange
        int[] array = {};
        int[] expectedResult = {};

        //act
        int[] actualResult = new ReverseArray().reverseArray(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
