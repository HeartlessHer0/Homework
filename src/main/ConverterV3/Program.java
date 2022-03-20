package main.ConverterV3;
import java.util.Scanner;
public class Program {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        BaseConvert converter = new BaseConvert();
        System.out.println("Введите t:" );
        int t = scan.nextInt();
        converter.convert(t);
    }
}
