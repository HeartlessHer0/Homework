package main.Converter;

class TempKelv implements BaseConvert{

double b = 0;
    @Override
    public void convert(int temp) {
        b = temp+273.15;
        System.out.println("Температура по Кeльвину: "+ b);
    }

}
