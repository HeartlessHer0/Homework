package main.ObrabotkaStrok;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = 5;
        boolean check = true;
        StringBuilder[] str = new StringBuilder[n];
        StringBuilder buffer = new StringBuilder(" ");
        for (int i = 0; i < n; i++) {
            System.out.println("Введите строку под индексом " + i + ":");
            str[i] = new StringBuilder(scan.nextLine());
            System.out.println(str[i].toString());
        }
        while (check) {
            check = false;
            for (int j = 0; j < n - 1; j++) {
                if (str[j].length() > str[j + 1].length()) {
                    buffer = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = buffer;
                    check = true;
                }
            }
        }
        StringBuilder builder = new StringBuilder("Result: ");
        builder.append("min String is ").append(str[0]).append(" size is ").append(str[0].length());
        builder.append("\n     max String is ").append(str[n - 1]).append(" size is ").append(str[n - 1].length());
        System.out.println(builder.toString());
    }
}
