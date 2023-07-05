import org.testng.Assert;
import org.testng.annotations.Test;

public class SortArrayTest {

    /**
     * Test Data:
     * {4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}
     */

    //1. Positive testing Happy path
    //array.length != 0; return int[];

    //array - positive numbers
    @Test
    public void testPositiveNumbers_HappyPath() {
        //AAA
        //arrange
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        //act
        int[] actualResult = new SortArray().sortArray(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    //array with negative numbers
    @Test
    public void testWithNegativeNumbers_HappyPath() {
        //AAA
        //arrange
        int[] array = {4, 3, 7, -12, 5, 2, -9, 4, 12};
        int[] expectedResult = {-12, -9, 2, 3, 4, 4, 5, 7, 12};

        //act
        int[] actualResult = new SortArray().sortArray(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. Negative testing Negative path
    //return int[];

    //array.length == 0;
    @Test
    public void testEmptyArray_HappyPath() {
        //AAA
        //arrange
        int[] array = {};
        int[] expectedResult = {};

        //act
        int[] actualResult = new SortArray().sortArray(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
