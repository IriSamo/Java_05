import org.testng.Assert;
import org.testng.annotations.Test;

public class KthLargestTest {

    /**
     * Test Data:
     * ({4, 3, 7, 13, 5, 2, 9, 4, 12}, 3) → 9
     */

    //1. Positive testing. Happy path.
    //Not empty array

    //Array - positives numbers
    @Test
    public void testPositivesNumbers_HappyPath(){
        //AAA
        //arrange
        int[] array = {4, 3, 7, 13, 5, 2, 9, 4, 12};
        int k = 3;
        int expectedResult = 9;

        //act
        int actualResult = new KthLargest().kthLargest(array, k);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. Negative testing. Happy path.
    //Empty array

    @Test
    public void testEmptyArray_NegativePath(){
        //AAA
        //arrange
        int[] array = {};
        int k = 3;
        int expectedResult = -2147483648;

        //act
        int actualResult = new KthLargest().kthLargest(array, k);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }



}
