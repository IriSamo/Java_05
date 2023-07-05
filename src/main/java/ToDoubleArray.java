public class ToDoubleArray {

    /**
     * 1.1. 6. Написать метод toDoubleArray(), который принимает на вход массив целых
     * чисел,  и возвращает массив типа double[] из тех же чисел
     * Например, toDoubleArray({1, 2, 3, 4, 5}) -> {1.0, 2.0, 3.0, 4.0, 5.0}
     */

    public double[] toDoubleArray(int[] array){
        double[] toDoubleArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            toDoubleArray[i] = 1.0 * array[i];
        }
        return toDoubleArray;
    }
}
