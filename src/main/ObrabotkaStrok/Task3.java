package main.ObrabotkaStrok;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = 3;
        String[] strMass = new String[size];
        for (int i = 0; i < size; i++)
            strMass[i] = scan.next();
        StringBuilder builder = new StringBuilder("Result: ");
        builder.append("\n -3: ").append(strMass[2]).append("\n -2: ").append(strMass[1].toUpperCase()).append("\n -1: ").append(strMass[0].toLowerCase());
        System.out.println(builder.toString());
    }
}