public class MultiplуArrayByNumber {

    /**
     * 1.1. 5. Написать метод multiplуArrayByNumber(), который принимает на вход массив
     * целых чисел и число int number. Метод возвращает массив тех же чисел,
     * умноженных на number
     * Например, multiplуArrayByNumber()({1, 2, 3, 4, 5}, 3) -> {3, 6, 9, 12, 15}
     */

    public int[] multiplуArrayByNumber(int[] array, int number) {
        if (array.length != 0) {
            int[] multiplуArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                if (Math.abs(array[i]) * Math.abs(number) <= Integer.MAX_VALUE) {
                    multiplуArray[i] = array[i] * number;
                }
            }

            return multiplуArray;
        }
        return array;
    }
}
