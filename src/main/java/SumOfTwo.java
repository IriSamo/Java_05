public class SumOfTwo {

    /**
     * 14. Написать алгоритм SumOfTwo, который принимает на вход массив целых чисел,
     * и число n. Алгоритм возвращает пары элементов, которые в сумме дают число n.
     * Test Data:
     * ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}}
     */

    public int[][] sumOfTwo(int[] array, int sum) {
        if (array != null && array.length > 0) {
            int count = 0;
            int[] copyArray = array;

            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] + array[j] == sum && (array[i] != sum || array[j] != sum)) {
                        count++;
                        int[] temp = new int[array.length - 2];
                        for (int l = 0, k = 0; l < array.length; l++) {
                            if (l != i && l != j) {
                                temp[k] = array[l];
                                if (k < temp.length - 1) {
                                    k++;
                                }
                            }
                        }
                        array = temp;
                        i = 0;
                        break;
                    }
                }
            }
            int[][] sumOfTwo = new int[count][2];
            for (int i = 0, s = 0; i < copyArray.length - 1; i++) {
                for (int j = i + 1; j < copyArray.length; j++) {

                    if (copyArray[i] + copyArray[j] == sum && (copyArray[i] != sum || copyArray[j] != sum)) {
                        sumOfTwo[s][0] = copyArray[i];
                        sumOfTwo[s][1] = copyArray[j];
                        if (s < count - 1) {
                            s++;
                        }
                        int[] temp = new int[copyArray.length - 2];
                        for (int l = 0, k = 0; l < copyArray.length; l++) {
                            if (l != i && l != j) {
                                temp[k] = copyArray[l];
                                if (k < temp.length - 1) {
                                    k++;
                                }
                            }
                        }
                        copyArray = temp;
                        i = 0;
                        break;
                    }
                }
            }

            return sumOfTwo;
        } else {

            return new int[0][0];
        }
    }
}
