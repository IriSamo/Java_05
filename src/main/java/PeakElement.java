public class PeakElement {

    /**
     *  10. Написать алгоритм PeakElement,  который принимает на вход массив целых чисел
     *  и возвращает значения пиковых элементов (элементы, которые больше своих соседей).
     * Test Data:
     * {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
     */

    public int[] peakElement(int[] array) {
        if (array.length > 1) {
            int count = 0;
            int i = 0;
            if (array[0] > array[1]) {
                count++;
            }
            i++;
            for (; i < array.length - 1; i++) {
                if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    count++;
                }
            }
            if (array[array.length - 1] > array[array.length - 2]) {
                count++;
            }

            int[] result = new int[count];
            i = 0;
            int j = 0;
            if (array[0] > array[1]) {
                result[0] = array[0];
                j++;
            }
            i++;
            for (; i < array.length - 1; i++) {
                if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    result[j] = array[i];
                    j++;
                }
            }
            if (array[array.length - 1] > array[array.length - 2]) {
                result[result.length - 1] = array[array.length - 1];
            }

            return result;
        }
        return array;
    }

}
