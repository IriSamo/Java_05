import org.testng.Assert;
import org.testng.annotations.Test;

public class IntersectionTest {

    /**
     *  Test Data:
     * {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
     * {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
     * {1, 2, 4, 5, 89}, {8, 9, 45} → {}
     */

    //1. Positive testing Happy path
    //Filled Arrays, return int[];

    //First array bigger than second, positive numbers
    @Test
    public void testFilledArraysPositive_HappyPath() {
        //AAA
        //arrange
        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 4, 2};
        int[] expectedResult = {2, 4};

        //act
        int[] actualResult = new Intersection().intersection(array1, array2);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //First array (positive numbers) bigger than second (positive and negative numbers)
    @Test
    public void testFilledArraysPositiveNegative_HappyPath() {
        //AAA
        //arrange
        int[] array1 = {1, 2, 4, 5, 8, 9};
        int[] array2 = {8, 9, -4, -2};
        int[] expectedResult = {8, 9};

        //act
        int[] actualResult = new Intersection().intersection(array1, array2);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //First array bigger than second, positive numbers, no match
    @Test
    public void testFilledArraysNoMatch_HappyPath() {
        //AAA
        //arrange
        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 45};
        int[] expectedResult = {};

        //act
        int[] actualResult = new Intersection().intersection(array1, array2);

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
        int[] array1 = {};
        int[] array2 = {};
        int[] expectedResult = {};

        //act
        int[] actualResult = new Intersection().intersection(array1, array2);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
