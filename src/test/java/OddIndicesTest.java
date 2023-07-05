import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {

    /**
     *   Test Data:
     * Input = {-45, 590, 234, 985, 12, 68}
     * Expected Result =  {590, 985, 68}
     */

    //1. Positive testing Happy path
    //return int[];

    //array.lenth != 0;
    @Test
    public void testFilledArray_HappyPath() {
        //AAA
        //arrange
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        //act
        int[] actualResult = new OddIndices().oddIndices(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    //2. Negative testing Negative path
    //return int[];

    //array.lenth == 0;
    @Test
    public void testEmptyArray_NegativePath() {
        //AAA
        //arrange
        int[] array = {};
        int[] expectedResult = {};

        //act
        int[] actualResult = new OddIndices().oddIndices(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
