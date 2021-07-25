package exercise;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Second {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        second();
//        third();
//        fourth();
//        fives();
//        six();
//        seven();
//        eigth();
//        nine();
//        ten();
        eleven();

    }


    public static void first() {
        int bigInt = 2_147_483_647;
        System.out.println(bigInt);
        bigInt++;
        System.out.println(bigInt);
    }

    public static void second() {
        int n = 5;
        int m = 3;
        var div = n / m;
        System.out.println(n);
        System.out.println(m);
        System.out.println(div);

    }

    public static void third() {
        int digits = 365;
        var a = String.valueOf(digits);
        System.out.println(a.substring(0, 1));
        System.out.println(a.substring(1, 2));
        System.out.println(a.substring(2, 3));
    }

    public static void fourth() {
        String trigger = "";
        while (!trigger.equals("stop")) {
            System.out.println("Enter the number");
            var a = scanner.nextInt();
            if (a % 2 == 0)
                System.out.println("this is even number");
            else
                System.out.println("this is odd number");
            System.out.println("Enter \'stop\' if you wanna break");
            trigger = scanner.next();
        }
    }

    public static void fives() {
        int i = 1;
        while (i != 10) {
            System.out.println(i);
            i++;
        }
        i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
    }

    public static void six() {
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
            System.out.println(array[i]);
        }

    }

    public static void seven() {
        int[] s = new int[3];
        for (int i = 0; i <= 2; i++) {
            int size = scanner.nextInt();
            s[i] = size;
        }
        System.out.println(s.length);
        Arrays.sort(s);
        System.out.println("Minimun = " + s[0]);
        System.out.println("Medium = " + s[1]);
        System.out.println("Maximum = " + s[2]);
    }

    public static void eigth() {
        int[] s = new int[3];
        for (int i = 0; i <= 2; i++) {
            int size = scanner.nextInt();
            s[i] = size;
        }
        System.out.println(s.length);
        System.out.println(Arrays.stream(s).max());
        System.out.println(Arrays.stream(s).min());
    }

    public static void nine() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a);
        System.out.println(b);
        b = a - b;
        a = a - b;
        b = b + a;
        System.out.println(a);
        System.out.println(b);
    }

    public static void ten() {
        DecimalFormat df2 = new DecimalFormat("#.##");
        int a = scanner.nextInt();
        double b = (Double.valueOf(a) * 5) / 100;
        System.out.println(a);
        System.out.println(df2.format(b));
        double c = Double.valueOf(a) - b;
        System.out.println(c);
    }

    public static void eleven() {
        int[] arr = {4, 3, 4, 77, 5, 9, 77, 9, 5, 4, 3, 9};

        for (int i : arr) {
            int j = 0;
            for (int k : arr) {
                if (i == k) {
                    j++;
                }
            }
            if (j == 3) {
                System.out.println("the odd number is " + i);

            }


        }
    }

}


