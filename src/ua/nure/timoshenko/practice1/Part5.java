package ua.nure.timoshenko.practice1;

public class Part5 {

    public static final int BASE_NUMBERS_SYSTEM = 10;

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int sum=0;
        while(number != 0){
            sum += (number % BASE_NUMBERS_SYSTEM);
            number/= BASE_NUMBERS_SYSTEM;
        }
        System.out.println(sum);
    }
}
