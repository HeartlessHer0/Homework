package main.ObrabotkaStrok;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] strMass = new String[size];
        for (int i = 0; i < size; i++)
            strMass[i] = scan.next();
        String strMax = strMass[0];
        String strMin = strMass[0];
        for (int j = 1; j < size; j++) {
            if (strMass[j].length() < strMin.length())
                strMin = strMass[j];
            if (strMass[j].length() > strMax.length())
                strMax = strMass[j];
        }
        StringBuilder builder = new StringBuilder("Result: ");
        builder.append("min String is ").append(strMin).append(" size is ").append(strMin.length());
        builder.append("\n     max String is ").append(strMax).append(" size is ").append(strMax.length());
        System.out.println(builder.toString());
    }
}
