package main.Converter;

class TempFar implements BaseConvert{

    double с = 0;
    @Override
    public void convert(int temp) {
        с = temp*1.8+32;
        System.out.println("Температура по Фаренгейту: "+ с);
    }
}

