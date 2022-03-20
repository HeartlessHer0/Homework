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
            if (student[j]> student[j+1]) {
                buffer= student[j];
                student[j]=student[j+1];
                student[j+1]=buffer;
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
