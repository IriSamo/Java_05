import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {
    /**
     *   Test Data:
     *   -345 →  “Odd”
     *   0 →  “Even”
     *   222222 →  “Even”
     */


    //1. Positive testing Happy path
    //return String;

    //number - odd
    @Test
    public void testNumberOdd() {
        //AAA
        //arrange
        int number = -345;
        String expectedResult = "Odd";

        //act
        String actualResult = new OddEven().oddEven(-345);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //number - 0
    @Test
    public void testNumberZero() {
        //AAA
        //arrange
        int number = 0;
        String expectedResult = "Even";

        //act
        String actualResult = new OddEven().oddEven(0);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //number - even
    @Test
    public void testNumberEven() {
        //AAA
        //arrange
        int number = 222222;
        String expectedResult = "Even";

        //act
        String actualResult = new OddEven().oddEven(222222);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
