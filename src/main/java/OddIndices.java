public class OddIndices {

    /**
     * Написать алгоритм OddIndices, который принимает массив целых чисел,  и возвращает
     * массив значений нечетных индексов
     * Test Data:
     * Input = {-45, 590, 234, 985, 12, 68}
     * Expected Result =  {590, 985, 68}
     */

    public int[] oddIndices(int[] array) {

        if (array.length != 0) {
            int count = 0;
            for (int i = 1; i < array.length; i += 2) {
                count++;
            }
            int[] arrayOddIndices = new int[count];
            for (int i = 0, j = 1; i < arrayOddIndices.length; i++, j += 2) {
                arrayOddIndices[i] = array[j];
            }

            return arrayOddIndices;
        }

        return array;
    }
}
