package main.HomeworkVenicles;

class Civil extends Air {
    private int numberofpassengers;
    private boolean businessclass;
    protected Civil(int enginepower, int maxspeed, double weight, String brand, int wingspan, int minrunway, int numberofpassengers, boolean businessclass) {
        super(enginepower, maxspeed, weight, brand, wingspan, minrunway);
        this.numberofpassengers = numberofpassengers;
        this.businessclass = businessclass;
    }
    public void displayInfo(){
        System.out.println("Гражданский авиатранспорт: ");
        System.out.print("Мощность двигателя "+getEnginepower()+ " л.с. ");
        System.out.print("Максимальная скорость "+getMaxspeed()+ " км/ч. ");
        System.out.print("Масса "+getWeight()+" кг. ");
        System.out.print("Марка "+getBrand()+". ");
        System.out.print("Размах крыла "+getWingspan()+" м. ");
        System.out.print("Минимальная длинна взлетно-посадочной полосы "+getMinrunway()+" м. ");
        System.out.print("Количество мест для пассажиров "+numberofpassengers+". ");
        System.out.print("Наличие бизнес-класса "+businessclass+". ");
        System.out.println("Мощность в киловаттах "+getEnginepower()*0.74+" кВ. ");
    }
    public void passengercheck(int passengers){
        if(passengers<=numberofpassengers){
            System.out.println("Самолёт загружен. Количество оставшихся мест "+ (numberofpassengers-passengers)+ ".");
        }
        else {
            System.out.println("Вам нужен другой самолет.");
        }
    }
}
