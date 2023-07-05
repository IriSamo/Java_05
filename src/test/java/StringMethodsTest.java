import org.testng.Assert;
import org.testng.annotations.Test;

//import static org.testng.Assert.*;

public class StringMethodsTest {

    /**
     *  1. Test Data:
     * “    Red Rover School   “ → “Лишние пробелы удалены”
     * “Red Rover School“ → “Пробелов не было”
     * “” → “Строка пустая”
     */
    @Test
    public void testRemoveSpacesWithSpaces_HappyPath() {
        String str = "    Red Rover School   ";

        String expectedResult = "Лишние пробелы удалены";
        String actualResult = new StringMethods().removeSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveSpacesWithoutSpaces_HappyPath() {
        String str = "Red Rover School";

        String expectedResult = "Пробелов не было";
        String actualResult = new StringMethods().removeSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveSpacesEmpty_NegativePath() {
        String str = "";

        String expectedResult = "Строка пустая";
        String actualResult = new StringMethods().removeSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     *  2. Test Data:
     *  “    Red Rover School   “ →  “Red Rover School“
     * “panda   “ → “pnd”
     * “taramasalata” → “trmslt”
     */
    @Test
    public void testRemoveAllAsWithoutSymbolWithSpaces_HappyPath() {
        String str = "    Red Rover School   ";

        String expectedResult = "Red Rover School";
        String actualResult = new StringMethods().removeAllAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllAsWithSymbolAndSpaces_HappyPath() {
        String str = "panda   ";

        String expectedResult = "pnd";
        String actualResult = new StringMethods().removeAllAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllAsWithSymbolWithoutSpaces_HappyPath() {
        String str = "taramasalata";

        String expectedResult = "trmslt";
        String actualResult = new StringMethods().removeAllAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllAsEmpty_NegativePath() {
        String str = "";

        String expectedResult = "String is empty";
        String actualResult = new StringMethods().removeAllAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     *  3. Test Data:
     *  “3504209706040000 “ →  “35429764“
     * “0000000111“ → “111”
     */
    @Test
    public void testRemoveAllZerosWithSpacesAndZeros_HappyPath() {
        String str = "3504209706040000 ";

        String expectedResult = "35429764";
        String actualResult = new StringMethods().removeAllZeros(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllZerosWithZeros_HappyPath() {
        String str = "0000000111";

        String expectedResult = "111";
        String actualResult = new StringMethods().removeAllZeros(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllZerosWithoutZeros_HappyPath() {
        String str = "35429764";

        String expectedResult = "This is a valid string";
        String actualResult = new StringMethods().removeAllZeros(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllZerosWithOtherSymbols_NegativePath() {
        String str = " k sh 547 634 4fj  ";

        String expectedResult = "This string contains not only numbers";
        String actualResult = new StringMethods().removeAllZeros(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllZerosEmpty_NegativePath() {
        String str = "";

        String expectedResult = "String is empty";
        String actualResult = new StringMethods().removeAllZeros(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     *  4. Test Data:
     *  “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
     * “p a     n   d a   “ → “panda”
     */
    @Test
    public void testRemoveAllSpacesWithSpaces_HappyPath() {
        String str = "    R e d     Ro ve    r Sc   h ool   ";

        String expectedResult = "RedRoverSchool";
        String actualResult = new StringMethods().removeAllSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllSpacesWithSpaces2_HappyPath() {
        String str = "p a     n   d a   ";

        String expectedResult = "panda";
        String actualResult = new StringMethods().removeAllSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllSpacesEmpty_NegativePath() {
        String str = "";

        String expectedResult = "String is empty";
        String actualResult = new StringMethods().removeAllSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     *  5. Test Data:
     * “Abracadabra” → “5, 6”
     * “Homenum Revelio” → “0, 15”
     * “3 tarAmasAlatA” → “6, 8”
     */
    @Test
    public void testCountAsWithAa_HappyPath() {
        String str = "Abracadabra";

        String expectedResult = "5, 6";
        String actualResult = new StringMethods().countAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountAsWithoutAa_HappyPath() {
        String str = "Homenum Revelio";

        String expectedResult = "0, 15";
        String actualResult = new StringMethods().countAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountAsWithAa2_HappyPath() {
        String str = "3 tarAmasAlatA";

        String expectedResult = "6, 8";
        String actualResult = new StringMethods().countAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountAsEmpty_NegativePath() {
        String str = "";

        String expectedResult = "String is empty";
        String actualResult = new StringMethods().countAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     *  6. Test Data:
     * “As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the
     * current long-term support (LTS) versions. Oracle released the last zero-cost public
     * update for the legacy version Java 8 LTS in January 2019 for commercial use,
     * although it will otherwise still support Java 8 with public updates for personal
     * use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8
     * and 11 that are still receiving security and other upgrades.” → true
     *
     *  “99 little bugs in a code.
     * 99 little bugs in a code.
     * Take one down, and patch it around.
     * 235 critical bugs in the code.” → false
     */
     @Test
    public void testCountJavaWith_HappyPath() {
        String str = "As of March 2022, Java 18 is the latest version, while Java 17, 11 "
                + "and 8 are the current long-term support (LTS) versions. Oracle released "
                + "the last zero-cost public update for the legacy version Java 8 LTS in "
                + "January 2019 for commercial use, although it will otherwise still "
                + "support Java 8 with public updates for personal use indefinitely. Other "
                + "vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that "
                + "are still receiving security and other upgrades.";

        boolean expectedResult = true;
        boolean actualResult = new StringMethods().countJava(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountJavaWithout_HappyPath() {
        String str = "99 little bugs in a code.\n"
                + "99 little bugs in a code.\n"
                + "Take one down, and patch it around.\n"
                + "235 critical bugs in the code.";

        boolean expectedResult = false;
        boolean actualResult = new StringMethods().countJava(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountJavaEmpty_NegativePath() {
        String str = "";

        boolean expectedResult = false;
        boolean actualResult = new StringMethods().countJava(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testInsertQuotes_HappyPath() {
        String str = "Abracadabra";

        String expectedResult = "\"Abracadabra\"";
        String actualResult = new StringMethods().insertQuotes(str);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testInsertQuotes_NegativePath() {
        String str = "";

        String expectedResult = "String is empty";
        String actualResult = new StringMethods().insertQuotes(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     *  8. Test Data:
     * “Федор Достоевский писал”, “Надо любить жизнь больше, чем смысл жизни.” →
     * “Федор Достоевский писал: "Надо любить жизнь больше, чем смысл жизни."”
     * Задание со звездочкой:
     * “Наполеон Бонапарт писал”, “В моем словаре нет слова «невозможно».” →
     * "Наполеон Бонапарт писал: "В моем словаре нет слова "невозможно".""
     */
    @Test
    public void testInsertQuotes2_HappyPath() {
        String str1 = "Федор Достоевский писал";
        String str2 = "Надо любить жизнь больше, чем смысл жизни.";

        String expectedResult = "Федор Достоевский писал: \"Надо любить жизнь больше, чем "
                + "смысл жизни.\"";

        String actualResult = new StringMethods().insertQuotes(str1, str2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testInsertQuotes2_NegativePath() {
        String str1 = "";
        String str2 = "";

        String expectedResult = "One of strings is empty";
        String actualResult = new StringMethods().insertQuotes(str1, str2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     *  9. Test Data:
     * “ташкент” → “Ташкент”
     * “ЧикаГО” → “Чикаго”
     */
    @Test
    public void testCorrectCityLowerCase_HappyPath() {
        String str = "ташкент";

        String expectedResult = "Ташкент";
        String actualResult = new StringMethods().correctCity(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCorrectCityLowerAndUpperCase_HappyPath() {
        String str = "ЧикаГО";

        String expectedResult = "Чикаго";
        String actualResult = new StringMethods().correctCity(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCorrectCity_NegativePath() {
        String str = "";

        String expectedResult = "String is empty";
        String actualResult = new StringMethods().correctCity(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     *  10. Test Data:
     * “Abracadabra”, “b” → “bracadab”
     * “Whippersnapper”, “p” → “ppersnapp”
     */
    @Test
    public void testGetStringBetweenSymbols_HappyPath() {
        String str1 = "Whippersnapper";
        String str2 = "p";

        String expectedResult = "ppersnapp";
        String actualResult = new StringMethods().getStringBetweenSymbols(str1, str2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetStringBetweenSymbolsEmpty_NegativePath() {
        String str1 = "";
        String str2 = "";

        String expectedResult = "One of strings is empty";
        String actualResult = new StringMethods().getStringBetweenSymbols(str1, str2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     *  11. Test Data:
     * 	“Abracadabra” → true
     * 	“Whippersnapper” → false
     */
    @Test
    public void testCompareStartEnd_HappyPath() {
        String str = "Abracadabra";

        boolean expectedResult = true;
        boolean actualResult = new StringMethods().compareStartEnd(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCompareStartEnd2_HappyPath() {
        String str = "Whippersnapper";

        boolean expectedResult = false;
        boolean actualResult = new StringMethods().compareStartEnd(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCompareStartEndEmpty_NegativePath() {
        String str = "";

        boolean expectedResult = false;
        boolean actualResult = new StringMethods().compareStartEnd(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     *  12. Test Data:
     * 	“Red Rover” → “Rover”
     */
    @Test
    public void testGetSecondWorld_HappyPath() {
        String str = "Red Rover jgg";

        String expectedResult = "Rover";
        String actualResult = new StringMethods().getSecondWorld(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetSecondWorldEmpty_NegativePath() {
        String str = "";

        String expectedResult = "String is empty";
        String actualResult = new StringMethods().getSecondWorld(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     *  13. Test Data:
     * 	“Red rover”, 1, 4 → “Rover”
     */

    @Test
    public void testDeleteBetweenIndexes_PositivePath() {
        String str = "Red rover";
        int s = 1, f = 4;

        String expectedResult = "Rover";
        String actualResult = new StringMethods().deleteBetweenIndexes(str, s, f);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testDeleteBetweenIndexesEmpty_NegativePath() {
        String str = "";
        int s = 1, f = 4;

        String expectedResult = "String is empty";
        String actualResult = new StringMethods().deleteBetweenIndexes(str, s, f);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     *  14. Test Data:
     * “QA for Everyone” → {“QA”, “for”, “Everyone”}
     * “Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}
     */

    @Test
    public void testGetWordsEmpty_PositivePath() {
        String str = "QA for Everyone";

        String[] expectedResult = {"QA", "for", "Everyone"};
        String[] actualResult = new StringMethods().getWords(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetWordsEmpty2_PositivePath() {
        String str = "Александр Сергеевич Пушкин";

        String[] expectedResult = {"Александр", "Сергеевич", "Пушкин"};
        String[] actualResult = new StringMethods().getWords(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetWordsEmpty_NegativePath() {
        String str = "";

        String[] expectedResult = {"String is empty"};
        String[] actualResult = new StringMethods().getWords(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     *  15. Test Data:
     * “Александр Сергеевич Пушкин” →
     *
     * “Имя: Александр
     * Отчество: Сергеевич
     * Фамилия: Пушкин”
     */
    @Test
    public void testSegregateName() {
        String str = "Александр Сергеевич Пушкин";

        String expectedResult = "Имя: Александр\n"
                + "Отчество: Сергеевич\n"
                + "Фамилия: Пушкин";
        String actualResult = new StringMethods().segregateName(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSegregateName_NegativePath() {
        String str = "";

        String expectedResult = "String is empty";
        String actualResult = new StringMethods().segregateName(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     *  16. Test Data:
     * “one”, 5 → “oneoneoneoneone”
     */
    @Test
    public void testRepeatString_PositivePath() {
        String str = "one";

        String expectedResult = "oneoneoneoneone";
        String actualResult = new StringMethods().repeatString(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRepeatString_NegativePath() {
        String str = "";

        String expectedResult = "String is empty";
        String actualResult = new StringMethods().repeatString(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     *  17.
     */
    @Test
    public void testGetCodOfLetter() {
        String str = "Panda";
        int index = 0;

        int expectedResult = 80;
        int actualResult = new StringMethods().getCodOfLetter(str, index);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetCodOfLetterEmpty_NegativePath() {
        String str = "";
        int index = 2;

        int expectedResult = -1;
        int actualResult = new StringMethods().getCodOfLetter(str, index);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     *  18. Test Data:
     * “one”, “One”, “ONE”  → true
     * “one”, “Один”, “ONE” → false
     */
    @Test
    public void testCheckIfSameWords_HappyPath() {
        String str1 = "one";
        String str2 = "One";
        String str3 = "ONE";

        boolean expectedResult = true;
        boolean actualResult = new StringMethods().checkIfSameWords(str1, str2, str3);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCheckIfSameWords2_HappyPath() {
        String str1 = "one";
        String str2 = "Один";
        String str3 = "ONE";

        boolean expectedResult = false;
        boolean actualResult = new StringMethods().checkIfSameWords(str1, str2, str3);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCheckIfSameWordsEmpty_NegativePath() {
        String str1 = "";
        String str2 = "";
        String str3 = "";

        boolean expectedResult = false;
        boolean actualResult = new StringMethods().checkIfSameWords(str1, str2, str3);

        Assert.assertEquals(actualResult, expectedResult);
    }
}