package ru.job4j.job4j.io;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Добро пожаловать, как Вас зовут?");
        String name = input.nextLine();
        System.out.println(name + ", рад Вас видеть!");
    }
}
