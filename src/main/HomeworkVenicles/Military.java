package main.HomeworkVenicles;

class Military extends Air {
    private boolean catapultsystem;
    private int numberofrockets;
    protected Military(int enginepower, int maxspeed, double weight, String brand, int wingspan, int minrunway, boolean catapultsystem, int numberofrockets) {
        super(enginepower, maxspeed, weight, brand, wingspan, minrunway);
        this.catapultsystem = catapultsystem;
        this.numberofrockets = numberofrockets;
    }
    public void displayInfo(){
        System.out.println("Военный авиатранспорт: ");
        System.out.print("Мощность двигателя "+getEnginepower()+ " л.с. ");
        System.out.print("Максимальная скорость "+getMaxspeed()+ " км/ч. ");
        System.out.print("Масса "+getWeight()+" кг. ");
        System.out.print("Марка "+getBrand()+". ");
        System.out.print("Размах крыла "+getWingspan()+" м. ");
        System.out.print("Минимальная длинна взлетно-посадочной полосы "+getMinrunway()+" м. ");
        System.out.print("Наличие системы катапультирования "+catapultsystem+". ");
        System.out.print("Максимальное количество ракет на борту "+numberofrockets+" шт. ");
        System.out.println("Мощность в киловаттах "+getEnginepower()*0.74+" кВ. ");
    }

    public boolean getCatapultsystem() {
        return catapultsystem;
    }

    public int shoot(int count){
        if(count<=numberofrockets) {
            System.out.println("Ракета запущена");
            count++;
        }
        else {
            System.out.println("Боеприпасы отсутствуют");
        }
        return count;
        }
    public void catapultcheck(boolean check){
        if(check==true){
            System.out.println("Система катапультирования готова");
        }
        else System.out.println("Система катапультирования отсутствует");
    }
}
