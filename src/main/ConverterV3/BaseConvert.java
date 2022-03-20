package main.ConverterV3;

public class BaseConvert {
    private double conv1 = 0;
    private double conv2 = 0;
    public void convert(int temp){
        conv1 =temp*1.8+32;
        conv2 =temp+273.15;
        System.out.println("В F: " + conv1);
        System.out.println("В K: " + conv2);
    }
}
