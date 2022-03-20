package main.HomeworkVenicles;

class Cargo extends Ground{
    private int loadcapacity;
    protected Cargo(int enginepower, int maxspeed, double weight, String brand, int wheels, double fuelconsuption, int loadcapacity) {
        super(enginepower, maxspeed, weight, brand, wheels, fuelconsuption);
        this.loadcapacity = loadcapacity;
    }
    public void displayInfo(){
        System.out.println("Легковой наземный транспорт: ");
        System.out.print("Мощность двигателя "+getEnginepower()+ " л.с. ");
        System.out.print("Максимальная скорость "+getMaxspeed()+ " км/ч. ");
        System.out.print("Масса "+getWeight()+" кг. ");
        System.out.print("Марка "+getBrand()+". ");
        System.out.print("Количество колес "+getWheels()+". ");
        System.out.print("Расход топлива "+getFuelconsuption()+" л/100 км. ");
        System.out.print("Грузоподъемность "+loadcapacity+" т. ");
        System.out.println("Мощность в киловаттах "+getEnginepower()*0.74+" кВ. ");
    }
    public void capacitycheck(int capacity){
        if(capacity<=loadcapacity){
            System.out.println("Грузовик загружен. Оставщееся место примерно"+ (loadcapacity-capacity)+ " тонн.");
        }
        else {
            System.out.println("Вам нужен другой грузовик. Перевес примерно "+ (capacity-loadcapacity)+ " тонн.");
        }
    }
}
