package ua.nure.timoshenko.practice1;

public class Part7 {

    private static final int NUMBER_ENG_CHAR = 26;
    private static final int START_ENG_UNICODE = 64;
    private static final String ARROW = " ==> ";

    public static int str2int(String number) {
        int result = 0;
        for (int i = 1, j = number.length(); j > 0; i++, j--) {

            result += (number.charAt(number.length() - i) - START_ENG_UNICODE)
                    * Math.pow(NUMBER_ENG_CHAR, (number.length() - j));
        }
        return result;
    }

    public static String int2str(int number) {
        StringBuilder chars = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int mod;
        int div = number;
        while (div != 0) {
            mod = div % NUMBER_ENG_CHAR;
            if (mod == 0) {
                chars.append((char) (mod + START_ENG_UNICODE + NUMBER_ENG_CHAR));
                div = (div - 1) / NUMBER_ENG_CHAR;
            } else {
                chars.append((char) (mod + START_ENG_UNICODE));
                div = (div - mod) / NUMBER_ENG_CHAR;
            }
        }
        for (int i = 0; i < chars.length(); i++) {
            result.append(chars.charAt(chars.length() - i - 1));
        }
        return result.toString();

    }

    public static String rightColumn(String number) {
        StringBuilder chars = new StringBuilder();
        int num;
        num = str2int(number);
        num++;
        chars.append(int2str(num));
        return chars.toString();
    }

    public static void main(String[] args) {
        String[] str = new String[]{"A", "B", "Z", "AA", "AZ", "BA", "ZZ", "AAA"};
        for (String s : str) {
            System.out.println(s + ARROW + str2int(s) + ARROW + int2str(str2int(s)));
        }
    }

    public static void main2(String[] args) {
        for (String arg : args) {
            System.out.println(arg + ARROW + rightColumn(arg));
        }
    }
}
