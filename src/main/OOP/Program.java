package main.OOP;

public class Program {
    public static void main(String[] args) {
        int i = 0;
        Week week[] = Week.values();
        while (i < 7) {
            System.out.print(week[i]);
            if(i<5) System.out.println(" - weekday.");
            else System.out.println(" - weekend.");
            i++;
        }
    }
}
