package main.ObrabotkaStrok;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int middle = 0;
        String[] strMass = new String[size];
        for (int i = 0; i < size; i++) {
            strMass[i] = scan.next();
            middle += strMass[i].length();
            if (i == size - 1) middle /= size;
        }
        StringBuilder builder = new StringBuilder("Result: ");
        for (String buffer : strMass) {
            if (buffer.length() >= middle) builder.append("\n - ").append(buffer).append(" : ").append(buffer.length());
        }
        System.out.println(builder.toString());
    }
}
