package main.HomeworkVenicles;

class Passenger extends Ground {
    private String type;
    private int seating;
    protected Passenger(int enginepower, int maxspeed, double weight, String brand, int wheels, double fuelconsuption, String type, int seating) {
        super(enginepower, maxspeed, weight, brand, wheels, fuelconsuption);
        this.type = type;
        this.seating = seating;
    }
    public void displayInfo(){
        System.out.println("Грузовой наземный транспорт: ");
        System.out.print("Мощность двигателя "+getEnginepower()+ " л.с. ");
        System.out.print("Максимальная скорость "+getMaxspeed()+ " км/ч. ");
        System.out.print("Масса "+getWeight()+" кг. ");
        System.out.print("Марка "+getBrand()+". ");
        System.out.print("Количество колес "+getWheels()+". ");
        System.out.print("Расход топлива "+getFuelconsuption()+" л/100 км. ");
        System.out.print("Тип кузова "+type+". ");
        System.out.print("Количество сидячих мест "+seating+". ");
        System.out.println("Мощность в киловаттах "+getEnginepower()*0.74+" кВ. ");
    }
    public void methodnumber1(double time){
        System.out.println("За время "+time+" ч. автомобиль "+ getBrand()+" двигаясь с максимальной скоростью "+ getMaxspeed()+" км/ч проедет " + time*getMaxspeed()+" км и израсходует "+ fuelconsup(getMaxspeed(),time,getFuelconsuption())+" литров топлива");
    }
    private double fuelconsup (double maxspeed, double time, double fuel){
        double f = ((maxspeed*time)/100)*fuel;
        return f;
    }
}
