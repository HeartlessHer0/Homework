package main.Students;

public class Program {
    public static void main(String[]args){
        Student[] student = new Student[14];
        boolean sort = true;

        for(int i = 0;i<14;i++){
            student[i]= new Student();
            student[i].displayInfo();
        }
       /* int buffer = 0;
        int j = 0;
        while(sort) {
            sort = false;
            for (j = 0; j < student.length-2; j++) ;
            if (student[j].score > student[j+1].score) {              Данная сортировка не работает(
                buffer= student[j].score;                             Поэтому делал через 3 цикла
                student[j].score=student[j+1].score;
                student[j+1].score=buffer;
                sort=true;
            }
        }*/
        System.out.println("Список отличников:");
        for(int i = 0;i<14;i++){
            if(student[i].score>8)
            student[i].sortedScore();
        }
        System.out.println("Список хорошистов:");
        for(int i = 0;i<14;i++){
            if(student[i].score>3&student[i].score<9)
            student[i].sortedScore();
        }
        System.out.println("Список двоечников:");
        for(int i = 0;i<14;i++){
            if(student[i].score<4)
            student[i].sortedScore();
        }
    }
}
