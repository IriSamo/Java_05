import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplуArrayByNumberTest {

    /**
     * ({1, 2, 3, 4, 5}, 3) -> {3, 6, 9, 12, 15}
     */

    //1. Positive testing. Happy path.
    //Array not empty
    //return int[]

    //Array - positives numbers, factor - positive number
    @Test
    public void testPositiveArrayPositiveNumber_HappyPath() {

        //AAA
        //arrange
        int[] array = {1, 2, 3, 4, 5};
        int number = 3;
        int[] expectedResult = {3, 6, 9, 12, 15};

        //act
        int[] actualResult = new MultiplуArrayByNumber().multiplуArrayByNumber(array, number);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Array - negatives numbers, factor - negative number
    @Test
    public void testNegativeArrayNegativeNumber_HappyPath() {

        //AAA
        //arrange
        int[] array = {-1, -2, -3, -4, -5};
        int number = Integer.MAX_VALUE / 2;
        int[] expectedResult = {};

        //act
        int[] actualResult = new MultiplуArrayByNumber().multiplуArrayByNumber(array, number);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. Negative testing. Negative path
    //Empty array
    //return int[]

    //Array - negatives numbers, factor - negative number
    @Test
    public void testEmptyArray_HappyPath() {

        //AAA
        //arrange
        int[] array = {};
        int number = -3;
        int[] expectedResult = {};

        //act
        int[] actualResult = new MultiplуArrayByNumber().multiplуArrayByNumber(array, number);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}

