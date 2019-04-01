package ua.nure.timoshenko.practice1;

public class Demo {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~Part1~~~~~~~~~");
        Part1.main(new String[]{});
        System.out.println("~~~~~~~~~Part2~~~~~~~~~");
        Part2.main(new String[]{"45", "3"});
        System.out.println("~~~~~~~~~Part3~~~~~~~~~");
        Part3.main(new String[]{"Part", "3", "print", "space"});
        System.out.println("~~~~~~~~~Part4~~~~~~~~~");
        Part4.main(new String[]{"30", "35"});
        System.out.println("~~~~~~~~~Part5~~~~~~~~~");
        Part5.main(new String[]{"32134"});
        System.out.println("~~~~~~~~~Part6~~~~~~~~~");
        Part6.main(new String[]{"10"});
        System.out.println();
        System.out.println("~~~~~~~~~Part7.1 and 7.2~~~~~~~~~");
        Part7.main(new String[]{});
        System.out.println("~~~~~~~~~Part7.3 ~~~~~~~~~");
        Part7.main2(new String[]{"A", "B", "Z", "AA", "AZ", "BA", "ZZ", "AAA"});
    }

}
