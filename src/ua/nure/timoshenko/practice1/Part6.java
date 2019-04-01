package ua.nure.timoshenko.practice1;

public class Part6 {

    private static final int START = 2;


    public static void main(String[] args) {
        int count = START;
        int arrayLength = Integer.parseInt(args[0]);
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            while (!checkNumberIsPrime(count)) {
                count++;
            }
            array[i] = count;
            count++;
        }
        for (int i : array) {
            System.out.print(i + " ");
        }


    }

    public static boolean checkNumberIsPrime(int number) {
        boolean result = false;
        if ((number > 1) && ((number == START) || (number == (START+1)))) {
                result = true;
            } else {
                for (int i = START; i <= (number / START); i++) {
                    if ((number % i) != 0) {
                        result = true;
                   }  else {
                        result = false;
                        break;
                    }
                }
            }
            return result;
    }


}

