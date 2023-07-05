import org.testng.Assert;
import org.testng.annotations.Test;

public class SumOfTwoTest {

    /**
     * Test Data:
     *      * ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}}
     */

    //1. Positive testing. Happy path.
    //Not empty array

    //Array - positives numbers
    @Test
    public void testPositivesNumbers_HappyPath(){
        //AAA
        //arrange
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 12;
        int[][] expectedResult = {{3, 9}, {7, 5}};

        //act
        int[][] actualResult = new SumOfTwo().sumOfTwo(array, k);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
