public class FizzBuzz {

    public String[] fizzBuzz(int start, int end) {
        if (start <= end) {
            String[] arr = new String[end - start + 1];
            int number = start;
            for (int i = 0; i < arr.length && number <= end; i++) {
                if (number % 15 == 0) {
                    arr[i] = "FizzBuzz";
                } else if (number % 3 == 0) {
                    arr[i] = "Fizz";
                } else if (number % 5 == 0) {
                    arr[i] = "Buzz";
                } else {
                    arr[i] = String.valueOf(number);
                }
                number++;
            }

            return arr;
        }

        return new String[0];
    }

}
