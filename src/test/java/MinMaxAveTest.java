import org.testng.Assert;
import org.testng.annotations.Test;

public class MinMaxAveTest {

    /**
     *   Test Data:
     * ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
     */

    //1. Positive testing Happy path
    //return int[];

    //array.lenth != 0;
    @Test
    public void testFilledArray_HappyPath() {
        //AAA
        //arrange
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int f = 2;
        int l = 6;
        int[] expectedResult = {3, 7, 5};

        //act
        int[] actualResult = new MinMaxAve().minMaxAve(array, f, l);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. Negative testing Negative path
    //return int[];

    //array.lenth == 0;
    @Test
    public void testEmptyArray_HappyPath() {
        //AAA
        //arrange
        int[] array = {};
        int f = 2;
        int l = 6;
        int[] expectedResult = {0, 0, 0};

        //act
        int[] actualResult = new MinMaxAve().minMaxAve(array, f, l);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
