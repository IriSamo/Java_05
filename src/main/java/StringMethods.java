import static  project_utils.StringMethodsUtilities.*;

public class StringMethods {


    /**
     * 1. Написать метод removeSpaces(), который принимает на вход строку.
     * Если строка не пустая (проверить методом класса String), то примените метод по
     * удалению пробелов в начале и в конце строки.
     * Догадаться, каким методом из видео можно проверить, были ли пробелы в строке.
     * Если пробелы были, то метод должен удалить их и вернуть сообщение:
     * “Лишние пробелы удалены”.
     * Если пробелов не было, вернуть сообщение “Пробелов не было”.
     * Если строка пустая (проверить методом класса String), вернуть сообщение
     * “Строка пустая”.
     * Test Data:
     * “    Red Rover School   “ → “Лишние пробелы удалены”
     * “Red Rover School“ → “Пробелов не было”
     * “” → “Строка пустая”
     */
    public String removeSpaces(String str) {
        if (checkIfStringEmpty(str)) {

            return "Строка пустая";
        }
        if (str.equals(str.trim())) {

            return "Пробелов не было";
        } else {
            str = str.trim();

            return "Лишние пробелы удалены";
        }
    }

    /**
     * 2. Написать алгоритм removeAllAs().
     * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
     * Если строка валидная, то метод удаляет все буквы a из строки, если таковые имеются.
     * Метод возвращает обработанную строку.
     * Test Data:
     * “    Red Rover School   “ →  “Red Rover School“
     * “panda   “ → “pnd”
     * “taramasalata” → “trmslt”
     */
    public String removeAllAs(String str) {
        if (checkIfStringEmpty(str)) {

            return "String is empty";
        }

        return str.trim().replace("a", "");
    }

    /**
     * 3. Написать алгоритм removeAllZeros().
     * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку,
     * состоящую из цифр. Если строка валидная, то метод удаляет все пробелы из строки,
     * если таковые имеются. Метод возвращает обработанную строку, в которой нет нулей.
     * Если в строке не было нулей, метод возвращает сообщение “This is a valid string”.
     * Test Data:
     * “3504209706040000 “ →  “35429764“
     * “0000000111“ → “111”
     */
    public String removeAllZeros(String str) {
        if (checkIfStringEmpty(str)) {

            return "String is empty";
        }
        str = str.replace(" ", "");
        if (str.matches("[0-9]+")) {
            if (str.contains("0")) {
                str = str.replace("0", "");

                return str;
            } else {

                return "This is a valid string";
            }
        }
        return "This string contains not only numbers";
    }

    /**
     * 4. С помощью методов из видео1,  написать алгоритм, который принимает на вход
     * строку. Если строка валидная, то метод удаляет все пробелы из строки, если таковые
     * имеются. Метод возвращает обработанную строку.
     * Test Data:
     * “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
     * “p a     n   d a   “ → “panda”
     */
    public String removeAllSpaces(String str) {
        if (checkIfStringEmpty(str)) {

            return "String is empty";
        }

        return str.replace(" ", "");
    }

