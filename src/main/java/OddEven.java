public class OddEven {

    /**
     * В классе OddEven создать алгоритм oddEven(), который принимает на вход целое число,
     * возвращает “Odd”,  если число нечетное, и “Even”, если число четное.
     * <p>
     * Test Data:
     * -345 →  “Odd”
     * 0 →  “Even”
     * 222222 →  “Even”
     */

    public String oddEven(int number) {
        if (number % 2 == 0) {

            return "Even";
        }
        return "Odd";
    }


}
