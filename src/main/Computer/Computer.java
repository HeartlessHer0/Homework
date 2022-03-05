package main.Computer;
import java.util.Random;
public class Computer {
    Random random = new Random();
    int n = 0;
    String core;
    int ram;
    int rom;
    int fullcycles = 5;

    Computer(String core, int ram, int rom) {
        this.core = core;
        this.rom = rom;
        this.ram = ram;
    }

    void displayInfo() {
        System.out.println(" Процессор: " + core + "\n Оперативная память(Гб): " + ram + "\n Обьем жесткого диска(Гб): " + rom);
    }

    int Comp_On(int on) {
        int rand = random.nextInt(2);
        if (on == rand) {
            System.out.println("Computer started");
            n += 1;
        } else {
            System.out.println("ERROR!!!");
        }
        return n;
    }
    int Comp_Off(int off){
        int rand = random.nextInt(2);
        if (off==rand) {
            System.out.println("Computer off");
            n+=1;
        }
        else {
            System.out.println("ERROR!!!");
        }
        return n;
    }
    int Check(){
        if(n/fullcycles>=2) {
            System.out.println("Resource is exhausted");
        }

        return n;
    }

}
