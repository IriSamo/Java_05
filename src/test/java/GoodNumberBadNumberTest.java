import org.testng.Assert;
import org.testng.annotations.Test;

public class GoodNumberBadNumberTest {

    /**
     * Test Data:
     * 63, 441, 1323, 3969 expectedResult "Good Number"
     * 81, 405 expectedResult "Bad Number"
     * 110 expectedResult "Poor Number"
     * 100 expectedResult "-1"
     */

    //1. Positive testing Happy path
    //return String;

    //number multiple of 9 and 7
    @Test
    public void testNumberMultiple7and9() {
        //AAA
        //arrange
        int m = 1323;
        String expectedResult = "Good Number";

        //act
        String actualResult = new GoodNumberBadNumber().goodNumberBadNumber(m);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //number multiple of 9 and not of 7
    @Test
    public void testNumberMultiple9not7() {
        //AAA
        //arrange
        int m = 81;
        String expectedResult = "Bad Number";

        //act
        String actualResult = new GoodNumberBadNumber().goodNumberBadNumber(m);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //number multiple of 11
    @Test
    public void testNumberMultiple11() {
        //AAA
        //arrange
        int m = 110;
        String expectedResult = "Poor Number";

        //act
        String actualResult = new GoodNumberBadNumber().goodNumberBadNumber(m);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //number not multiple of 11 end of 9 and of 7
    @Test
    public void testNumberNotMultiple9and7and11() {
        //AAA
        //arrange
        int m = 111;
        String expectedResult = "-1";

        //act
        String actualResult = new GoodNumberBadNumber().goodNumberBadNumber(m);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
