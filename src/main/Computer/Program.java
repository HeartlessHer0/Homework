package main.Computer;
import java.util.Scanner;
public class Program {
    public static void main(String[]args) {
        int count =2;
        int onoff;
        boolean ended = true;
        Scanner scanner = new Scanner(System.in);
        Computer comp1 = new Computer("AMD Ryzen 7", 16, 500);
        comp1.displayInfo();

    while(ended){
        System.out.print("Включение. Введите число(0 или 1) ");
        onoff = scanner.nextInt();
        comp1.Comp_On(onoff);
        System.out.print("Выключение. Введите число(0 или 1) ");
        onoff = scanner.nextInt();
        comp1.Comp_Off(onoff);
        comp1.Check();
        if(count==comp1.n/comp1.fullcycles)
            break;


    }
  }
}