    /**
     *  5. Напишите метод countAs(), который принимает на вход строку и считает, сколько
     * букв а или А содержится в строке. Метод возвращает количество букв a/A,  и
     * количество букв/знаков в слове без букв a/A. Итоговый результат должен строится
     * с помощью метода из видео 2.
     * Test Data:
     * “Abracadabra” → “5, 6”
     * “Homenum Revelio” → “0, 15”
     * “3 tarAmasAlatA” → “6, 8”
     */
    public String countAs(String str) {
        if (checkIfStringEmpty(str)) {

            return "String is empty";
        }
        int countA = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                countA++;
            }
        }
        return countA + ", " + (str.length() - countA);
    }

    /**
     *  6. Напишите метод countJava(), который принимает на вход текст и проверяет,
     *  содержится ли в тексте хотя бы одно слово Java.
     * Test Data:
     * “As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the
     * current long-term support (LTS) versions. Oracle released the last zero-cost public
     * update for the legacy version Java 8 LTS in January 2019 for commercial use,
     * although it will otherwise still support Java 8 with public updates for personal
     * use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8
     * and 11 that are still receiving security and other upgrades.” → true
     *
     * “99 little bugs in a code.
     * 99 little bugs in a code.
     * Take one down, and patch it around.
     * 235 critical bugs in the code.” → false
     */
    public boolean countJava(String str){
        return !checkIfStringEmpty(str) && str.contains("Java");
    }

    /**
     *  7. Напишите метод insertQuotes(), который принимает слово и возвращает строку,
     *  в которой это слово “обернуто” в кавычки:
     * Test Data:
     * “Abracadabra” →  ““Abracadabra””
     */
    public String insertQuotes(String str){
        if (checkIfStringEmpty(str)) {

            return "String is empty";
        }

        return "\"" + str + "\"";
    }

    /**
     *  8. Напишите метод insertQuotes2(), который принимает на вход две строки, и
     *  добавляет знак :  после слова “писал”,  и оборачивает в кавычки вторую строку
     * (результат строится с помощью метода concat())
     *
     * Test Data:
     * “Федор Достоевский писал”, “Надо любить жизнь больше, чем смысл жизни.” →
     * “Федор Достоевский писал: "Надо любить жизнь больше, чем смысл жизни."”
     * Задание со звездочкой:
     * “Наполеон Бонапарт писал”, “В моем словаре нет слова «невозможно».” →
     * "Наполеон Бонапарт писал: "В моем словаре нет слова "невозможно".""
     */
    public String insertQuotes(String str1, String str2){
        if (checkIfStringEmpty(str1) || checkIfStringEmpty(str2)) {

            return "One of strings is empty";
        }
        String word = "писал";
        if(str1.contains(word)){
            str1 = str1.replace(word, word.concat(": \""));
        } else if(str2.contains(word)){
            str2 = str2.replace(word, word.concat(": \""));
        }

        return str1.concat(str2).concat("\"");
    }

    /**
     *  9. Напишите метод, кторый принимает на вход название города и исправляет написание:
     * Test Data:
     * “ташкент” → “Ташкент”
     * “ЧикаГО” → “Чикаго”
     */
    public String correctCity(String str){
        if (checkIfStringEmpty(str)) {

            return "String is empty";
        }

        return str.toUpperCase().charAt(0) + str.toLowerCase().substring(1);
    }

    /**
     *  10. Напишите метод, который принимает на вход строку и букву-параметр,
     *  и возвращает все, что находится между первой и последней буквой-параметром:
     * Test Data:
     * “Abracadabra”, “b” → “bracadab”
     * “Whippersnapper”, “p” → “ppersnapp”
     */
    public String getStringBetweenSymbols(String str1, String str2){
        if (checkIfStringEmpty(str1) || checkIfStringEmpty(str2)) {

            return "One of strings is empty";
        }

        return str1.substring(str1.indexOf(str2), str1.lastIndexOf(str2) + 1);
    }

    /**
     *  11. Напишите метод, который принимает на вход слово, и возвращает true, если слово
     *  начинается и заканчивается на одинаковую букву, и false иначе
     * Test Data:
     * 	“Abracadabra” → true
     * 	“Whippersnapper” → false
     */
    public boolean compareStartEnd(String str){
        if (checkIfStringEmpty(str)) {

            return false;
        }
        str = str.trim().toLowerCase();

        return str.charAt(0) == str.charAt(str.length() - 1);
    }

    /**
     *  12. Напишите метод, который принимает на вход строку из двух слов, разделенных пробелом,
     * и возвращает последнее слово
     * Test Data:
     * 	“Red Rover” → “Rover”
     */
    public String getSecondWorld(String str){
        if (checkIfStringEmpty(str)) {

            return "String is empty";
        }
        str = str.substring(str.indexOf(" ") + 1);
        str = str.substring(0, str.indexOf(" "));
        return str;
    }

    /**
     *  13. Написать метод, который принимает строку, и 2 индекса. Метод удаляет все, что находится между двумя индексами включительно
     * Test Data:
     * 	“Red rover”, 1, 4 → “Rover”
     */
    public String deleteBetweenIndexes(String str, int s, int f){
        if (checkIfStringEmpty(str)) {

            return "String is empty";
        }

        return str.substring(0, s) + str.substring(f + 1);
    }

    /**
     *  14. Напишите метод, который принимает на вход предложение и возвращает слова из
     *  этого предложения в виде массива слов
     * Test Data:
     * “QA for Everyone” → {“QA”, “for”, “Everyone”}
     * “Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}
     */
    public String[] getWords(String str){
        if (checkIfStringEmpty(str)) {

            return new String[]{"String is empty"};
        }

        return str.split(" ");
    }

    /**
     *  15. Написать метод, который принимает на вход предложение, которое состоит из
     *  имени, фамилии, отчества и возвращает текст:
     * Test Data:
     * “Александр Сергеевич Пушкин” →
     *
     * “Имя: Александр
     * Отчество: Сергеевич
     * Фамилия: Пушкин”
     */
    public String segregateName(String str){
        if (checkIfStringEmpty(str)) {

            return "String is empty";
        }
        String[] name = str.trim().split(" ");

        return "Имя: " + name[0] + "\nОтчество: " + name[1] + "\nФамилия: " + name[2];
    }

    /**
     *  16.  Написать метод, который принимает на вход слово и число n,  и возвращает
     *  строку, где слово повторяется n раз.
     * Test Data:
     * “one”, 5 → “oneoneoneoneone”
     */
    public String repeatString(String str){
        if (checkIfStringEmpty(str)) {

            return "String is empty";
        }
        return str.repeat(5);
    }

    /**
     *  17. Напишите метод, который принимает строку и index, и возвращает численное
     *  значение буквы, которая находится на позиции index (использовать только один
     *  метод класса String)
     */
    public int getCodOfLetter(String str, int index){
        if (checkIfStringEmpty(str)) {

            return -1;
        }
        return str.charAt(index);
    }

    /**
     *  18.  Написать метод, который принимает 3 слова, и сравнивает их методом, который
     *  считает, что прописные и заглавные буквы - это одни и те же буквы. Метод
     *  возвращает true, если все слова одинаковы, и метод возвращает false, если слова
     *  не одинаковы:
     * Test Data:
     * “one”, “One”, “ONE”  → true
     * “one”, “Один”, “ONE” → false
     */
    public boolean checkIfSameWords(String str1, String str2, String str3){
        if (checkIfStringEmpty(str1) ||
                checkIfStringEmpty(str2) ||
                checkIfStringEmpty(str3)) {

            return false;
        }
        str1 = str1.trim();
        str2 = str2.trim();
        str3 = str3.trim();
        return str1.equalsIgnoreCase(str2) && str2.equalsIgnoreCase(str3);
    }
}
