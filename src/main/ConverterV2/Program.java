package main.ConverterV2;
import java.util.Scanner;

public class Program {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите темпетаруру в цельсиях: ");
        int temp = scan.nextInt();

        BaseConvert convertFar = new BaseConvert() {
            @Override
            public void convert(int temp) {
                if(temp<-273){
                    System.out.println("Температура ниже абсолютного нуля");
                }
                else {
                    double conv1 = temp*1.8+32;
                    System.out.println("Температура в Фаренгейтах: "+ conv1);
                }

            }
        };
        convertFar.convert(temp);
        BaseConvert convertKelv = new BaseConvert() {
            @Override
            public void convert(int temp) {
                if(temp<-273){
                    System.out.println("Температура ниже абсолютного нуля");
                }
                else {
                    double conv2 = temp+273.15;
                    System.out.println("Температура в Кельвинах: "+ conv2);
                }
            }
        };
        convertKelv.convert(temp);
    }
}
