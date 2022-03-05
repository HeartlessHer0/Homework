package main.Students;
import java.util.Random;
public class Student {
    String[]names ={"Петя","Вася","Лена","Витя","Саша","Катя", "Лера","Оля","Женя","Юра","Коля","Стёпа","Вика","Денис","Мила","Настя","Даша","Костя"};
    Random random = new Random();
    String name= " ";
    int score;
    String group;
    Student(){
        name=names[random.nextInt(names.length)];
        group="QA18";
        score= random.nextInt(10)+1;

    }
    void displayInfo(){
        System.out.println("Имя студента: "+ name);
        System.out.println("Группа: "+ group);
        System.out.println("Отметка за диплом:"+ score);
        System.out.println(" ");
    }
    void sortedScore(){
        if(score>8)
            System.out.println(name+" отличник с отметкой "+score);
        if(score>3&score<9)
            System.out.println(name+" хорошист с отметкой "+score);
        if(score<4)
            System.out.println(name+" двоечник с отметкой "+score);
    }
}
