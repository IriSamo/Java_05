public class MinMaxAve {

    /**
     * 8. Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения
     * индексов. Алгоритм возвращает массив, который содержит минимальное значение,
     * максимальное значение,  и среднее среди всех значений между 2-мя индексами.
     * <p>
     * Test Data:
     * ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
     */

    public int[] minMaxAve(int[] array, int f, int l) {
        if (f > l){
            int n;
            n = f;
            f = l;
            l = n;
        }
        int[] result = new int[3];
        if (array.length > 0) {
            result[0] = array[f];
            result[1] = array[l];
            int count = 0;
            int sum = 0;
            for (int i = f; i <= l; i++) {
                count++;
                sum += array[i];
            }
            result[2] = sum / count;

        } else {

            return result;
        }

        return result;
    }
}
