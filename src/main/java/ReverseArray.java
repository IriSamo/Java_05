public class ReverseArray {

    /**
     *  11. Написать алгоритм ReverseArray, который принимает на вход массив целых чисел,
     *  и возвращает “перевернутый” массив.
     * Test Data:
     * {2, 7, 3, 10} → {10, 3, 7, 2}
     */

    public int[] reverseArray (int[] array) {
        if (array != null || array.length > 0) {
            int[] reversArray = new int[array.length];
            for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
                reversArray[j] = array[i];
            }
            return reversArray;
        }
        return array;
    }

}
