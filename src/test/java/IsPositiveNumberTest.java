import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {

    /**
     * Test Data:
     * 555, 0, -555
     */

    //1. Positive testing Happy path
    //return boolean;

    //Positive number
    @Test
    public void testPositiveNumber_HappyPath() {
        //AAA
        //arrange
        int x = 555;
        boolean expectedResult = true;

        //act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(x);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Zero
    @Test
    public void testNumberZero_HappyPath() {
        //AAA
        //arrange
        int x = 0;
        boolean expectedResult = false;

        //act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(x);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Negative number
    @Test
    public void testNegativeNumber_HappyPath() {
        //AAA
        //arrange
        int x = -555;
        boolean expectedResult = false;

        //act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(x);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
