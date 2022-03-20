package main.HomeworkVenicles;

public class Program {
    public static void main(String []args){
        Passenger passenger = new Passenger(200,220,1300,"BMW",4,8,"Hatchback",4);
        passenger.displayInfo();
        passenger.methodnumber1(2.1);
        Cargo cargo = new Cargo(1090, 230,4300,"MAN",10,22,17);
        cargo.displayInfo();
        cargo.capacitycheck(19);
        Civil civil = new Civil(3000,1000,5000,"Airbus",100,300,50,true);
        civil.displayInfo();
        civil.passengercheck(48);
        Military military = new Military(2000,1900,2000,"F-15",40,200,true,4);
        military.displayInfo();
        int count = 1;
        for(int i = 0; i <6; i ++){
           count=military.shoot(count);
        }
        military.catapultcheck(military.getCatapultsystem());
    }
}
