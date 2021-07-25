package exercise;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scan.next();
        System.out.println(String.format("I am returning to java %s%n", 27));
        System.out.println(String.format("My name is  %s%n", name));
        firstAbonent("1", "Алексей", "Петров", 25, "м", "0987654632");
        firstAbonent("2", "Алексей", "Петров", 25, "м", "0987654632");

    }


    public static  void firstAbonent(String number, String name, String lastName, int age, String sex, String phNumber) {
        System.out.println("-----Абонент "+number+"-----");
        System.out.println("Имя"+name);
        System.out.println("Фамилия"+lastName);
        System.out.println("Возраст"+age);
        System.out.println("Пол"+sex);
        System.out.println("Номер"+phNumber);
        System.out.println("\n");
    }
}
