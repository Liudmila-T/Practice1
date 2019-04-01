package ua.nure.timoshenko.practice1;

public class Part4 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if ((a > 0) && (b > 0)) {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            System.out.println(a);
        } else {
            System.out.println("Error! Enter a positive numbers a and b");

        }
    }
}

