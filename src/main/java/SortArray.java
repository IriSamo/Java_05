public class SortArray {

    /**
     *  12. Написать алгоритм SortArray, который принимает на вход массив целых чисел,
     *  и сортирует элементы массива в порядке возрастания.
     * Test Data:
     * {4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}
     */

    public int[] sortArray(int[] array){
        int[] sortArray = new int[array.length];
        int min = Integer.MAX_VALUE;
        int x = 0;

        for (int j = 0; j < sortArray.length; j++) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                    x = i;
                }
            }
            sortArray[j] = min;
            int[] temp = new int[array.length-1];
            for (int i = 0, k = 0; i < array.length; i++){
                if (i != x ){
                    temp[k] = array[i];
                    if (k < temp.length - 1) {
                        k++;
                    }
                }
            }
            array = temp;
            min = Integer.MAX_VALUE;
        }
        return sortArray;
    }

}

