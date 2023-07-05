public class NegativeOnTheRight {

    /**
     * 13.2. Написать алгоритм NegativeOnTheRight, который принимает на вход массив целых
     * чисел, и возвращает массив,  в котором все негативные числа находятся во второй
     * половине массива (массив не должен быть отсортирован)
     * Test Data:
     * {4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}
     */

    public int[] negativeOnTheRight(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }
        int[] negativeNumbers = new int[count];
        int[] positiveNumbers = new int[array.length - count];
        for (int i = 0, n = 0, p = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeNumbers[n] = array[i];
                if (n < negativeNumbers.length - 1) {
                    n++;
                }
            } else {
                positiveNumbers[p] = array[i];
                if (p < positiveNumbers.length - 1) {
                    p++;
                }

            }
        }
        int[] negativeOnTheRight = new int[array.length];
        int i = 0;

        for (int p = 0; p < positiveNumbers.length; p++) {
            negativeOnTheRight[i] = positiveNumbers[p];
            if (i < negativeOnTheRight.length - 1) {
                i++;
            }
        }
        for (int n = 0; n < negativeNumbers.length; n++) {
            negativeOnTheRight[i] = negativeNumbers[n];
            if (i < negativeOnTheRight.length - 1) {
                i++;
            }
        }

        return negativeOnTheRight;
    }
}
