public class Intersection {

    /**
     * 9. Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел
     * и возвращает массив общих элементов.
     * <p>
     * Test Data:
     * {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
     * {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
     * {1, 2, 4, 5, 89}, {8, 9, 45} → {}
     */

    public int[] intersection(int[] array1, int[] array2) {
        int count = 0;

        for (int value : array1) {
            for (int i : array2) {
                if (value == i) {
                    count++;
                }
            }
        }
        int[] result = new int[count];
        count = 0;

        for (int k : array1) {
            for (int i : array2) {
                if (k == i) {
                    result[count] = i;
                    count++;
                }
            }
        }

        return result;
    }
}

