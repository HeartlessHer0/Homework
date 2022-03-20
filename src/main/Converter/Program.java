package main.Converter;
import java.util.Scanner;

public class Program {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        TempCels convCels = new TempCels();
        TempFar convFar = new TempFar();
        TempKelv convKelv = new TempKelv();
        int temperaturecelsii = 0;
        int convnumber = 0;
        boolean check = true;
        while (check){
            System.out.println("ВВедите температуру в градусах цельсия: ");
            temperaturecelsii = scan.nextInt();
            System.out.println("В какую величину выполнить конвертацию: \n 1. В кельвины: \n 2. В фаренгейты: \n 3. Закончить программу.");
            convnumber = scan.nextInt();
            if(temperaturecelsii<-273){
                System.out.println("Введенная температута меньше абсолютного нуля. Введите корректное значение.");
                continue;
            }
            if(convnumber==1)
                convKelv.convert(temperaturecelsii);
            else if(convnumber==2)
                convFar.convert(temperaturecelsii);
            else if(convnumber==3)
                check=false;

        }
    }
}
